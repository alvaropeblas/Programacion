import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try {
            /*Codigo susceptible de error dentro de Try */
            System.out.println("Introduzca num");
            int n = sc.nextInt();
            System.out.println("Introduzca segundo num");
            int r = sc.nextInt();
        System.out.println("El resultado de la division es: " + n/r);

        } catch (Exception e) {
            /*Muestra el error */
           System.out.println("Mal");
            /*Muestra el error llamando al metodo*/
            System.out.println( e.getMessage());
                                e.printStackTrace(); 
        }
        System.out.println("Fin de programa");

        
    }
}
