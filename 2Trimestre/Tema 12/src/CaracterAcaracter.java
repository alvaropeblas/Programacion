import java.io.FileReader;
import java.io.IOException;

public class CaracterAcaracter {
    public static void main(String[] args) throws Exception {
        FileReader  fr = null;
        try {
            fr = new FileReader("archivo.txt");
            int data = fr.read();
            int res = 0;
            while (data != -1) {
                res = res + data;
                /* System.out.print((char)data); */
                data = fr.read();
            }
            System.out.println(res);
        } catch (IOException e) {
            System.out.println("Error leyendo el fichero: " + e.toString());
        }
        fr.close();
    }
}
