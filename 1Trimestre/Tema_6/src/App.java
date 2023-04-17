public class App {
    public static void main(String[] args){
       
        Coche coche = new Coche();
        
            System.out.println("COCHE 1");

                System.out.println("Marca: " + coche.marca);
        
                System.out.println("Modelo: " + coche.modelo);

                System.out.println("Color: " + coche.color);
        
                System.out.println("Matricula: " + coche.matricula);

        

        Coche coche2 = new Coche("Audi", "TT", "negro", "4321 CBA");
        
            System.out.println("COCHE 2");
        
                System.out.println("Marca: " + coche2.marca);
        
                System.out.println("Modelo: " + coche2.modelo);
        
                System.out.println("Color: " + coche2.color);
        
                System.out.println("Matricula: " + coche2.matricula);

            

        Coche coche3 = new Coche("Seat", "Leon");

            System.out.println("COCHE 3");
             
                System.out.println("Marca: " + coche3.marca);
        
                System.out.println("Modelo: " + coche3.modelo);
        
                System.out.println("Color: " + coche3.color);
        
                System.out.println("Matricula: " + coche3.matricula);

        Coche coche4 = new Coche("Volvo", "xv" );
        Coche otro = new Coche(coche4);
        System.out.println(coche4);
        System.out.println(otro);
        otro.setMarca("Ferrari");
        System.out.println(coche4);
        System.out.println(otro);
    }
}
