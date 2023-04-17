/**
 * *  Crea una clase llamada Paginas que tiene dos atributos, numPag y texto.
 */

public class Paginas {
    private int numPag;
    private String texto;

    @Override
    public String toString() {
        return " NUMERO DE PAGINA = " + numPag + ", CONTENIDO = " + texto;
    }


// Constructor.
    public Paginas(int numPag, String texto) {
        this.numPag = numPag;
        this.texto = texto;
    }

//Getters y setters.
    public int getNumPag() {
        return numPag;
    }


    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }


    public String getTexto() {
        return texto;
    }


    public void setTexto(String texto) {
        this.texto = texto;
    }

}