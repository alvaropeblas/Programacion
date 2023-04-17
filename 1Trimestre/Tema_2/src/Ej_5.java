import java.util.Scanner;

public class Ej_5 {
    public static void main(String[]args) {
        
        int d = 0, h = 0, m = 0, s = 0;
       
        Scanner lectura = new Scanner(System.in);
       
        System.out.println("Introduzca el numero de dias: ");
        d = lectura.nextInt();
        
        System.out.println("Introduzca el numero de horas: ");
        h = lectura.nextInt();
        
        System.out.println("Introduzca el numero de minutos: ");
        m = lectura.nextInt();
        
        System.out.println("Introduzca el numero de segundos: ");
        s = lectura.nextInt();
       
        final int op = 60;
        final int oph = op*op;
        final int opd = d*86400;
       
        int res = (opd)+(h*oph)+(m*op)+(s);
       
        System.out.println("El número de segundos total es: " + res);
    }
}
