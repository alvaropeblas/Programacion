public class Vehiculo {
    protected int NumRuedas;
    protected int Capacidad;

    
    @Override
    public String toString() {
        return "NumRuedas=" + NumRuedas + ", Capacidad=" + Capacidad;
    }


    public Vehiculo(int numRuedas, int capacidad) {
        NumRuedas = numRuedas;
        Capacidad = capacidad;
    }


    public int getNumRuedas() {
        return NumRuedas;
    }


    public void setNumRuedas(int numRuedas) {
        NumRuedas = numRuedas;
    }


    public int getCapacidad() {
        return Capacidad;
    }


    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

}