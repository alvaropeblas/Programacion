import java.util.ArrayList;

public class Pedido {
    private int id;
    private String fecha;
    private String estado;
    Cliente cli;
    private ArrayList<Producto> productos;

    /* Constructor */
    public Pedido(int id, String fecha, String estado, Cliente cli, ArrayList<Producto> productos) {
        this.id = id;
        this.fecha = "20/01/23";
        this.estado = "pendiente";
        this.cli = cli;
        this.productos = productos;
    }

    /**
     * Calcula el precio total de los productos del carrito
     * 
     * @return El costo total de los productos en el carrito.
     */
    public double calcularPrecioTotal() {
        double coste = 0;
        for (Producto producto : productos) {
            coste = producto.getPrecio() + coste;
        }
        return coste;
    }

    /**
     * Funcion que recorre los productos de la lista productos y los imprime
     */
    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    /* Getter y Setter */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Pedido [id=" + id + ", fecha=" + fecha + ", estado=" + estado + ", cli=" + cli + ", productos="
                + productos + "]";
    }

}
