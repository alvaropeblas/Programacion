import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
            double h = 0;
            int peso = 0;
            Scanner lectura = new Scanner (System.in);
            System.out.println("Introduzca su altura: ");
            h = lectura.nextDouble();
            System.out.println("Introduzca su peso: ");
            peso = lectura.nextInt();
            double IMC = peso/(h*h);
            System.out.println("Su Indice de Masa corporal es: " + IMC);
            if (IMC<18.5){
                System.out.println("Bajo Peso");
            }else if (IMC <= 24.9){
                System.out.println("Normopeso");
            } else if (IMC <= 26.9){
                System.out.println("Sobrepeso grado I");
            } else if (IMC <= 29){
                System.out.println("Sobrepeso grado II");
            } else if (IMC <= 34.9){
                System.out.println("Obesidad tipo I");
            } else if (IMC <= 39.9){
                System.out.println("Obesidad tipo II");
            } else if (IMC <= 49.9){
                System.out.println("Obesidad tipo III (mórbida)");
            } else {
                System.out.println("Obesidad tipo IV (extrema)");
            }

        }
    }