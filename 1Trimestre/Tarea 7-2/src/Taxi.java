/**
 * * Crea una clase llamada Taxi que hereda de la clase Vehiculo.
 * 
 * @param numLicencia
 */
public class Taxi extends Vehiculo {
    private int numLicencia;

// Constructor.
    public Taxi(String matricula, String modelo, int potencia, int numLicencia) {
        super(matricula, modelo, potencia);
        this.numLicencia = numLicencia;
    }
/**
 * *La función `toString()` es un método de la clase que devuelve una representación de cadena del objeto.
 * 
 * @return Se devuelve el método toString().
 */
    @Override
    public String toString() {
        return "Taxi: " + super.toString() + ", numLicencia=" + numLicencia;
    }
/**
 *
 * 
 * @return El método devuelve el numero de licencia.
 */
    public int getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }
    
}
