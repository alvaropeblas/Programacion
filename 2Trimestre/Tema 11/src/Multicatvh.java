import java.util.InputMismatchException;
import java.util.Scanner;

public class Multicatvh {public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    try {
        /*Codigo susceptible de error dentro de Try */
        System.out.println("Introduzca num");
        int n = sc.nextInt();
        System.out.println("Introduzca segundo num");
        int r = sc.nextInt();
    System.out.println("El resultado de la division es: " + n/r);
    }catch(InputMismatchException e){
        System.out.println("Ha introducido un caracter no valido");
    }catch(ArithmeticException e){
        System.out.println("El divisor no puede ser 0");

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
