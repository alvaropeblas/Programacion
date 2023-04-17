public class Coche extends Vehiculo {
    protected int cilindrada;
    static final int VelMax = 120;

    public Coche(int numRuedas, int capacidad, int cilindrada) {
        super(numRuedas, capacidad);
        this.cilindrada = cilindrada;
    }

}