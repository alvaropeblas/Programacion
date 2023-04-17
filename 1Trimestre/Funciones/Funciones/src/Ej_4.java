import java.util.Scanner;
import java.lang.Math;
public class Ej_4 {
    public static void main(String[]args) {
        int cat1 = 0;
        int cat2 = 0;
        Scanner lectura = new Scanner (System.in);
        System.out.println("Introduzca el primer cateto: ");
        cat1 = lectura.nextInt ();
        System.out.println("Introduzca el sugundo cateto: ");
        cat2 = lectura.nextInt();
        int res = cat1*cat1 + cat2*cat2; 
        double hip = Math.sqrt(res);
        System.out.println("La hipotenusa es: " + hip);
    }
}
