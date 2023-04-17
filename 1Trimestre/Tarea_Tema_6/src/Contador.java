public class Contador {
    private int numero;

    public Contador(){
      numero = 0;
    }

    public Contador(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "numero= " + numero;
    }
    public void incrementar() {
        numero++;
    }
    public void decrementar(){
        numero--;
    }
}
