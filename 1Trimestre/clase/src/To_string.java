public class To_string {
    public static void main(String[]args) {


        //**Convertir un numero en cadena con el metodo toString()

        int numero1 = 720;
        String cadena1 = Integer.toString(numero1);
         
        System.out.println("La cadena1 es: "+ cadena1);
        System.out.println(numero1+1);
        System.out.println(cadena1+1);

        //**Convertir numero en cadena con metodo valueOf()

        int numero2 = 728;
        String cadena2 = String.valueOf(numero2);

        System.out.println("La cadena2 es: "+ cadena2);
        System.out.println(numero2+1);
        System.out.println(cadena2+1);
        
        /**1. String.valueOf () Puede convertir tipos básicos de JAVA (int, double, boolean, etc.) y objetos (Object) en tipo String
        2. toString () es el método del objeto, puede convertir el objeto en tipo String, el algoritmo de conversión depende de las necesidades reales del tipo,
        Básicamente, cada objeto en JAVA tendrá un método toString. Los resultados de los dos son los mismos, pero el principio es diferente.*/
        
    }
    
}
