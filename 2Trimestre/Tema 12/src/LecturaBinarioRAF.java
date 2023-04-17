import java.io.IOException;
import java.io.RandomAccessFile;

public class LecturaBinarioRAF {
    public static void main(String[] args){
        RandomAccessFile raf = null;

        try {
            
            raf = new RandomAccessFile("prueba.dat", "r");

            raf.seek(172);
            System.out.println("Posicion actual del puntero: " + raf.getFilePointer());

            for(int i = 0; i < 7; i++){
                System.out.println(raf.readChar());
            }

            System.out.println("Posicion actual del puntero: " + raf.getFilePointer());

            for(int i = 0; i < 4; i++){
                System.out.println(raf.readChar());
            }


        } catch (IOException e) {
            System.out.println(e.toString());
        }finally{
            try{
                raf.close();
            }catch(IOException e){
                System.out.println(e.toString());
            }
        }
    }
    
}
