import java.util.Scanner;
public class prueba_practica_tema_2 {
    public static void main(String[] args) {
        System.out.println("Introduzca un número: ");
        int a = 0;
        Scanner lectura = new Scanner(System.in);
        a = lectura.nextInt ();
        int i = 0;
        int numero = 0;
        int res = 0;
        for (i = 0; a >= 0; a--){
             numero = numero + a;
             res = numero;
        }
        System.out.println("El sumatorio del número es: " + res);
        lectura.close();
    }
}
