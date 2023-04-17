public class App {
    public static void main(String[] args) throws Exception {
        String cadena = "Hola";
        char letra = 'l';

        int indice = App.busquedalineal(cadena, letra);
        System.out.println("La letra " + letra + " se encuentra la posicion" + indice);
    }
    public static int busquedalineal (String cad, char l){
        for (int i = 0; i < cad.length(); i++){
            if (l == cad.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
