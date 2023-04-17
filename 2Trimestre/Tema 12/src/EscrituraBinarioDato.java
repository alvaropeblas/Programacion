import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscrituraBinarioDato {
    public static void main (String[]args){
        FileOutputStream fichero = null;
        DataOutputStream flujosalida = null;
        try {
            fichero = new FileOutputStream("prueba.dat");
            flujosalida = new DataOutputStream(fichero);

            //Excribimos 26 caracteres, cada caracter ocupa 2 byte
            //26 X 2= 52 bytes
            for(int i = 65; i<=90; i++){
                flujosalida.writeChar(i);
            }
            //Escribimos 26 enteros, cada entero = 4 bytes
            //26 X 4 = 104 bytes
            for(int x = 0; x<=25; x++){
                flujosalida.writeInt(x);
            }


            //Escribimos 2 double, cada double ocupa 8 byte
            //2 X 8 = 16 bytes
            flujosalida.writeDouble(5.5);
            flujosalida.writeDouble(825.53);

            //Escribimos un String,cada caracter ocupa 2 bytes
            //2 X 7 = 14 bytes
            flujosalida.writeChars("Binario");

        } catch (IOException e) {
            System.out.println("Erros leyendo el fichero" + e.toString());
        }
        finally{
            try {
                fichero.close();
                flujosalida.close();
            } catch (IOException e) {
                System.out.println("Error cerrando el fichero" + e.toString());
            }
        }
    }
}
