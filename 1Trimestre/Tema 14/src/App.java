import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {


        ArrayList<Character> alfabeto = new ArrayList<Character>();

        for(char i = 'A'; i<='Z'; i++){
            alfabeto.add(i);
        }

        System.out.println(alfabeto);

        int pos1 = alfabeto.indexOf('E');

        int pos2 = alfabeto.indexOf('H');

        int pos3 =  alfabeto.indexOf('O');

        System.out.println("La letra E, esta en la posicion: " + pos1);
        System.out.println("La letra H, esta en la posicion: " + pos2);
        System.out.println("La letra O, esta en la posicion: " + pos3);

        alfabeto.remove(1);
        

        alfabeto.remove(alfabeto.indexOf('U'));

        

        System.out.println(alfabeto);
    }
}
