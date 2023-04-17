
import java.util.*;

/**
 * 
 */
public class Turismo extends Coche {
    private String color;
    private int velocidad;

 

   

    public Turismo(int numRuedas, int capacidad, int cilindrada, String color, int velocidad) {
        super(numRuedas, capacidad, cilindrada);
        this.color = color;
        this.velocidad = velocidad;
    }

    /**
     * @return
     */
    public void arrancar() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void parar() {
        // TODO implement here
        return null;
    }

    /**
     * @param velocidad
     */
    public void acelerar() {
        // TODO implement here
    }

    /**
     * @param velocidad
     */
    public void frenar() {
        // TODO implement here
    }

    /**
     * @param double tiempo 
     * @return
     */
    public double recorrido() {
        // TODO implement here
        return 0.0d;
    }

}