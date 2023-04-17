import java.util.Arrays;

public class Dni {
    private int numeroDNI;
    private final char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
   
    @Override
    public String toString() {
        return "Dni [numeroDNI=" + numeroDNI + ", letras=" + Arrays.toString(letras) + "]";
    }
    public Dni(){
        numeroDNI = 0;
    }
    public Dni(int num){
        this.numeroDNI = num;
    }
    public void setNumeroDNI(int nuevoNum){
        this.numeroDNI = nuevoNum;
    }
    public int getNumeroDNI(){
        return numeroDNI;
    }
    public void obtenerLetra(){
        int resto;
        resto = numeroDNI % 23;
        System.out.println("DNI COMPLETO: "+numeroDNI+letras[resto]);
    }
}
 