/*Clase abstracta que hereda de Persona e implementa de integrante   */
public abstract class Masajista extends Persona implements Integrante {
    private String titulacion;

/*Constructor */
    public Masajista(int id, String nombre, String apellidos, String fechaNac, double peso, double altura, String titulacion) {
        super(id, nombre, apellidos, fechaNac, peso, altura);
        this.titulacion = titulacion;
    }


/*Getter y Setter */
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }


    
    
}
