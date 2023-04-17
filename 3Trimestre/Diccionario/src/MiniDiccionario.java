import java.util.HashMap;
import java.util.Random;

public class MiniDiccionario {
    private HashMap<String, String> diccionario;

    // Constructor
    public MiniDiccionario() {
        diccionario = new HashMap<String, String>();
        // añado 20 palabras usando el método put()
        diccionario.put("hola", "hello");
        diccionario.put("adiós", "goodbye");
        diccionario.put("gracias", "thank you");
        diccionario.put("por favor", "please");
        diccionario.put("sí", "yes");
        diccionario.put("no", "no");
        diccionario.put("uno", "one");
        diccionario.put("dos", "two");
        diccionario.put("tres", "three");
        diccionario.put("cuatro", "four");
        diccionario.put("cinco", "five");
        diccionario.put("seis", "six");
        diccionario.put("siete", "seven");
        diccionario.put("ocho", "eight");
        diccionario.put("nueve", "nine");
        diccionario.put("diez", "ten");
        diccionario.put("rojo", "red");
        diccionario.put("verde", "green");
        diccionario.put("azul", "blue");
        diccionario.put("amarillo", "yellow");
    }

    public String traducirPalabra(String palabra) { // metodo que traduce una palabra del español al ingles
        return diccionario.get(palabra); // devuelve la traduccion
    }

    /**
     * funcion para imprimir las palabras del diccionario
     */
    public void listarPalabras() {
        for (String palabra : diccionario.keySet()) {
            System.out.println(palabra + ": " + diccionario.get(palabra));
        }
    }

    /**
     * Devuelve una palabra aleatoria del diccionario
     * 
     * @return una palabra aleatoria del diccionario
     */
    public String palabraAzar() {
        Random r = new Random();
        int index = r.nextInt(diccionario.size());
        return (String) diccionario.keySet().toArray()[index];
    }
}
