import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binario {
    public static void main(String[]args) {
        FileOutputStream fichero = null;
        DataOutputStream flujodesalida = null;
        try {
            fichero = new FileOutputStream("prueba.dat");
            flujodesalida = new DataOutputStream(fichero);

            for(int i = 0; i < 10; i++){
                flujodesalida.writeUTF("linea");
            }
        } catch (IOException e) {
            System.out.println("Error escribiendo el archivo: " + e.toString());
        }

        finally{
            try {
                fichero.close();

                flujodesalida.close();

            } catch (IOException e2) {
                System.out.println("Error leyendo el fichero: " + e2.toString());
            }
        }
/*Leemos el archivo */
FileInputStream fich = null;
DataInputStream dich2 = null;
                try {
                    fich = new FileInputStream("prueba.dat");
                    dich2 = new DataInputStream(fich);
                    while (dich2.available() > 0) {
                        String linea = dich2.readUTF();
                        System.out.println(linea);
                    } 
                } catch (IOException e) {
                    System.out.println("Error leyendo el archivo: " + e.toString());
                }
                finally{
                    try {
                        fich.close();
                        dich2.close();
                    } catch (IOException e) {
                        System.out.println("Error cerrando el archivo: " + e.toString());
                    }
                }
    }
}
