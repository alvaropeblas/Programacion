import java.util.ArrayList;


public class Listas {
    ArrayList<Vehiculo> vehiculos;
    ArrayList<Cliente> listaCli;
    ArrayList<Empleado> empleados;
    ArrayList<Reparacion> reparaciones;
    

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public ArrayList<Cliente> getListaCli() {
        return listaCli;
    }
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    public ArrayList<Reparacion> getReparaciones() {
        return reparaciones;
    }
    public Listas() {
        this.vehiculos = new ArrayList<Vehiculo>();
        this.listaCli = new ArrayList<Cliente>();
        this.empleados = new ArrayList<Empleado>();
        this.reparaciones = new ArrayList<Reparacion>();
    }
    public void addcli(Cliente cli) {
        listaCli.add(cli);
    }
    public void delCli(Cliente cli){
              
                listaCli.remove(cli);

        }
    
    public void cantidadClientes(){
        System.out.println("-----------------NUMERO DE CLIENTES------------------");
       System.out.println(listaCli.size());
       
    }
    public void infClientes(){
        System.out.println("-----------------LISTA DE CLIENTES------------------");
       for ( int i = 0; i < listaCli.size(); i++){
        System.out.println("- "+listaCli.get(i)+"\n");
       }
    }
    
}