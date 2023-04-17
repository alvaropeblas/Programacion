public class Circulo  extends FiguraGeometrica{

    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {     
        return Math.PI*(Math.sqrt(radio));
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
