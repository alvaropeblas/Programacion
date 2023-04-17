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

    /**
     * * Constructor que recibe un String y lo valida. Si no es válido, establece el
     * valor en 00000000.
     * 
     * @param dni
     */
    public Dni(String dni) {
        if (validaNumDni(dni)) {
            this.numDni = dni;
        } else {
            this.numDni = "00000000";

        }
        this.letra = this.obtenerLetra();

    }

    /**
     * * Toma el número del DNI y lo divide por 23, luego devuelve el resto de la
     * división
     * 
     * @return El método obtenerLetra() devuelve la letra correspondiente al número
     *         de DNI.
     */
    public char obtenerLetra() {
        final char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
                'V', 'H', 'L', 'C', 'K', 'E' };

        int resto;
        resto = Integer.parseInt(numDni) % 23;
        return letras[resto];
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

}
