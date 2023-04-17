import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author MEDAC
 */
public class Cif {

   
    private char letraInicial;
    private String numeros;
    private String numFinal;
    



    public Cif(char letraInicial, String numeros, String numFinal) {
        if(validaNumCif(obtenerNumeros()) && validarLetra(letraInicial)){
            this.letraInicial = letraInicial;
            this.numeros = numeros;
            this.numFinal = numFinal;
        }
    }

    public Cif() throws CifException{
        
        this.numeros = obtenerNumeros();
        this.letraInicial = obtenerCaracter();
        this.numFinal = calculoDigitoFinal();
    }



     /**
     * *Comprueba si la cadena tiene 9 dígitos y, si los tiene, devuelve verdadero
     * 
     * @param c El Cif a validar.
     * @return Un valor booleano.
     */
    public boolean validaNumCif(String num) {
        String regex = "[\\d]{7}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(num);
        return m.matches();
    }

    public boolean validarLetra(char l){
        char[] caracteres = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'P', 'Q', 'S', 'K', 'L', 'M'};
        char[] carEntrada = {l};
        if(caracteres.equals(carEntrada)){
            return true;
        }else{
            return false;
        }
    }


    public int calculoCifraFinalPares(String numcif) {
        String n1 = obtenerNumeros();
        char n0 = n1.charAt(0);
        char n2 = n1.charAt(2);
        char n4 = n1.charAt(4);
        char n6 = n1.charAt(6);

        int v0 = Character.getNumericValue(n0);
        int v2 = Character.getNumericValue(n2);
        int v4 = Character.getNumericValue(n4);
        int v6 = Character.getNumericValue(n6);

        int suma = v0 + v2 + v4 + v6;

        return suma;
    }
    /**
     * *
     * Metodo que genera un cif aleatorio
     *
     * Recibe en 3 String las cadenas resultantes de otros metodos.
     *
     * @return res
     */
    public String generarCif() {

        String c1 = String.valueOf(obtenerCaracter());

        String c2 = obtenerNumeros();

        String c3 = calculoDigitoFinal();

        String res = c1 + c2 + c3;

        return res;

    }

    /**
     * Metodo para obtener la primera letra del cif de manera aleatoria
     *
     * @return car -> devuelve la letra encontrada en la posicion aleatoria del
     * array
     */
    public char obtenerCaracter() {
        Random n = new Random();

        char[] caracteres = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'P', 'Q', 'S', 'K', 'L', 'M'};

        char car = caracteres[n.nextInt(13)];

        return car;
    }

    /**
     * Metodo que devuelve los 7 numeros que hay entre el caracter inicial y el
     * digito de control
     *
     * @return nume -> Devuelve un numero aleatorio de 7 cifras
     */
    public String obtenerNumeros() {
        Random n = new Random();

        int num = n.nextInt(9999999);

        String nume = String.valueOf(num);

        return nume;
    }

    /**
     * Metodo que recoge los caractreres numericos encontrados en las posiciones
     * pares de la cadena aleatoria, y después los suma
     *
     * @return suma
     */
    public int calculoCifraFinalPares() {
        String n1 = obtenerNumeros();
        char n0 = n1.charAt(0);
        char n2 = n1.charAt(2);
        char n4 = n1.charAt(4);
        char n6 = n1.charAt(6);

        int v0 = Character.getNumericValue(n0);
        int v2 = Character.getNumericValue(n2);
        int v4 = Character.getNumericValue(n4);
        int v6 = Character.getNumericValue(n6);

        int suma = v0 + v2 + v4 + v6;

        return suma;
    }

    /**
     * Metodo que recoge las posiciones impares de la cadena aleatoria. Los
     * multiplica por dos. El resultado obtenido se convierte en un String al
     * que se accedera a sus dos posiciones y las sumara entre si. Si el
     * resultado es un número de una sola cifra le añadirá un 0 a la izquierda.
     * Por último sumara estos valores y lo devolverá.
     *
     * @return suma
     */
    public int calculoCifraFinalImpares() {
        String n = obtenerNumeros();

        char n1 = n.charAt(1);
        char n3 = n.charAt(3);
        char n5 = n.charAt(5);

        int v1 = Character.getNumericValue(n1);
        int v3 = Character.getNumericValue(n3);
        int v5 = Character.getNumericValue(n5);

        int b1 = v1 * 2;
        String valor1 = String.valueOf(String.format("%02d", b1));
        int suma1 = valor1.charAt(0) + valor1.charAt(1);

        int b3 = v3 * 2;
        String valor3 = String.valueOf(String.format("%02d", b3));
        int suma3 = valor3.charAt(0) + valor3.charAt(1);

        int b5 = v5 * 2;
        String valor5 = String.valueOf(String.format("%02d", b5));
        int suma5 = valor5.charAt(0) + valor5.charAt(1);

        int suma = suma1 + suma3 + suma5;

        return suma;
    }

    /**
     * Metodo que calcula el digito de control final. Suma el resultado de los
     * metodos anteriores. De este resultado Accede a su ultima posicion y se lo
     * restará a 10. Si el resultado anterior es un número de una cifra se le
     * añadirá un 0 a la izquierda.
     *
     * @return res
     */
    public String calculoDigitoFinal() {
        int suma = calculoCifraFinalPares() + calculoCifraFinalImpares();

        String n1 = String.valueOf(suma);

        String n2 = String.format("%02d", Character.getNumericValue(n1.charAt(1)));

        int n = Integer.parseInt(n2);

        int r = 10 - n;

        String res = String.valueOf(r);

        return res;
    }

    public char getLetraInicial() {
        return letraInicial;
    }

    public void setLetraInicial(char letraInicial) {
        this.letraInicial = letraInicial;
    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }

    public String getnumFinal() {
        return numFinal;
    }

    public void setnumFinal(String numFinal) {
        this.numFinal = numFinal;
    }

    @Override
    public String toString() {
        return "Cif [letraInicial=" + letraInicial + ", numeros=" + numeros + ", numFinal=" + numFinal + "]";
    }

}
