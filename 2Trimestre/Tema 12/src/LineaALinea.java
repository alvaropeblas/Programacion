import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineaALinea {
    public static void main(String[]args) throws IOException {


        FileReader  fr = null;

        BufferedReader br = null; 
        
        try {

            String linea;

            fr = new FileReader("archivo.txt");
            
            br = new BufferedReader(fr);
           
            
            while ((linea = br.readLine()) != null) {

                System.out.println(linea);

            }

        } catch (IOException e) {

            System.out.println("Error leyendo el fichero: " + e.toString());

        }

        fr.close();

        br.close();
        
    }
    }

