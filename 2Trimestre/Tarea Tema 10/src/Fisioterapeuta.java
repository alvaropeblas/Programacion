/*Clase Fisioterapeuta que hereda de Masajista */
public class Fisioterapeuta extends Masajista {
    private int anyosExperiencia;

    /*Constructor*/
    public Fisioterapeuta(int id, String nombre, String apellidos, String fechaNac, double peso, double altura,
            String titulacion, int anyosExperiencia) {
        super(id, nombre, apellidos, fechaNac, peso, altura, titulacion);
        this.anyosExperiencia = anyosExperiencia;
    }


/*Metodos que recibe de la herencia */
    @Override
    public void viajar() {
        System.out.println("viajando" + this);    
    }
    @Override
    public void concentrarse() {
       System.out.println("concentrado" + this);    
    }
    @Override
    public void comer() {
        System.out.println("comiendo" + this);    
    }
    @Override
    public void dormir() {
        System.out.println("durmiendo" + this);     
    }


    /*Getters y Setters */
    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }
    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    
}
