public class CifPrueba {

    public static String letrasPermitidas = "ABCDEFGHPQSKLM";// Al hacerlo estatico funciona a nivel de clase, no define
                                                             // a la misma
    private Character letraI;
    private String numeracion;
    private Character cod;// Utilizamos tipo primitivo para poder ponerlo anull

    public CifPrueba() {
        this.letraI = null;
        this.numeracion = null;
        this.cod = null;
    }

    public CifPrueba(Character c, String n) throws Exception {
        this();
        if (letrasPermitidas.contains(c + "")) {
            if (n.length() == 7) {
              try {
                Integer.parseInt(n);
                this.letraI = c;
                this.numeracion = n;
                calcularCodigo();
              } catch (Exception e) {
                
              }
            }else{
                throw new Exception("La letra no e spermitida");
            }
        }

    }

    public static String getLetrasPermitidas() {
        return letrasPermitidas;
    }

    public static void setLetrasPermitidas(String letrasPermitidas) {
        CifPrueba.letrasPermitidas = letrasPermitidas;
    }

    public Character getLetraI() {
        return letraI;
    }

    public void setLetraI(Character letraI) {
        this.letraI = letraI;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    public Character getCod() {
        return cod;
    }

    public void setCod(Character cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "CifPrueba [letraI=" + letraI + ", numeracion=" + numeracion + ", cod=" + cod + "]";
    }

    private void calcularCodigo() {
        // 5258798
        int bloque1 = 0;
        int bloque2 = 0;

        for (int i = 0; i < this.numeracion.length(); i++) {
            // Impares
            if ((i + 1) % 2 == 0) {
                //5*2=10 -> 1+0 = 1 
                //5*2=10 -> 1+0 = 1 
                //7*2=14 -> 1+4 = 5
                //8*2=16 -> 1+6 = 7
                //1+1+5+7 = 14

                String temp = Integer.parseInt((this.numeracion.charAt(i)*2)+"")+"";

                int temp2 = 0;
                for(int j = 0; j< temp.length(); j++){
                     temp2+=Integer.parseInt(temp.charAt(j)+"");
                }
                bloque1 += temp2;

            }
            // Pares
            else {
                // 2+8+9=19
                // 0+2=2
                // 2+8=10
                // 10+9=19
                bloque2 += Integer.parseInt(this.numeracion.charAt(i)+"");
            }

            //14 + 19 = 33 -> 3
            String res = (bloque1 + bloque2)+"";
            int unidad = Integer.parseInt(res.charAt(res.length()-1)+"");

            //10-3 = 7

            if(unidad == 0){
                this.cod = 0;
            }else{
                this.cod = String.valueOf(10-unidad).charAt(0);
            }
        }
    }
}
