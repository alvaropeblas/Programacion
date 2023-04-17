
public class Persona {

    private String nombre;
    private String apellidos;
    private Dni dni;

    
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + "]";
    }


    public Persona(String nombre, String apellidos, Dni dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
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


    public Dni getDni() {
        return dni;
    }


    public void setDni(Dni dni) {
        this.dni = dni;
    }


   



}
