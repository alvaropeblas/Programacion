public class Cuadrado extends FiguraGeometrica {
    double lado;

    
    public Cuadrado(double lado) {
        this.lado = lado;
    }


    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }


    public double getLado() {
        return lado;
    }


    public void setLado(double lado) {
        this.lado = lado;
    }

}
