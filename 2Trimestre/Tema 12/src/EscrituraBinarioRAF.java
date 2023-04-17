import java.io.IOException;
import java.io.RandomAccessFile;

public class EscrituraBinarioRAF {
    public static void main(String[] args){

        RandomAccessFile raf =null;
        try {
            raf = new RandomAccessFile("prueba.dat", "rw");

            raf.seek(172);

            System.out.println("Posicion actual del puntero: " + raf.getFilePointer());
            System.out.println("Longitud total de bytes del fichero: " + raf.length());


            raf.seek(raf.length());
            raf.writeChars("HOLA");

            for(int i = 186; i <= 32; i++ ){
                System.out.println(raf.readChar());
            }
            
        } catch (IOException e) {
            System.out.println(e.toString());
        }finally{
            try {
                raf.close();
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    
    }
    
}
