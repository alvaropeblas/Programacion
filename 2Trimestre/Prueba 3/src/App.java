import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<String> texto;
    static ArrayList<Character> textodos;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int caso;
        do {
            System.out.println("Introduzca 1: Copia contenido de los dos ficheros");
            System.out.println("Introduzca 2: Copiar vocales");
            System.out.println("Introduzca 3: Mostrar contenido");
            System.out.println("Introduzca 0 para salir");
            caso = sc.nextInt();
            switch (caso) {
                case 1:
                    System.out.println("Introduzca la ruta del primer fichero");
                    String f1 = sc.next();
                    System.out.println("Introduzca la ruta del segundo fichero");
                    String f2 = sc.next();
                    leerFichero(f1, f2);
                    añadirAlfichero(texto);
                    break;

                case 2:
                    lecturaBinaria();
                    escrituraBi(textodos);
                    break;

                case 3:
                    System.out.println("Introduzca 1 para contenido");
                    System.out.println("Introduzca 2 para vocales");
                    int cas = sc.nextInt();

                    switch (cas) {
                        case 1:
                            leerUno();
                            break;

                        case 2:
                            leerDos();
                            break;

                        default:
                            break;
                    }

                    break;

                default:
                    break;
            }
        } while (caso != 0);
        sc.close();
    }

    /**
     * Lee dos archivos y almacena su contenido en un ArrayList
     * 
     * @param f1 El primer archivo que se lee.
     * @param f2 El segundo archivo que se lee.
     */
    public static void leerFichero(String f1, String f2) {
        FileReader fr = null;

        BufferedReader br = null;
        FileReader fl = null;

        BufferedReader ff = null;
        texto = new ArrayList<String>();

        try {

            String linea;

            fr = new FileReader(f1);

            br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {

                texto.add(linea);

            }
            String lineados;

            fl = new FileReader(f2);

            ff = new BufferedReader(fl);

            while ((lineados = ff.readLine()) != null) {

                texto.add(lineados);

            }

        } catch (IOException e) {

            System.out.println("Error leyendo el fichero: " + e.toString());

        }

        finally {
            try {
                br.close();
                fl.close();
                ff.close();
                fr.close();
            } catch (IOException e2) {
                System.out.println("Error leyendo el fichero: " + e2.toString());
            }
        }

    }

    /**
     * Toma una ArrayList de cadenas y las escribe en un archivo
     * 
     * @param text El texto que se escribirá en el archivo.
     */
    public static void añadirAlfichero(ArrayList<String> text) {
        FileWriter fichero = null;

        PrintWriter pw = null;

        try {
            /* Ponemos true para que no machaque el archivo */
            fichero = new FileWriter("unionContenido.txt");
            pw = new PrintWriter(fichero);
            for (String linea : text) {
                pw.print(linea);
            }
        } catch (IOException e) {
            System.out.println("Error escribiendo el fichero: " + e.toString());
        }

        finally {
            try {
                pw.close();
                fichero.close();

            } catch (IOException e2) {
                System.out.println("Error cerrando el fichero: " + e2.toString());
            }
        }

    }

    /**
     * Lee un archivo y lo almacena en una matriz
     */
    public static void lecturaBinaria() {

        textodos = new ArrayList<>();

        FileReader fr = null;
        try {
            fr = new FileReader("unionContenido.txt");
            int data = fr.read();
            while (data != -1) {

                data = fr.read();
                textodos.add((char) data);
            }
            System.out.print(textodos);
        } catch (IOException e) {
            System.out.println("Error leyendo el fichero: " + e.toString());
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                System.out.println("Error leyendo el fichero: " + e.toString());
            }
        }
    }

   /**
    * Escribe las vocales de un archivo de texto a otro archivo de texto
    * 
    * @param text ArrayList<Character>
    */
    public static void escrituraBi(ArrayList<Character> text) {
        FileOutputStream fichero = null;
        DataOutputStream flujosalida = null;
        try {
            fichero = new FileOutputStream("unionVocales.dat");
            flujosalida = new DataOutputStream(fichero);

            for (Character character : text) {
                if (character == 'a') {
                    flujosalida.writeChar(character);
                } else if (character == 'e') {
                    flujosalida.writeChar(character);
                } else if (character == 'i') {
                    flujosalida.writeChar(character);
                } else if (character == 'o') {
                    flujosalida.writeChar(character);
                } else if (character == 'u') {
                    flujosalida.writeChar(character);
                }
            }
        } catch (IOException e) {
            System.out.println("Error leyendo el fichero: " + e.toString());
        } finally {
            try {
                flujosalida.close();
                fichero.close();
            } catch (IOException e) {
                System.out.println("Error cerrando el fichero: " + e.toString());
            }
        }

    }

    /**
     * Lee un archivo y lo imprime en la pantalla
     */
    public static void leerUno() {
        FileReader fr = null;

        BufferedReader br = null;

        try {

            String linea;

            fr = new FileReader("unionContenido.txt");

            br = new BufferedReader(fr);
            linea = br.readLine();

            System.out.println(linea);

        } catch (IOException e) {

            System.out.println("Error leyendo el fichero: " + e.toString());

        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                System.out.println("Error cerrando el fichero: " + e.toString());
            }
        }

    }
/**
     * Lee un archivo y lo imprime en la pantalla
     */
    public static void leerDos() {
        FileInputStream fichero = null;
        DataInputStream flujosalida = null;
        try {
            fichero = new FileInputStream("unionVocales.dat");
            flujosalida = new DataInputStream(fichero);
            System.out.println("Nº de Bytes: " + flujosalida.available());
            while (flujosalida.available() > 0) {

                for (int i = 1; i <= 14; i++) {
                    System.out.println(flujosalida.readChar());
                }
            }

        } catch (IOException e) {
            System.out.println("Error leyendo el fichero: " + e.toString());
        } finally {
            try {
                flujosalida.close();
                fichero.close();
            } catch (IOException e) {
                System.out.println("Error cerrando el fichero: " + e.toString());
            }
        }
    }
}
