import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Alumnos> lista = new ArrayList<>();
        

        lista.add(new Alumnos("Juan", 18));
        lista.add(new Alumnos("Pepe", 33));
        lista.add(new Alumnos("Maria", 25));
        lista.add(new Alumnos("Juan", 21));
        lista.add(new Alumnos("Juan", 21));
        lista.add(new Alumnos("Carmen", 44));
        lista.add(new Alumnos("Luis", 20));
        lista.add(new Alumnos("Rafael", 34));
        lista.add(new Alumnos("Laura", 28));
        lista.add(new Alumnos("Francisco", 28));
        Alumnos a1 = new Alumnos("Juan", 10);
        Alumnos a2 = new Alumnos("Juan", 10);


        System.out.println(a1.equals(a2));

        /*
         * for (Alumnos alumnos : lista) {
         * if (alumnos.getNombre() == "Juan" && alumnos.getEdad() > 20) {
         * lista.remove(alumnos);
         * }
         * 
         * }
         */

        /*
         * for(int i = 0; i < lista.size(); i++){
         * if (lista.get(i).getNombre() == "Juan" && lista.get(i).getEdad() > 20) {
         * lista.remove(i);
         * }
         * }
         */

        
        /* for(int i = 0; i < lista.size(); i++){
            Alumnos alu = lista.get(i);
            if (alu.getNombre().equals("Juan") && alu.getEdad()> 20) {
                
            }
        }

        //Crear iterador antes de recorrer la lista
        Iterator<Alumnos> it = lista.iterator();
        while (it.hasNext()) {
            Alumnos al = it.next();
            if (al.getNombre() == "Juan" && al.getEdad() > 20) {
                it.remove();
            }
        }
        System.out.println(lista + "\n");

    } */
}
}
