
public class Empleado extends Persona {
    private String puesto;
    private double sueldo;

    
    


    public Empleado(String nombre, String apellidos, Dni dni, String puesto, double sueldo) {
        super(nombre, apellidos, dni);
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    
    @Override
    public String toString() {
        return "Empleado [puesto=" + puesto + ", sueldo=" + sueldo + "]";
    }


    public String getPuesto() {
        return puesto;
    }


    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }


    public double getSueldo() {
        return sueldo;
    }


    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

 






}
    
    

