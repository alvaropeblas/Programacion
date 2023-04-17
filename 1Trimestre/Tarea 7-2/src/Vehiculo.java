/**
 ** Clase Vehiculo

 @param matricula
 @param modelo
 @param potencia
 @param maxVehiculos
 @param numVehiculos
 */
public class Vehiculo {

    protected String matricula;
    protected String modelo;
    protected int potencia;
    public static final int maxVehiculos = 5;
    public static int numVehiculos;

    
// Constructor.
    public Vehiculo(String matricula, String modelo, int potencia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }

/**
 * *La función `toString()` es un método de la clase que devuelve una representación de cadena del objeto.
 * 
 * @return Se devuelve el método toString().
 */
    @Override
    public String toString() {
        return "matricula=" + matricula + ", modelo=" + modelo + ", potencia=" + potencia;
    }
//Getters y setters
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public static int getMaxvehiculos() {
        return maxVehiculos;
    }
    public static int getNumVehiculos() {
        return numVehiculos;
    }
    public static void setNumVehiculos(int numVehiculos) {
        Vehiculo.numVehiculos = numVehiculos;
    }
    
/**
 ** Si el número de vehículos es igual al número máximo de vehículos, devuelve falso; de lo contrario, incrementa el número de vehículos y devuelve verdadero
 * 
 * @return El método devuelve un valor booleano.
 */
    public static boolean entradaVehiculo(){
        if (numVehiculos == maxVehiculos){
            return false;
        }else{
            ++numVehiculos;
            return true;
        }
        
    } 

/**
 ** Si el número de vehículos es cero, devuelve falso, de lo contrario, disminuye el número de vehículos y devuelve verdadero
 * 
 * @return El método devuelve un valor booleano.
 */
    public static boolean salidaVehiculos(){
        if(numVehiculos == 0){
            return false;
        }else{
            --numVehiculos;
            return true;
        }
        
    }
/**
 *
 * 
 * @return El método devuelve el numero de vehiculos.
 */
    public static int obtenerNumVehiculos(){
        
        return numVehiculos;
    }
 

  

    
    
 


   
}