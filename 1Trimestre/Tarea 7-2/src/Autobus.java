/**
 * * Crea una clase Autobus que hereda de la clase Vehiculo.
 * 
 * @param numPlazas
 * 
 * 
 */
public class Autobus extends Vehiculo {
    private int numPlazas;

// Constructor.
    public Autobus(String matricula, String modelo, int potencia, int numPlazas) {
        super(matricula, modelo, potencia);
        this.numPlazas = numPlazas;
    }
/**
 * *La función `toString()` es un método de la clase que devuelve una representación de cadena del objeto.
 * 
 * @return Se devuelve el método toString().
 */
    @Override
    public String toString() {
        return "Autobus: " + super.toString() + ", numPlazas=" + numPlazas;
    }
//Getters y setters
    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
    
}
