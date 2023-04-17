import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * *Clase Dni
 * 
 * @param numDni
 * @param letra
 */
public class Dni {
    private String numDni;
    private char letra;


    public Dni() {
        
    }

    /**
     * * Constructor que recibe un String y lo valida. Si no es válido, establece el
     * valor en 00000000.
     * 
     * @param dni
     */
    public Dni(String dni, char l) throws DniExcepcion {
        if(validaNumDni(dni) && obtenerLetra(dni) == l){
            this.numDni = dni;
            this.letra = l;
        }else{
            throw new DniExcepcion("EL dni introducido no es correcto");
        }

    }

    /**
     * * Toma el número del DNI y lo divide por 23, luego devuelve el resto de la
     * división
     * 
     * @return El método obtenerLetra() devuelve la letra correspondiente al número
     *         de DNI.
     */
    public char obtenerLetra(String dni) {
        HashMap<Integer, Character> letraNumero = new HashMap<>();
        letraNumero.put(0, 'T');
        letraNumero.put(1, 'R');
        letraNumero.put(2, 'w');
        letraNumero.put(3, 'A');
        letraNumero.put(4, 'G');
        letraNumero.put(5, 'M');
        letraNumero.put(6, 'Y');
        letraNumero.put(7, 'F');
        letraNumero.put(8, 'P');
        letraNumero.put(9, 'D');
        letraNumero.put(10, 'X');
        letraNumero.put(11, 'B');
        letraNumero.put(12, 'N');
        letraNumero.put(13, 'J');
        letraNumero.put(14, 'Z');
        letraNumero.put(15, 'S');
        letraNumero.put(16, 'Q');
        letraNumero.put(17, 'V');
        letraNumero.put(18, 'H');
        letraNumero.put(19, 'L');
        letraNumero.put(20, 'C');
        letraNumero.put(21, 'K');
        letraNumero.put(22, 'E');
        
        int resto;
        resto = Integer.parseInt(dni) % 23;

        
        return letraNumero.get(resto);
    }

    /**
     * *Comprueba si la cadena tiene 8 dígitos y, si los tiene, devuelve verdadero
     * 
     * @param dni El DNI a validar.
     * @return Un valor booleano.
     */
    public boolean validaNumDni(String dni) {
        String regex = "[\\d]{8}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(dni);
        return m.matches();
    }

    /**
     * * La función devuelve una cadena que contiene el número de DNI y la letra del
     * DNI
     * 
     * @return Se devuelve el método toString().
     */
    @Override
    public String toString() {
        return ", DNI= " + numDni + ", letra= " + letra;
    }

    // Getters y setters.
    public void setNumeroDNI(String nuevoNum) {
        this.numDni = nuevoNum;
    }

    public String getNumeroDNI() {
        return this.numDni;
    }
    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

}
