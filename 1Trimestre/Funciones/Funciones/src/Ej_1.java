import java.util.Scanner;

public class Ej_1 {
    public static void main (String [] args){
        int numero = 0;
        int numero2 = 0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        numero = lectura.nextInt();
        System.out.println("Introduzca el segundo numero");
        numero2 = lectura.nextInt();
        int suma = numero + numero2;
        int resta = numero - numero2;
        int multiplicacion = numero * numero2;
        int division = numero / numero2;
        System.out.println("El resultado es: " + suma);
        System.out.println("El resultado es: " + resta);
        System.out.println("El resultado es: " + multiplicacion);
        System.out.println("El resultado es: " + division);
    }
}
