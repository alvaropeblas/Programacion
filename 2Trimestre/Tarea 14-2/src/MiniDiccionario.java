import java.util.HashMap;


public class MiniDiccionario{

    static HashMap<String, String> palabras;

    public MiniDiccionario() {
        palabras = new HashMap<>();
        palabras.put("Hola", "Hello");
        palabras.put("Mar", "Sea");
        palabras.put("Guitarra", "Guitar");
        /* palabras.put("Hola", "Hello");
        palabras.put("Hola", "Hello");
        palabras.put("Hola", "Hello");
        palabras.put("Hola", "Hello");
        palabras.put("Hola", "Hello");
        palabras.put("Hola", "Hello");
        palabras.put("Hola", "Hello");
        palabras.put("Hola", "Hello");
        palabras.put("Hola", "Hello");
        palabras.put("Hola", "Hello");
        palabras.put("Hola", "Hello");
        palabras.put("Hola", "Hello");
        palabras.put("Hola", "Hello"); */
    }
public String listarPalabras(){
  
    
    return palabras.toString();

}    
}