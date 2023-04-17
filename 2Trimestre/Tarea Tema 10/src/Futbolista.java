import java.util.ArrayList;
/*clase que que hereda de Persona e implementa de Deportista */
public class Futbolista extends Persona implements Deportista{ 
    private int dorsal;
    private String demarcacion;
    ArrayList<Persona> jugadores = new ArrayList<>();


/*Constructor */
    public Futbolista(int id, String nombre, String apellidos, String fechaNac, double peso, double altura, int dorsal,
            String demarcacion) {
        super(id, nombre, apellidos, fechaNac, peso, altura);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

/*Metodos que recibe de Deportista */
    @Override
    public void viajar() {
        System.out.println("viajando" + this);   
    }

    @Override
    public void entrenar() {
        System.out.println("entrenando" + this);
    }

    @Override
    public void jugarPartido() {
        System.out.println("jugando partido" + this);     
    }

    /**
    * * Mediante un get recibe el peso y la altura, lo divide entre 2.
    * Evalua el resultado y si es mayor o igual a 22 devuelve true, si no, devuelve false.
    * @return El valor booleano de la instrucción if.
    */
    @Override
    public boolean tieneSobrepeso() {
        if ((getPeso()/Math.sqrt(getAltura()))/2 >= 22) {
            return true;
        } else {
            return false;
        }
        
    }

    /*Getters y Setters */
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public ArrayList<Persona> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Persona> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Futbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion + ", jugadores=" + jugadores + "]";
    }

 
}
