public class Contador {
    int num;

    @Override
    public String toString() {
        return "" + num;
    }

    public Contador(int num) {
        this.num = num;
    }

    public int getNumero() {
        return num;
    }

    public void setNumero(int num) {
        this.num = num;
    }

    public void incrementar(){
       this.num = this.num + 1;
        
    }
    public void decrementar(){
        this.num = this.num - 1;

    }
}
