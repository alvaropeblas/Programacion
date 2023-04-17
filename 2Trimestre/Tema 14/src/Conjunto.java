
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Conjunto {// SET
    public static void main(String[] args) {
        Set<String> hashSet = new LinkedHashSet<>();

        String ww = "Warwick";
        String thor = "Thor";
        String superman = "Superman";
        String batman = "Batman";
        String magneto = "Magneto";
        String tormenta = "Tormenta";

        hashSet.add(ww);
        hashSet.add(thor);
        hashSet.add(superman);
        hashSet.add(batman);
        hashSet.add(magneto);
        hashSet.add(tormenta);

        String Thor = "Thor";

        hashSet.add(Thor);
        System.out.println(hashSet);

        if (hashSet.contains("Thor")) {
            hashSet.remove("Thor");
        }

        System.out.println(hashSet);

        if (hashSet.contains("Hulk")) {
            System.out.println("El super existe");
        } else {
            System.out.println("El super no existe");
        }

        if (hashSet.contains(tormenta)) {
            hashSet.remove(tormenta);
            hashSet.add("Fenix");
        }

        System.out.println(hashSet);

    }

}
