import java.util.Scanner; 
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Por favor, ingrese su numero de DNI: ");
        numero = sc.nextInt();
        Dni dni = new Dni(numero);
        dni.obtenerLetra();
        sc.close();
    }
    
}