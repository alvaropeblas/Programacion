import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {


       ArrayList<Integer> lista = new ArrayList<Integer>();

       for(int i = 0; i<10; i++){
        lista.add(i);
       }


       boolean estael14 = lista.contains(14);

       lista.remove(4);

       System.out.println(estael14);

       System.out.println(lista);

       for (Integer i: lista){
        System.out.println(i);
       }

       Iterator <Integer> iterator = lista.iterator();
       while(iterator.hasNext()){
        System.out.print(iterator.next());
       }

       
    }
}
