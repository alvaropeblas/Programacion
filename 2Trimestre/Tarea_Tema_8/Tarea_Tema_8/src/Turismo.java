public class Turismo extends Coche {
    private String color;
    private  double velocidad;
    private  boolean arrancado;


 

   

    //Constructor por defecto
    public Turismo(int cilindrada, String color, double velocidad, boolean arrancado) {
        super(cilindrada);
        this.color = color;
        this.velocidad = velocidad;
        this.arrancado = arrancado;
    }
    //Constructor por parametros
    public Turismo(int cilindrada, String color) {
        super(cilindrada);
        this.color = color;
        velocidad = 0;
        arrancado = false;
    }
    //Constructor de copia
    public Turismo(Turismo copia) {
        super(copia.cilindrada);
        this.color = copia.color;
        velocidad = 0;
        arrancado = false;
    }

    /**
     * * Metodo para acelerar, comprueba si está arrancado.
     * 
     * ? Si no está arrancado, arrancado se vuelve true y devuelve un true.
     * ? Si está arrancado devuelve false. 
     * @return
     */   
    public  boolean arrancar() {
        if (arrancado == false) {
            arrancado = true;
            return true;
        }else{
            return false;
        }
    }

    /**
     * * Metodo para apagar.
     * ? Si el está arrancado y su velocidad es 0, arrancado se vuelve false y devuelve un true
     * ? Si la velocidad es mayor que 0 entoces devuelve un false y si no devuelve un true.
     * @return
     */
    public  boolean parar() {
        if (arrancado == true && velocidad == 0)  {
            arrancado = false;
            return true;
        }
        if (velocidad > 0){
            return false;
        }else{
            return true;
        }
    }
    /**
     * * Metodo para acelerar.
     * ? Evalua si está arrancado, silo está y su velocidad + la velocidad que quiere sumar es mayor a 120 la velocidad se iguala a la velocidad maxima y devuelve true.
     * ? Si no supera la velocidad maxima dicha suma, la velocidad equivaldría a la suma que quiere añadir.
     * ? Todo lo demás devuelve false.
     *
     */
    public boolean acelerar(double vel) {
        if(arrancado == true) {
            if((velocidad + vel) > 120) {
                velocidad = VelMax;
                return true;
            }else {
                velocidad =+ vel;
                return true;
            }
        }else {
            return false;
        }
    }
    

    /**
     * *Metodo para frenar.
     * ? Si está arrancado y la velocidad menos la velocidad que quiere restar es mayor o igual a 0, devuelve true y se queda con la velocidad obtenida.
     * ? Todo lo demás devuelve false.
     */
    public  boolean frenar(double vel) {
        if (arrancado == true && velocidad - vel >= 0) {
            velocidad  = velocidad - vel;
            return true;
        }else{
            return false;
        }
       
    }

    /**
     * * Metodo para calcular el tiempo de viaje
     *  Pasando por parametro la distancia que introduzca el usuario se calcula mediante una formula donde divide la distancia por la velocidad.
     * @param double tiempo 
     * @return tiempo
     */
    public double recorrido(double distancia) {
        double tiempo = distancia/velocidad;
        return tiempo;
    }


    //Getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double vel) {
        this.velocidad = vel;
    }


     
    @Override
    public String toString() {
        return    "Turismo [" + super.toString()+ ", color=" + color +"]";
    }

}
