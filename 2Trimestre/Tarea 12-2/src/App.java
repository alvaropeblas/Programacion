import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
       
        int caso;
        do {
            System.out.println("Pulse 1 para cifrar");
        System.out.println("Pulse 2 para descifrar");
        System.out.println("Pulse 3 para salir");
        caso = sc.nextInt();
        sc.nextLine();    
        switch (caso) {
            case 1:
                System.out.println("Introduzca una frase: ");
                String f = sc.nextLine().toUpperCase();
                System.out.println("Introduzca su clave de cifrado: ");
                int n = sc.nextInt();
                escritura(codificarTexto(f,n), "cifrado.txt");
                
                break;
            case 2:
            /* descifrar(f, n, "cifrado.txt"); */
            break;
           
            default:
                break;
        }
            
        } while (caso != 0);
        
        sc.close();
    }
   public static String codificarTexto(String frase, int n){
        char[] abecedario = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        final int max = 26;
        char[] texto = frase.toCharArray();
        char[] fraseCifrada = new char[frase.length()];
        for(int i = 0; i < frase.length(); i++){
          if (String.valueOf(abecedario).contains(String.valueOf(texto[i]))){
            if (((String.valueOf(abecedario).indexOf(String.valueOf(texto[i])))+n) > max) {
                fraseCifrada[i] = abecedario[((String.valueOf(abecedario).indexOf(String.valueOf(texto[i]))) + n) - max];
            }else {
                fraseCifrada[i] = abecedario[((String.valueOf(abecedario).indexOf(String.valueOf(texto[i]))) + n)];
            }
          } else{
            fraseCifrada[i] = texto[i];
          }
           
        }
        return String.valueOf(fraseCifrada);
    }

    public static void escritura(String cif, String direccion) {
        FileWriter fichero= null; 

        try {
            fichero = new FileWriter(direccion);
            for(int i= 0; i < cif.length(); i++){
                fichero.write(cif.charAt(i));
        
            }
        } catch (IOException e) {
            System.out.println("Error escribiendo el fichero: " + e.toString());
        }finally{
            try {
                fichero.close();

            } catch (IOException e2) {
                System.out.println("Error cerrando el fichero: " + e2.toString());
            }
        }
    }

    public static void lectura(String direccion) throws IOException {
        FileReader  fr = null;
        try {
            fr = new FileReader(direccion);
            int data = fr.read();
            while (data != -1) {
                System.out.print((char)data);
                data = fr.read();
            }
        } catch (IOException e) {
            System.out.println("Error leyendo el fichero: " + e.toString());
        }finally{
            try {
                fr.close();
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        
    }

    public static void descifrar(String f, int n, String direccion) throws IOException {
        FileReader  fr = null;
        char[] abecedario = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        final int max = 26;
        char[] texto = f.toCharArray();
        char[] fraseDescifrada = new char[texto.length];
        try {
            fr = new FileReader(direccion);
            int data = fr.read();
            while (data != -1) {
                 /* fraseDescifrada[(char)data]; */
                data = fr.read();
            }
            
            for(int i = 0; i < f.length(); i++){
                if (String.valueOf(abecedario).contains(String.valueOf(texto[i]))){
                  if (((String.valueOf(abecedario).indexOf(String.valueOf(texto[i])))-n) > max) {
                      fraseDescifrada[i] = abecedario[((String.valueOf(abecedario).indexOf(String.valueOf(texto[i]))) - n) - max];
                  }else {
                      fraseDescifrada[i] = abecedario[((String.valueOf(abecedario).indexOf(String.valueOf(texto[i]))) - n)];
                  }
                } else{
                  fraseDescifrada[i] = texto[i];
                }
                 
              }
              System.out.println(String.valueOf(fraseDescifrada));
              
            
        } catch (IOException e) {
            System.out.println("Error leyendo el fichero: " + e.toString());
        }finally{
            try {
                fr.close();
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        
       
        
    }
}
