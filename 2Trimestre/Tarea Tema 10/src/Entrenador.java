
/*Clase Entrenador que hereda de Persona e implementa de Deportista e Integrante */
public class Entrenador extends Persona implements Deportista, Integrante {
    private int idFedereacion;


/*Constructor */
    public Entrenador(int id, String nombre, String apellidos, String fechaNac, double peso, double altura,
            int idFedereacion) {
        super(id, nombre, apellidos, fechaNac, peso, altura);
        this.idFedereacion = idFedereacion;
    }





/*Metodos que recibe de las clases de las que implementa y hereda */
    @Override
    public void viajar() {
        System.out.println("viajando" + this);    
    }
    @Override
    public void concentrarse() {
       System.out.println("concentrado" + this); 
    }
    @Override
    public void comer() {
       System.out.println("comiendo" + this);   
    }
    @Override
    public void dormir() {
        System.out.println("durmiendo" + this);      
    }
    @Override
    public void entrenar() {
        System.out.println("entrenando" + this); 
    }
    @Override
    public void jugarPartido() {
        System.out.println("partido" + this);   
    }






   /**
    * * Mediante un get recibe el peso y la altura, lo divide entre 2.
    * Evalua el resultado y si es mayor o igual a 25 devuelve true, si no, devuelve false.
    * @return El valor booleano de la instrucción if.
    */
    @Override
    public boolean tieneSobrepeso() {
        if ((getPeso()/Math.sqrt(getAltura()))/2 >= 25) {
            return true;
        } else {
            return false;
        }
    }

/*Getters y Setters */

    public int getIdFedereacion() {
        return idFedereacion;
    }

    public void setIdFedereacion(int idFedereacion) {
        this.idFedereacion = idFedereacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Entrenador [idFedereacion=" + idFedereacion + "]";
    }
   
}
