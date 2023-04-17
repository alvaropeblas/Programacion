import java.util.Scanner;
public class Ej_3 {
    public static void main (String[]args){
        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        Scanner lectura = new Scanner (System.in);
        System.out.println("Introduzca el primer numero: ");
        num1 = lectura.nextFloat();
        System.out.println("Introduzca el segundo numero: ");
        num2 = lectura.nextFloat();
        System.out.println("Introduzca el tercer numero: ");
        num3 = lectura.nextFloat();
        float res = num1 + num2 + num3;
        float res2 = res/3;
        System.out.println("El resultado es: " + res2);
    }    
}
