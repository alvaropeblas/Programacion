import java.util.Scanner;

public class Exepciones {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca num");
            int n = sc.nextInt();
            System.out.println("Introduzca segundo num");
            int r = sc.nextInt();


            try{
                dividir(n, r);
            }catch(ArithmeticException e){
                System.out.println("ERROR: "+ e.getMessage());
            }       
           System.out.println("Fin de programa");   
    }

    /*Metodo para controlar el error de una division */
  /**
   * If the divisor is zero, throw an ArithmeticException. Otherwise, return the result of the division
   * 
   * @param dividendo The number to be divided.
   * @param divisor The number to divide by.
   * @return The result of the division.
   * @throws ArithmeticException
   */
    public static double dividir(double dividendo, double divisor) throws ArithmeticException{
        if(divisor == 0){
            throw new ArithmeticException("El divisor es cero.");
        }
        return dividendo/divisor;
    }
   
}

