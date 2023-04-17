/**
 * *Crea una clase llamada Contador con una variable entera llamada num.
 */
public class Contador {
    int num;

/**
 * *Esta función devuelve una representación de cadena del número almacenado en el objeto.
 * 
 * @return El número del objeto.
 */
    @Override
    public String toString() {
        return "" + num;
    }
// **Constructor.

    public Contador(int num) {
        this.num = num;
    }

// **Los getter y setter.
    public int getNumero() {
        return num;
    }

    public void setNumero(int num) {
        this.num = num;
    }

/*
*La función incrementar() no toma argumentos y no devuelve ningún valor. Incrementa el valor de la variable num en 1
 */
    public void incrementar(){
       this.num = this.num + 1;
        
    }
 /**
  ** Esta función decrementa el valor de la variable num en 1
  */
    public void decrementar(){
        this.num = this.num - 1;

    }
}
