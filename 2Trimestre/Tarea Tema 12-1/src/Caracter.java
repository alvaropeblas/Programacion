import java.io.FileReader;
import java.io.IOException;

public class Caracter {
    public static void main(String[] args) {
        /*Leemos el archivo Caracter por caracter */
FileReader  fr = null;
try {
    fr = new FileReader("personas.txt");
    int data = fr.read();
    while (data != -1) {
        System.out.print((char)data);
        data = fr.read();
    }
} catch (IOException e) {
    System.out.println("Error leyendo el fichero: " + e.toString());
}
 finally{
    try {
        fr.close();
    } catch (IOException e) {
        System.out.println("Error leyendo el fichero: " + e.toString());
    }
} 
    }
}
