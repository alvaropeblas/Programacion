import java.util.ArrayList;

public abstract  class FiguraGeometrica {

   public abstract double calcularArea();

   public static double areas(ArrayList<FiguraGeometrica> figuras){

      double sum = 0;

      for (FiguraGeometrica figuraGeometrica : figuras) {
         sum = figuraGeometrica.calcularArea() + sum;
      }
      return sum;

   }

  /*  public double calcularAreaTodos(ArrayList<FiguraGeometrica> figuras, FiguraGeometrica p) {
      double sum = 0;
      for (FiguraGeometrica figuraGeometrica : figuras) {
         if (p instanceof Cuadrado) {
            sum = p.calcularArea() + sum;
         } else if(p instanceof Circulo) {
            sum = p.calcularArea() + sum;
         }else if(p instanceof Rombo) {
            sum = p.calcularArea() + sum;
         }else{
            sum = p.calcularArea() + sum;
         }
          return sum;
      }
       */

    /*    public double calcularAreaTodos(ArrayList<FiguraGeometrica> figuras, String p) {
         double sum = 0;
         for (FiguraGeometrica figuraGeometrica : figuras) {
           
            if (p == "Circulo" && figuraGeometrica instanceof Circulo) {
               
            } else {
               
            }
         }
         return sum;
   } */


public static void muestraLado(ArrayList<FiguraGeometrica> figuras){

   
}



}
