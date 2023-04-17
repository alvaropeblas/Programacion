
public class Vehiculo {
    private String marca;  
    private String modelo;
    private String matricula;
    private Cliente cliente;

    
   

    public Vehiculo(String marca, String modelo, String matricula, Cliente cliente) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", cliente=" + cliente
                + "]";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

    
}