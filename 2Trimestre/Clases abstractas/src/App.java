import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[]args) {

        ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el tamaño del cuadrado");
        double lado = sc.nextDouble();
        Cuadrado cuad = new Cuadrado(lado);
        System.out.println(cuad.calcularArea());


        System.out.println("Introduzca la base del triangulo");
        double base = sc.nextDouble();
        System.out.println("Introduzca la altura del triangulo");
        double altura = sc.nextDouble();
        Triangulo tri = new Triangulo(base, altura);
        System.out.println(tri.calcularArea());


        System.out.println("Introduzca la primera diagonal del rombo");
        double dia1 = sc.nextDouble();
        System.out.println("Introduzca la segunda diagonal del rombo");
        double dia2 = sc.nextDouble();
        Rombo rom = new Rombo(dia1, dia2);
        System.out.println(rom.calcularArea());



        System.out.println("Introduzca el radio del circulo");
        double rad = sc.nextDouble();
        Circulo cir = new Circulo(rad);
        System.out.println(cir.calcularArea());
        

        figuras.add(cuad);
        figuras.add(tri);
        figuras.add(rom);
        figuras.add(cir);


        for (FiguraGeometrica figuraGeometrica : figuras) {
           System.out.println(figuraGeometrica.calcularArea());
        } 

        
            System.out.println(FiguraGeometrica.areas(figuras));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        

            FiguraGeometrica c = new Cuadrado(1);
            FiguraGeometrica t = new Triangulo(1, 1);
            FiguraGeometrica r = new Rombo(1, 1);
            FiguraGeometrica circ = new Circulo(1);

            figuras.add(c);
            figuras.add(t);
            figuras.add(r);
            figuras.add(circ);

         
          /* System.out.println(lado + "---Cuadrado:   "+c.calcularAreaTodos(figuras, c));
          System.out.println(base + "--" +altura +"----Triangulo:  "+t.calcularAreaTodos(figuras, t));
          System.out.println(dia1 + "--"+ dia2   +"----Rombo:      "+r.calcularAreaTodos(figuras, r));
          System.out.println(rad  + "-----Circulo:    " + circ.calcularAreaTodos(figuras, circ)); */

        

    }
}
