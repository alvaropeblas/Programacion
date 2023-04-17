public class Parse {
    public static void main(String [] args) {
        //De String a int
        String cadena1 ="123";
        int entero = Integer.parseInt(cadena1);

        //De String a float
        String cadena2 ="1.23";
        float  flotante = Float.parseFloat(cadena2);

        //De String a double
        String cadena3 ="12.3";
        double decimal = Double.parseDouble(cadena3);

        //De String a short
        String cadena4 ="123";
        short enteroShort = Short.parseShort(cadena4);

        //De String a byte
        String cadena5 ="123";
        byte enteroByte = Byte.parseByte(cadena5);

        //De String a long
        String cadena6 ="123";
        long enteroLong = Long.parseLong(cadena6);

        System.out.println("De String a int: "+(entero + 1));
        System.out.println("De String a float: "+(flotante + 1));
        System.out.println("De String a double: "+(decimal + 1));
        System.out.println("De String a short: "+(enteroShort + 1));
        System.out.println("De String a byte: "+(enteroByte + 1));
        System.out.println("De String a long: "+(enteroLong + 1));

    }
    
}
