import java.util.Scanner;
import java.lang.Math;
public class Switch {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        int caso = 0; //Declaro una variable de tipo entero que utilizo para los casos de Switch y salida del bucle do-while.
    do 
    { //inicio del bucle do-while.
        //Menú principal con los enunciados de los ejercicios.
        System.out.println("1: Los dos números que introduzca se sumarán, restarán, multiplicarán y dividirán en ese mismo orden");
        System.out.println("2: El número que introduzca se devolverá con el signo cambiado");
        System.out.println("3: Deberá introducir tres números a los que se le hará una media aritmética");
        System.out.println("4: Calculo de hipotenusa de un triangulo rectangulo");
        System.out.println("5: Calculo de segundos totales");
        System.out.println("6: Orden de números de menor a mayor");
        System.out.println("7: ¿Par o Impar?");
        System.out.println("8: Calculo de horas totales");
        System.out.println("9: ¿Año bisiesto o no?");
        System.out.println("10: Indice de Masa Muscular");
        System.out.println("11: Factorial de un número");
        caso = lectura.nextInt();
        switch (caso){ //Inicio de la sentencia switch donde declaro los casos del menú de ejercicios.
            case 1:
            //Declaro dos varaibles de tipo entero, estos valores cambiaran a elección del usuario, después los opero y doy los resultados.
                int numero = 0;
                int numero2 = 0;
                System.out.println("Introduzca el primer número");
                numero = lectura.nextInt();
                System.out.println("Introduzca el segundo número");
                numero2 = lectura.nextInt();
                int suma = numero + numero2;
                int resta = numero - numero2;
                int multiplicacion = numero * numero2;
                int division = numero / numero2;
                System.out.println("El resultado es: " + suma);
                System.out.println("El resultado es: " + resta);
                System.out.println("El resultado es: " + multiplicacion);
                System.out.println("El resultado es: " + division);
            break;
        
            case 2:
            //Declaro una variable de tipo entero que cambiará a elección del usuario, este valor se multiplicara por -1 para cambiar su signo.
                int num = 0;
                System.out.println("Introduzca su número: ");
                num = lectura.nextInt();
                int res = num * (-1);
                System.out.println("El resultado es: " + res);
            break;

            case 3:
            //Declaro tres variables de tipo real que cambairan a elección del usuario, estos valores se operarán para obtener la media.
                float num1 = 0;
                float num2 = 0;
                float num3 = 0;
                System.out.println("Introduzca el primer número: ");
                num1 = lectura.nextFloat();
                System.out.println("Introduzca el segundo número: ");
                num2 = lectura.nextFloat();
                System.out.println("Introduzca el tercer número: ");
                num3 = lectura.nextFloat();
                float res1 = num1 + num2 + num3;
                float res2 = res1/3;
                System.out.println("El resultado es: " + res2);
            break;

            case 4:
            //Declaro dos variables e tipo entero, las opero y utilizo una clase java.lang.Math importada para utilizar un método sqrt para hacer la raíz cuadrada del resultado de la operación anterior.
                double cat1 = 0;
                double cat2 = 0;
                System.out.println("Introduzca el primer cateto: ");
                cat1 = lectura.nextInt ();
                System.out.println("Introduzca el sugundo cateto: ");
                cat2 = lectura.nextInt();
                double resu = cat1*cat1 + cat2*cat2; 
                double hip = Math.sqrt(resu);
                System.out.println("La hipotenusa es: " + hip);
            break;

            case 5:
            //Declaro cuatro variables de tipo entero, que sabiendo el número de segundos que equivale a tantos dias, horas, minutos y segundos, dependiendo del valor que introduzca el usuario, obtendré el número de segundos totales.
                int d = 0, h = 0, m = 0, s = 0;
                System.out.println("Introduzca el número de dias: ");
                d = lectura.nextInt(); 
                System.out.println("Introduzca el número de horas: ");
                h = lectura.nextInt();
                System.out.println("Introduzca el número de minutos: ");
                m = lectura.nextInt();
                System.out.println("Introduzca el número de segundos: ");
                s = lectura.nextInt();
                final int op = 60;
                final int oph = op*op;
                final int opd = d*86400;
                int resul = (opd)+(h*oph)+(m*op)+(s);
                System.out.println("El número de segundos total es: " + resul);
            break;

            case 6:
            //Declaro tres variables, que se ordenaran de menor a mayor, para ello he utilizado la estructura de control if-else contemplando las seis posibles combinaciones para estos tres valores.
                int r1 = 0, r2 = 0, r3 = 0;
                System.out.println("Introduzca el primer número: ");
                r1 = lectura.nextInt();
                System.out.println("Introduzca el segundo número: ");
                r2 = lectura.nextInt();
                System.out.println("Introduzca el tercer número: ");
                r3 = lectura.nextInt();
                    if ((r1 < r2) && (r2 < r3)){
                        System.out.println(r1 + ", " + r2 + ", " + r3);
                    } else if ((r2 < r1) && (r1 < r3)){
                        System.out.println(r2 + ", " + r1 + ", "  + r3);
                    } else if ((r3 < r1) && (r1 < r2)){
                        System.out.println(r3 + ", " +  r1 +  ", " + r2);
                    } else if ((r1 < r3) && (r3 < r2)){
                        System.out.println(r1 + ", " +  r3 +  ", " + r2);
                    } else if ((r2 < r3) && (r3 < r1)){
                        System.out.println(r2 + ", " +  r3 +  ", " + r1);
                    } else if ((r3 < r2) && (r2 < r1)){
                        System.out.println(r3 + ", " +  r2 +  ", " + r1);
                    } 
            break;
            
            case 7:
            //Declaro una variable, la opero utilizando el operador resto (%), y dependiendo del resultado, utilizo la estructura de control if-else para decir si ese valor es par o impar.
                int n = 0;
                System.out.println("introduzca su número:");
                n = lectura.nextInt();
                double resto = n%2;
                    if (resto != 0){
                        System.out.println("Impar");
                    } else {
                        System.out.println("Par");
                    }
            break;

            case 8:
            //Declaro tres variables para averiguar el numero de horas totales, imprimiendo cuantas semanas, días y horas ha introducido el usuario y a lo que equivale en horas.
                int S = 0, D = 0, H = 0;
                System.out.println("Introduzca el número de semanas: ");
                S = lectura.nextInt();
                System.out.println("Introduzca el número de días: ");
                D = lectura.nextInt();
                System.out.println("Introduzca el número de horas: ");
                H = lectura.nextInt();
                int Hos = (S*168) + (D*24) + H;
                System.out.println("El número de horas totales en: " + S + " Semanas, " + D + " Dias y " + H + " Horas" + " es: " + Hos + " Horas");
            break;

            case 9:
            //el usuario introduce un año, ese valor lo opero utilizando % y la estructura if-else para introducir la fórmula correspondiente y averiguar si un año es bisiesto o no.
                System.out.println("Introduzca un año");
                int ano = 0;
                ano = lectura.nextInt();
                    if ((ano%4 == 0) && (ano%100 != 0)){
                        System.out.println("Es bisiesto");
                    }else if (ano%400 == 0){
                        System.out.println("Es bisiesto");
                    } else 
                        System.out.println("No es bisiesto");
            break;

            case 10:
            //Para averiguar el IMC, el usuario introduce su peso y altura se operan con su fórmula correspondiente y mediante la estructura if-else, según el resultado, se imprimirá en que situación se encuentra. 
            double o = 0;
            int peso = 0;
            System.out.println("Introduzca su altura: ");
            o = lectura.nextDouble();
            System.out.println("Introduzca su peso: ");
            peso = lectura.nextInt();
            double IMC = peso/(o*o);
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
            break;
            
            case 11:
            //Para averiguar el factorial de un número, utilizo un bucle for, y declarando una variable para el número que quiero averiguar y otra para machacar los resultados del cucle y obtener el resultado final.
            System.out.println("Introduzca un número");
            int n1 = lectura.nextInt();
            int f = 1;
                for (int i = 1; i <= n1; i++){
                    f = f * i;
                }
            System.out.println("El factorial de " + n1 + " es: " + f);
            break;

            default:
            //Declaro el error.
            System.out.println("ERROR: el numero introducido no corresponde con ningún valor");
            break;    
        }        
    }while (caso != 0); //Salida del bucle.
    lectura.close(); //Fin de lectura de la clase Scanner.
}
    
}