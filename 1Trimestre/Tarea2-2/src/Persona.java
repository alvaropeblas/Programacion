public class Persona {
  
        String nombre;
        String apellidos;
        int edad;
        String dni;
        
        @Override
        public String toString() {
            return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", dni=" + dni + "]";
        }

        public Persona(String nombre, String apellidos, int edad, String dni) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
            this.dni = dni;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }
        
       }
    
