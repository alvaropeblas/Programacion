public class Bicicleta extends Vehiculo {
    private String tipo;

    //Constructor que hereda de la clase Vehiculo y pasa por parametro el atributo tipo.
    public Bicicleta(String tipo) {
        super(2, 1);
        this.tipo = tipo;
    }

        //Getters y Setters
    @Override
    public String toString() {
        return "Bicicleta: " + super.toString() + ", tipo=" + tipo + "]";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    


    

    

}