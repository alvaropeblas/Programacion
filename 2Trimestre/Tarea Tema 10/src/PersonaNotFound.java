/*Clase que extiende de la clase Exceptions que utilizamos para controlar errores */
public class PersonaNotFound extends Exception{

   

    public PersonaNotFound(String message) {
        super(message);
    }

  

}