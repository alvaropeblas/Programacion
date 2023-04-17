import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
//Creamos un arraylist y añadimos 5 personas.
        ArrayList<Persona> personas = new ArrayList<>();       
        for(int i = 0; i <= 4; i++){
                   personas.add(new Persona(i, "nombre" + i, "apellido" + i, 20 + i));
                } 
                
 
 
//Escribimos en el archivo personas.txt caracter por caracter 
         FileWriter fichero= null; 

         try {
            //Recorremos el arraylist que recorra cada iteracion el toString() de cada persona y reciba en el metodo de escritura cada caracter del String.
             fichero = new FileWriter("personas.txt");
                for (Persona persona : personas) {
                    for(int i = 0; i < persona.toString().length(); i++){
                        fichero.write(persona.toString().charAt(i));
                    }          
                }
                

         } catch (IOException e) {
             System.out.println("Error escribiendo el fichero: " + e.toString());
         }
         
          finally{
             try {
                 fichero.close();
 
             } catch (IOException e) {
                 System.out.println("Error cerrando el fichero: " + e.toString());
             }
         } 
//Añadimos dos personas más al Arraylist 
         for(int i = 5; i<=6; i++){
            personas.add(new Persona(i, "nombre" + i, "apellido" + i, 20 + i));
         }
         FileWriter fic = null;
         PrintWriter pw = null;
         try {
//Utilizamos el metodo de escritura linea por linea y hacemos que no elimine el texto anterior
            fic = new FileWriter("personas.txt", true);
            pw = new PrintWriter(fic);
             
//Escribimos en el archivo las dos personas que hemos añadido previamente
                for(int i = 5; i <= 6; i++){
                    pw.print(personas.get(i).toString());
                }
             
         } catch (IOException e) {
            System.out.println("Error escribiendo el fichero: " + e.toString());
         }
         finally{
            try {
                fic.close();
                pw.close();
            } catch (IOException e) {          
                System.out.println("Error cerrando el fichero: " + e.toString());
                    
            }
         }
         
    }
}
