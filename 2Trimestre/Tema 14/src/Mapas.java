import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[]args) {

        Map<String,  ArrayList<String>> pais = new HashMap<>();
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Cordoba");
        ciudades.add("Sevilla");
        ciudades.add("Madrid");

        pais.put("España", ciudades);
        /* pais.put("Francia", "Paris");
        pais.put("Alemania", "Berlin"); */

        System.out.println(pais.get("España"));
        System.out.println(pais.get("Francia"));
        System.out.println(pais.get("Alemania"));

        
        
        pais.remove("Francia");
        System.out.println(pais.containsKey("España"));
/*         System.out.println(pais.containsValue("Madrid")); */
        System.out.println(pais);
        System.out.println(pais.get("España"));
    }
}
