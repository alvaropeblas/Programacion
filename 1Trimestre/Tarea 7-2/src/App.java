import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      
        System.out.println("BIENVENIDO A LA APLICACIÓN DE REGISTRO DE VEHÍCULOS DE CARGLASS");
        // Declara las variables num y num2.
        int num;
        int num2;
        
        
        Scanner sc = new Scanner(System.in);





    /**
     *  Un ciclo do while que le pide al usuario que ingrese un número entre 0 y 2. 
     *  Si el usuario ingresa 1, le pedirá al usuario que ingrese otro número entre 0 y 3.
     *  Si el usuario ingresa 2, le pedirá al usuario que ingrese otro número entre 0 y 3.
     *  Si el usuario ingresa 0, saldrá del programa. 
     */
        do{

            System.out.println("1 - Entrada vehículo");
            System.out.println("2 - Salida vehículo");
            System.out.println("0.- SALIR");

            num2 = sc.nextInt();
            switch(num2){

                case 1:
                if (Vehiculo.getNumVehiculos() != Vehiculo.maxVehiculos){
                System.out.println("¿QUÉ TIPO DE VEHÍCULO DESEA DAR ENTRADA?");
                System.out.println("1.- Camion");
                System.out.println("2.- Taxi");
                System.out.println("3.- Autobus");
                System.out.println("0.- VOLVER");
                num = sc.nextInt();
                    switch(num){

                        
                        case 1: 
                        if(Vehiculo.entradaVehiculo()){
                            System.out.println("Introduzca el numero de matricula: ");
                            String matr = sc.next();
                            System.out.println("Introduzca modelo: ");
                            String model = sc.next();
                            System.out.println("Introduzca la potencia: ");
                            int pot = sc.nextInt();
                            System.out.println("Introduzca tara: ");
                            double tara = sc.nextDouble();
                            System.out.println("Introduzca carga: ");
                            double carga = sc.nextDouble(); 
                            System.out.println("Se ha dado entrada correctamente el vehículo" + " Hay " + Vehiculo.numVehiculos + " vehículos en el taller");
                            Camion camion1 = new Camion(matr, model, pot, tara, carga);
                            System.out.println(camion1 + "La MMA es: " + Camion.calcularMMA(tara, carga));  
                            System.out.println("El numero de vehiculos es " + Vehiculo.numVehiculos); 
                           }else{
                            System.out.println("Su vehículo no se le puede dar entrada porque el taller está lleno. Inténtelo de nuevo más tarde");
                           }
    
                        break;
            
            
                        case 2:
                       if(Vehiculo.entradaVehiculo()){
                        System.out.println("Introduzca el numero de matricula: ");
                        String matrdos = sc.next();
                        System.out.println("Introduzca modelo: ");
                        String modeldos = sc.next();
                        System.out.println("Introduzca la potencia: ");
                        int potdos = sc.nextInt();
                        System.out.println("Introduca el numero de licencia: ");
                        int numLicencia = sc.nextInt();
                        System.out.println("Se ha dado entrada correctamente el vehículo" + " Hay " + Vehiculo.numVehiculos + " vehículos en el taller");
                        Taxi taxi1 = new Taxi(matrdos, modeldos, potdos, numLicencia); 
                        System.out.println(taxi1);   
                        System.out.println("El numero de vehiculos es " + Vehiculo.numVehiculos);
                       }else{
                        System.out.println("Su vehículo no se le puede dar entrada porque el taller está lleno. Inténtelo de nuevo más tarde");
                       }
    
                        break;
        
                        case 3:
                        if(Vehiculo.entradaVehiculo()){
                            System.out.println("Introduzca el numero de matricula: ");
                            String matrtres = sc.next();
                            System.out.println("Introduzca modelo: ");
                            String modeltres = sc.next();
                            System.out.println("Introduzca la potencia: ");
                            int pottres = sc.nextInt();
                            System.out.println("Introduzca numero de plazas: ");
                            int numPlazas = sc.nextInt();
                            System.out.println("Se ha dado entrada correctamente el vehículo" + " Hay " + Vehiculo.numVehiculos + " vehículos en el taller");
                            Autobus autobus1 = new Autobus(matrtres, modeltres, pottres, numPlazas);
                            System.out.println(autobus1);   
                            System.out.println("El numero de vehiculos es " + Vehiculo.numVehiculos);
                           }else{
                            System.out.println("Su vehículo no se le puede dar entrada porque el taller está lleno. Inténtelo de nuevo más tarde");
                           }
                        break;
                    }

                        }else{
                            System.out.println("Su vehículo no se le puede dar entrada porque el taller está lleno. Inténtelo de nuevo más tarde");
                        }
                        break;

                case 2:
                if(Vehiculo.salidaVehiculos()){
                    System.out.println("Se ha dado entrada correctamente el vehículo" + " Hay " + Vehiculo.numVehiculos + " vehículos en el taller");
                }else{
                    System.out.println("No hay ningún vehículo en el taller para dar salida.");
                }

                break;
            }
            
        }while(num2 != 0);
            System.out.println("HASTA LA PROXIMA");
            sc.close();
    }      
    
}
