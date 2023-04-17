
public class Persona {
    private int codPersona;
    private String nombre;
    private String apellido;
    private int edad;

    



    public Persona(int codPersona, String nombre, String apellido, int edad) {
        this.codPersona = codPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    public int getCodPersona() {
        return codPersona;
    }


    public void setCodPersona(int codPersona) {
        this.codPersona = codPersona;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Persona [codPersona=" + codPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
                + "]" + "\n";
    }
     
}
