/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author MEDAC
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiniDiccionario miniDiccionario = new MiniDiccionario();
        Scanner sc = new Scanner(System.in);

        int aciertos = 0;
        int errores = 0;

        for (int i = 0; i < 5; i++) {
            String palabra = miniDiccionario.palabraAzar(); // metodo palabraAzar() para obtener una palabra aleatoria
            String traduccion = miniDiccionario.traducirPalabra(palabra); // método traducirPalabra() para traducir una
                                                                          // palabra

            System.out.println("Palabra " + (i + 1) + ": " + palabra); // imprume el número de la palabra y la palabra
                                                                       // en español
            System.out.print("Traducción: "); // pide al usuario que introduzca la traducción en inglés
            String respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase(traduccion)) { // compara la respuesta del usuario con la traducción correcta
                                                          // (ignorando mayúsculas/minúsculas)
                System.out.println("¡Correcto!");
                aciertos++; // Contador de respuestas correctas
            } else {
                System.out.println("¡Incorrecto! La respuesta correcta es: " + traduccion);
                errores++; // contador de respuestas incorrectas
            }
        }
        System.out.println("Has acertado: " + aciertos + " palabras");
        System.out.println("Has fallado: " + errores + " palabras");

        sc.close();
    }
    
}
