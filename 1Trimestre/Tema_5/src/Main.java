import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("telefono");
        String telefono = sc.next();
        System.out.println("fecha nac");
        String fecha = sc.next();
        System.out.println("email");
        String email = sc.next();
        System.out.println("DNI");
        String dni1 = sc.next();

        // Crea una nueva instancia de la clase Dni.
        Dni dni = new Dni(dni1);

        /**
         * *Crea una nueva instancia de la clase Persona y recibe los parametros por
         * pantalla, que los evalua con los metodos y el constructor de su clase.
         */
        Persona persona = new Persona("dni1", "dni1", 0, dni, telefono, fecha, email);

        System.out.println(persona);

        /**
         * ! Ejercicio realizado en clase
         * 
         * if(persona.validaNombreif()){
         * System.out.println("Correcto");;
         * }else{
         * System.out.println("falso");
         * }
         */
        sc.close();
    }

}
