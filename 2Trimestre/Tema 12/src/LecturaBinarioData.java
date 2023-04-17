import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class LecturaBinarioData {
    public static void main(String[]args){
        FileInputStream fichero = null;
        DataInputStream flujosalida = null;

        try {
            fichero = new FileInputStream("prueba.dat");
            flujosalida = new DataInputStream(fichero);

            System.out.println("Nº de Bytes: " + flujosalida.available());

            while(flujosalida.available() > 0){

                for(int i = 1; i <=26; i++){
                    System.out.println(flujosalida.readChar());
                }
            
            System.out.println("Nº de Bytes: " + flujosalida.available());

                for(int x = 0; x<=25; x++){
                    System.out.println(flujosalida.readInt());
                }

            System.out.println("Nº de Bytes: " + flujosalida.available());

            System.out.println(flujosalida.readDouble()); 
           System.out.println(flujosalida.readDouble()); 

            System.out.println("Nº de Bytes: " + flujosalida.available());

                for(int l = 1; l <=7; l++){
                   System.out.println(flujosalida.readChar()); 
                }
                System.out.println("Nº de Bytes: " + flujosalida.available());
        }
        } catch (IOException e) {
           System.out.println(e.toString());
   }
   finally{
    try {
        fichero.close();
        flujosalida.close();
    } catch (IOException e) {
        System.out.println(e.toString());
    }
   }
}
}
