
public class Reparacion {
    private String descripcion;
    private double precio;
    private Empleado empleado;

    
    public Reparacion(String descripcion, double precio, Empleado empleado) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.empleado = empleado;
    }


    @Override
    public String toString() {
        return "Reparacion [descripcion=" + descripcion + ", precio=" + precio + ", empleado=" + empleado + "]";
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public Empleado getEmpleado() {
        return empleado;
    }


    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    
   

 

}