/**
 * * Crea una clase Camion que hereda de la clase Vehiculo.
 * 
 * @param tara
 * @param carga
 */
public class Camion extends Vehiculo {
    private double tara;
    private double carga;
    
// Constructor.    
    public Camion(String matricula, String modelo, int potencia, double tara, double carga) {
        super(matricula, modelo, potencia);
        this.tara = tara;
        this.carga = carga;
    }

/**
 * *La función `toString()` es un método de la clase que devuelve una representación de cadena del objeto.
 * 
 * @return Se devuelve el método toString().
 */
    @Override
    public String toString() {
        return "Camion: " + super.toString() + ", tara= " + tara + ", carga=" + carga;
    }
// Getters y setters
    public double getTara() {
        return tara;
    }


    public void setTara(double tara) {
        this.tara = tara;
    }


    public double getCarga() {
        return carga;
    }


    public void setCarga(double carga) {
        this.carga = carga;
    }
    
/**
 ** Esta función toma dos números como entrada y devuelve la suma de esos números
 * 
 * @param tara peso del camion sin la carga
 * @param carga peso de la carga
 * @return El método devuelve el valor de la variable MMA.
 */
    public static double calcularMMA(double tara, double carga){
        double MMA = tara + carga;
        return MMA;
    }
}
