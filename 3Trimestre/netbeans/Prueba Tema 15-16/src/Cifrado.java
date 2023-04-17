package cifrado;

import java.util.Scanner;

public class Cifrado{

    public static String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args){

        Scanner sn=null;

        try{
            sn = new Scanner(System.in);
 
            System.out.println("Dame una frase");
            String frase = sn.nextLine();

            System.out.println("Dame una clave");
            int clave = sn.nextInt();
            
            String texto = codificar(frase, clave);
            System.out.println("Texto codificado: " + texto);
            
            texto = descodificar(texto, clave);
            System.out.println("Texto descodificado: " + texto);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                sn.close();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static String codificar(String texto, int clave){
        String textoCodificado = "";
    
        texto = texto.toUpperCase();
    
        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
    
            int pos = letras.indexOf(caracter);
    
            if(pos == -1){
                textoCodificado += caracter;
            }else{
                textoCodificado += letras.charAt( (pos + clave) % letras.length() );
            }
    
        }
        
        return textoCodificado;
    }

    public static String descodificar(String texto, int clave){
        String textoDescodificado = "";
     
        texto = texto.toUpperCase();
     
        char caracter;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
     
            int pos = letras.indexOf(caracter);
     
            if(pos == -1){
                textoDescodificado += caracter;
            }else{
                if(pos - clave < 0){
                    textoDescodificado += letras.charAt( letras.length() + (pos - clave) );
                }else{
                    textoDescodificado += letras.charAt( (pos - clave) % letras.length() );
                }
            }
     
        }
     
        return textoDescodificado;
    }
}

