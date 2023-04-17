import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscrituraByteaByte {
    public static void main (String[]args) throws IOException{
        FileOutputStream fichero = null;
        try{
            fichero = new FileOutputStream("prueba.dat");
            //Write escribe byte por byte
            //Escribimos los siguientes numeros
            //00000000, 00000001, 00000011, 00000100, 00000101
            for(int i = 0; i<6; i++){
                fichero.write(i);
            }

            
            fichero.write(15);
            fichero.write(255);
            //Te escribe 0
            fichero.write(256);
            //te escribe 255
            fichero.write(244479);



            String text = "Hello world";
            byte[] mybytes = text.getBytes();
            fichero.write(mybytes);


        }catch(IOException e){
            System.out.println(e.toString());
        }
        //Lectura Byte a Byte

        FileInputStream read = null;
        try{
            read = new FileInputStream("prueba.dat");
            while (read.available() > 0) {
                System.out.println(read.read());
            }
        }catch(IOException e){
            System.out.println(e.toString());
        }

        finally{
            try {
                fichero.close();
                read.close();
            } catch (Exception e) {
               System.out.println(e.toString());
            }
        }
    }
}
