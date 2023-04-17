public class Nie {
    private String numero;

    public Nie() {

    }

    /**
     * Constructor que recibe el numero de Nie lo valida, lo pasa a mayusculas y si
     * es incorrecto lanza una excepcion personalizada
     */
    public Nie(String numero) throws NieException {
        if (validarNie(numero)) {
            this.numero = numero.toUpperCase();
        } else {
            throw new NieException("Número de NIE inválido: " + numero);
        }
    }

    /**
     * Metodo para validar el Nie
     * 
     * Comprueba la longitud y que no sea nulo
     * 
     * Comprueba que la letra inicial sea correcta
     * 
     * Extraemos los numeros que hay despues de la primera letra y calculamos la
     * letra final
     * 
     * Por ultimo devuelve true o false si la letra final que se ha introducido es
     * la esperada segun el calculo
     * 
     * @param numero Nie a validar
     * @return Un booleano.
     */
    public boolean validarNie(String numero) {
        if (numero == null || numero.length() != 9) {
            return false;
        }
        char letraInicial = numero.charAt(0);
        if (letraInicial != 'X' && letraInicial != 'Y' && letraInicial != 'Z') {
            return false;
        }
        int numeroRestante = Integer.parseInt(numero.substring(1, 8));
        char letraFinal = numero.charAt(8);
        int resto = numeroRestante % 23;
        String letrasValidas = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letraEsperada = letrasValidas.charAt(resto);
        return letraFinal == letraEsperada;
    }

    // Getters y Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // ToString
    @Override
    public String toString() {
        return "Nie [" + numero + "]";
    }

}
