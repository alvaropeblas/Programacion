import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner lectura = new Scanner (System.in);
        System.out.println("Introduzca el número para calcular");
        int numero = lectura.nextInt ();
        System.out.println("Tabla del" + numero);
        for (int i = 0; i <= 10; i++){
            System.out.println(i * numero);
        }
    }
}
