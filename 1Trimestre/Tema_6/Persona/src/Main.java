public class Main {
    public static void main(String[] args) throws Exception {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Sara", 60); 
        Persona persona3 = new Persona("Antonio", "Pérez", "12345678A", 20);


        System.out.println("\n" +persona1.getNombre() + " " + persona1.getApellidos() + ": " + persona1.getEdad());
        System.out.println("\n" +persona2.getNombre() + " " + persona2.getApellidos() + ": " + persona2.getEdad());
        System.out.println("\n" +persona3.getNombre() + " " + persona3.getApellidos() + ": " + persona3.getEdad());
        
        System.out.println("\n");
        
        if(persona1.setEdad(0)){
            System.out.println("\n" + "La nueva edad de perona 1 es: " + persona1.getEdad());
         }else{
            System.out.println("\n" +"ERROR" + " La edad es: " + persona1.getEdad());
         }
         if(persona2.setEdad(0)){
            System.out.println("\n" + "La nueva edad de persona 2 es: " + persona2.getEdad());
         }else{
            System.out.println("\n" +"ERROR" + " La edad es: " + persona2.getEdad());
         }
         if(persona3.setEdad(0)){
            System.out.println("\n" + "La nueva edad de peropna 3 es: " + persona3.getEdad());
         }else{
            System.out.println("\n" +"ERROR" + " La edad es: " + persona3.getEdad());
         }

         System.out.println("\n");
        
         System.out.println("\n" + persona1.toString());
         System.out.println("\n" + persona2.toString());
         System.out.println("\n" + persona3.toString());
         
         System.out.println("\n");
         persona1.setEdad(50);
         System.out.println(persona1.esMayorQue(persona2));
         System.out.println(persona2.esMayorQue(persona3));

         System.out.println("\n");


        
    }
}
