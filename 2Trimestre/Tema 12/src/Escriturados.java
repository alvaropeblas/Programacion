import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escriturados {
    public static void main(String[]args) throws IOException {


        /*Escribimos en un archivo */
                FileWriter fichero= null;
                /*Escribe en el archivo */
                PrintWriter pw = null; 
        
                try {
                    /*Ponemos true para que no machaque el archivo*/
                    fichero = new FileWriter("prueba.txt", true);
                    pw = new PrintWriter("prueba.txt");
                    for(int i= 0; i < 10; i++){
                        pw.println("Filewriter: linea " + i);
                
                    }
                } catch (IOException e) {
                    System.out.println("Error escribiendo el fichero: " + e.toString());
                }
                
                finally{
                    try {
                        pw.close();
                        fichero.close();
        
                    } catch (IOException e2) {
                        System.out.println("Error cerrando el fichero: " + e2.toString());
                    }
                }
                
        
        /*Leemos el archivo */
                FileReader  fr = null;
        
                BufferedReader br = null; 
                
                try {
        
                    String linea;
        
                    fr = new FileReader("prueba.txt");
                    
                    br = new BufferedReader(fr);
                   
                    
                    while ((linea = br.readLine()) != null) {
        
                        System.out.println(linea);
        
                    }
        
                } catch (IOException e) {
        
                    System.out.println("Error leyendo el fichero: " + e.toString());
        
                }
        
                finally{
                    try {
                        fr.close();
        
                        br.close();
        
                    } catch (IOException e2) {
                        System.out.println("Error leyendo el fichero: " + e2.toString());
                    }
                }
                
            }
}
