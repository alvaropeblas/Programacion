import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nombre;
    private String apellidos;
    private String direccion;
    private ArrayList<Pedido> pedidos;

    /* Constructor */

    public Cliente(int id, String nombre, String apellidos, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.pedidos = new ArrayList<>();
    }

    /* Getter y Setter */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve el pedido con el id dado, o lanza una excepción PedidoNotFound si no
     * hay pedido con
     * esa identificación existe
     * 
     * @param id El id del pedido a recuperar.
     * @return El método devuelve el objeto Pedido.
     */
    public Pedido getPedidos(int id) throws PedidoNotFound {
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == id) {
                return pedido;
            }
        }
        throw new PedidoNotFound("El pedido no se ha encontrado");
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    /**
     * Añade un nuevo pedido a la lista de pedidos.
     * 
     * @param id int
     * @param p  ArrayList de Producto
     * @return El método devuelve un valor booleano.
     */

    public boolean realizarPedido(int id, ArrayList<Producto> p) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == id) {
                return false;
            }
        }
        pedidos.add(new Pedido(1, direccion, apellidos, this, p));
        return true;
    }

    public void listarPedidos() {
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
                + ", pedidos=" + pedidos + "]";
    }
}
