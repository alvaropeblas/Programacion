import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Listas taller = new Listas();
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Bienvenido");
        System.out.println("1.-Entrada Cliente");
        System.out.println("2.-Borrar Cliente");
        System.out.println("0.-Salir");
         num = sc.nextInt();

        switch (num){
            
            case 1:
            System.out.println("Introduzca nombre");
            String nombre = sc.next();
            System.out.println("Introduzca apellidos");
            String apellidos = sc.next();
            System.out.println("Introduzca DNI");
            String numDni = sc.next();
            Dni dni = new Dni(numDni);
            System.out.println("Introduzca direccion");
            String direccion = sc.next();
            System.out.println("Introduzca telefono");
            String tlfn = sc.next();
            Cliente cliente1 = new Cliente(nombre, apellidos, dni, direccion, tlfn);
            Cliente cliente2 = new Cliente(nombre, apellidos, dni, direccion, tlfn);
            Cliente cliente3 = new Cliente(nombre, apellidos, dni, direccion, tlfn);
            Cliente cliente4 = new Cliente(nombre, apellidos, dni, direccion, tlfn);
            Cliente cliente5 = new Cliente(nombre, apellidos, dni, direccion, tlfn);
            taller.addcli(cliente1);
            taller.addcli(cliente2);
            taller.addcli(cliente3);
            taller.addcli(cliente4);
            taller.addcli(cliente5);
            taller.cantidadClientes(); 
            taller.infClientes();
            taller.delCli(cliente2);
            taller.cantidadClientes(); 
            taller.infClientes();
            break;
            case 2:
           
            break;
        }
    }while(num != 0);
        }
        

}