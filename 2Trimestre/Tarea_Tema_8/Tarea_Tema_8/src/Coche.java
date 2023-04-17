public class Coche extends Vehiculo {
    protected int cilindrada;
    static final int VelMax = 120;

  
     //Constructor que hereda de la clase Vehiculo y pasa por parametro el atributo cilindrada.
    public Coche(int cilindrada) {
        super(4, 5);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + ", cilindrada=" + cilindrada;
    }
}