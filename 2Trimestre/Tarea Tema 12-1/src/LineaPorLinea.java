import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineaPorLinea {
    public static void main(String[] args) {
        /*Leemos el archivo linea por linea */
FileReader  rd = null;

BufferedReader br = null; 

try {

    String linea;
    //Ruta absoluta del archivo, podoemos utilizar File.separator para que el programa nos reconozca los separadores.
    rd = new FileReader("C:"+File.separator+"Users/MEDAC/Desktop/Tarea Tema 12-1/personas.txt");
    
    br = new BufferedReader(rd);
   
    
    while ((linea = br.readLine()) != null) {

        System.out.println(linea);

    }

} catch (IOException e) {

    System.out.println("Error leyendo el fichero: " + e.toString());

}

finally{
    try {
        rd.close();
        br.close();
    } catch (IOException e2) {
        System.out.println("Error leyendo el fichero: " + e2.toString());
    }
}
    }
    
}
