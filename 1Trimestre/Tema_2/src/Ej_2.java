import java.util.Scanner;
public class Ej_2 {
    public static void main (String [] args) {
        int numero = 0;
        Scanner lectura = new Scanner (System.in);
        System.out.println("Introduzca su numero: ");
        numero = lectura.nextInt();
        int num = numero * (-1);
        System.out.println("El resultado es: " + num);
    }
}
