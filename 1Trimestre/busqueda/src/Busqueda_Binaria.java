public class Busqueda_Binaria {
    public static void main(String[] args) throws Exception {
        
       int[] array = {1,3,5,7,11,17,19,23,29,31,37,41,43,47,53,59};
       int solucion = BusquedaBinaria(array, 0);
       System.out.println(+solucion);
    }

public static int BusquedaBinaria(int[] array, int elemento){
    elemento = 37;
    int inicio = 0;
    int fin = array.length -1;
    int poscicion_buscar;
    while (inicio <= fin){
        poscicion_buscar = (inicio + fin)/2;
        if (array[poscicion_buscar] == elemento){
            return poscicion_buscar;
        }else{
            if(elemento > array[poscicion_buscar]){
                inicio = poscicion_buscar +1;
            }else{
                fin = poscicion_buscar -1;
            }
            }
        }
    return -1;
    }
}
