public class Casting_explicito {
    public static void main (String[] args) {

        //**Para datos de menor a mayor

        /*Casting explicito */
        double decimal = 100.55;

        //Decimal a float
        float num1 = (float)decimal;

        //Decimal a long
        long num2 = (long)decimal;

        //Decimal a entero
        int num3 = (int)decimal;

        System.out.println("Entero = " + decimal);
        System.out.println("long = " + num1);
        System.out.println("float = " + num2);
        System.out.println("double = " + num3);  
        
    }
    
}
