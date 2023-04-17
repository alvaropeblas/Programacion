public class Persona {
   private String nombre, apellidos, dni;
    private int edad;

/**
 * * Constructor con parametros dados 
 * 
 *  */ 
        public Persona(){
            this.nombre = "desconocido";
            this.apellidos = "desconocido";
            this.dni = "desconocido";
            this.edad = 0;
        }

/**
 * *Constructor que introduces los valores en el main.
 * 
 * @param nombre
 * @param apellidos
 * @param dni
 * @param edad
 */
        public Persona(String nombre, String apellidos, String dni, int edad){
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.dni = dni;
            this.edad = edad;
        }

/**
 * *Introduce dos de los parametros los das en el main y otros dos vienen ya definidos, si no defines apellidos y nombre se autocompletaran con los valores del primer
 * 
 * @param nombre
 * @param edad
 */
        public Persona (String nombre, int edad){
            this(nombre, "desconocido", "desconocido", edad);
        }

        
        
        
        
        public String getNombre(){
            return nombre;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getApellidos(){
            return apellidos;
        }

        public void setApellidos(String apellidos){
            this.apellidos = apellidos;
        }

        public String getDni(){
            return dni;
        }

        public void setDni(String dni){
            this.dni = dni;
        }

        public int getEdad(){
            return edad;
        }

        public boolean setEdad(int edad){
            if(edad>0){
                this.edad = edad;
                return true;
            }else{
                return false;
            }
        }
        @Override
        public String toString(){
            return " Nombre: " + nombre + " // " + " Apellidos: " + apellidos + " // " + " Edad: " +  edad + " // " + " DNI: " +  dni;
        }

        public void cumplirAno(){
            this.edad++;
        }
        public boolean esMayorQue (Persona pers){
            if (this.edad>pers.edad){
                return true;
            }else
                return false;
        }
        public boolean mayorEdad (){
            if(this.edad>18){
                return true;
            }else{
                return false;
            }
        }
}
