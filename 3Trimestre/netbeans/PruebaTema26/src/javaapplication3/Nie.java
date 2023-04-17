package javaapplication3;

import java.util.Random;

public class Nie {

    private String numero;

    public Nie() {

    }

    public Nie(String numero) {
        if (validarNie(numero)) {
            this.numero = numero.toUpperCase();
        }
    }

    /**
     * Genera un número de Identificación Extranjero (NIE) válido de forma
     * aleatoria.
     *
     * @return Una cadena de caracteres que representa el NIE generado.
     */
    public String generarNie() {
        // Crear un objeto de la clase Random para generar números aleatorios.
        Random ran = new Random();

        // Crear un array de caracteres que contiene las letras iniciales válidas
        char[] caracteres = {'X', 'Y', 'Z'};

        int num = ran.nextInt(9999999) + 1;
        // Seleccionar aleatoriamente una de las tres letras iniciales del NIE.
        int dig = ran.nextInt(2);
        char car = caracteres[ran.nextInt(2)];

        int resto = (num + dig) % 23;
    

        String letrasValidas = "TRWAGMYFPDXBNJZSQVHLCKE";

        char letraEsperada = letrasValidas.charAt(resto);

        String num1 = String.valueOf(car);

        String num2 = String.valueOf(num);

        String num3 = String.valueOf(letraEsperada);
        // Concatenar las letras iniciales, el número aleatorio generado y la letra obtenida anteriormente para formar el Nie.
        return (num1 + num2 + num3);
    }
    

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
        return numero;
    }

}
