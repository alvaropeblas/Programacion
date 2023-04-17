import java.util.Scanner;

public class Main {
    public static String abecedario = "ABCDEFGHIJLMNOPQRSTUVWXYZ";
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("dame una frase");
            String frase = sc.nextLine().toUpperCase();
            System.out.println("Dame una clave ");
            int clave = sc.nextInt();
            codificar(frase, clave);
            System.out.println("La frase codificada es: " + frase);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static String codificar(String texto, int num){
        String fraseCodificada = "";
        char caracter;
        for(int i = 0; i < texto.length(); i++){
            caracter = texto.charAt(i);
            
        }
        return fraseCodificada;
    }
}
