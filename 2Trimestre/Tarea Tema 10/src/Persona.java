

public abstract class Persona {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected String fechaNac;
    protected double peso;
    protected double altura;

    

    /*Constructor */
    public Persona(int id, String nombre, String apellidos, String fechaNac, double peso, double altura) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.peso = peso;
        this.altura = altura;
    }

    /*Metodo abstracto viajar */
    public abstract void viajar();





    /*Getters y Setters */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
 

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNac=" + fechaNac
                + ", peso=" + peso + ", altura=" + altura + "]";
    }


}
