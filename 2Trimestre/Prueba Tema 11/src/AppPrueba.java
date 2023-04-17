import java.util.ArrayList;

public class AppPrueba {
    public static void main(String[] args) throws PedidoNotFound {

        Cliente c1 = new Cliente(0, "Javier", "Ruiz", "Córdoba");

        Producto p1 = new Producto(1, "Placa base", 120.50);
        Producto p2 = new Producto(2, "Procesador", 240.50);
        Producto p3 = new Producto(3, "RAM DDR4 16Gb", 150.50);

        ArrayList<Producto> carrito = new ArrayList<Producto>();
        carrito.add(p1);
        carrito.add(p2);
        carrito.add(p3);

        // CLIENTE 1 REALIZA UN PEDIDO 1 CON LOS PRODUCTOS DEL CARRITO ANTERIORES
        c1.realizarPedido(1, carrito);
        // CLIENTE 1 LISTA LOS PRODUCTOS DEL PEDIDO 5 (NO EXISTE)
        try {
            c1.getPedidos(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // CLIENTE 1 LISTA LOS PRODUCTOS DE SU PEDIDO 1
        c1.getPedidos(1).listarProductos();
        // CLIENTE 1 MUESTRA EL PRECIO TOTAL DE SU PEDIDO 1
        System.out.println(c1.getPedidos(1).calcularPrecioTotal());

    }
}