import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        /**
         * * Parte primera del ejercicio.
         * Creo un objeto de la clase Bicicleta, un objeto de la clase Coche y uno de la clase Turismo.
         * Pasamos por parametro los atributos que nos interesan, los otros vienen dados en el constructor.
         */
        
        Turismo opel = new Turismo(90, "rojo");
        Bicicleta bici = new Bicicleta("montaña");
        Coche coche = new Coche(90);
        System.out.println(bici);
        System.out.println(coche);


        /**
         * *Segunda parte del ejercicio.
         * Mediante un bucle do-while y un menú de opciones Switch, introduzco los casos donde se crean los objetos de las clases anteriores.
         */
        int caso;
        do{
            System.out.println("Pulse 1 para introducir un turismo");
            System.out.println("Pulsa 2 para introducir una bicicleta");
            System.out.println("Pulsa 3 para introducir un coche");
            System.out.println("Pulse 0 para salir");
         caso = sc.nextInt();

        switch(caso){
            /**
             * *Creo en primer lugar un turismo y compruebo todos los metodos en diferentes casos.
             *  
             */

            case 1:
            System.out.println("Intoruzca la cilindrada: ");
            int cil = sc.nextInt();
            System.out.println("Introduzca el color: ");
            String col = sc.next();
            Turismo bugati = new Turismo(cil, col);
            System.out.println(bugati);
            int caso2;
                do {
                    System.out.println("Pulse 1 para arrancar");
                    System.out.println("Pulse 2 para acelerar");
                    System.out.println("Pulsa 3 para frenar");
                    System.out.println("Pulsa 4 para apagar");
                    System.out.println("Pulsa 5 para saber el tiempo del viaje");
                    System.out.println("Pulsa 0 para volver");
                    caso2 = sc.nextInt();
                
                switch (caso2) {
                  
                    // Comprueba si el coche ya está encendido o no.
                    case 1:
                       if (bugati.arrancar()){
                        System.out.println("El turismo se ha arrancado");
                       }else{
                        System.out.println("El turismo ya está arrancado");
                       }
                        break;

                    // Pedir al usuario que introduzca un valor para aumentar la velocidad del coche y comprobación de metodo acelerar.
                    case 2:
                        System.out.println("En cuanto quiere aumentar su velocidad");
                        double vel = sc.nextDouble();
                        if(bugati.acelerar(vel)) {
                            System.out.println("Su velocidad es: " + bugati.getVelocidad() + "Km/h"); 

                        }else{
                            System.out.println("El vehiculo se encuentra apagado");
                        }
                    break;

                    //Pide al usuario que introduzca un valor para disminuir la velocidad del coche y comprobar el método de frenado.
                    case 3:
                    System.out.println("En cuanto quiere disminuir su velocidad");
                    double fre = sc.nextDouble();
                    if (bugati.frenar(fre)){
                        System.out.println("Su velocidad es: " + bugati.getVelocidad() + "Km/h");
                    }else{
                        System.out.println("El vehiculo ya está a 0");
                    } 
                        break;
                    //Metodo para apagar el coche, comprueba si el coche está parado o no. Si está detenido, se apagará, si no, no se apagará.
                    case 4:
                    if(bugati.parar()){
                        System.out.println("El turismo se ha apagado");
                    }else{
                        System.out.println("No se puede apagar con el vehiculo en marcha");
                    }
                        break; 
                    //Metodo que calcula el tiempo del viaje pidiendo al usuario la distancia.
                    case 5:
                    System.out.println("Introduzca la distancia del viaje");
                    double dist = sc.nextDouble();
                       System.out.println("La distancia de su viaje es: " + bugati.recorrido(dist) + " horas"); 
                        break;
                }
                
            } while (caso2 != 0);

            //Caso para crear un objeto de la clase Bicicleta.
            case 2:
            System.out.println("De que tipo es tu bicicleta:");
            String mod = sc.next();
            Bicicleta bicicletus = new Bicicleta(mod);
            System.out.println(bicicletus);
                break;
            //Caso para crear un objeto de la clase Coche
            case 3:
            System.out.println("Introduzca su cilindrada");
            int cil2 = sc.nextInt();
            Coche cochaso = new Coche(cil2);
            System.out.println(cochaso);
                break;


        }

        }while(caso != 0);
        
    }
}
