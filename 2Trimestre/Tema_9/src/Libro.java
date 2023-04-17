
import java.util.*;


/**
 * * La clase Libro tiene un ArrayList privado de Paginas
 */
public class Libro {
    private ArrayList<Paginas> paginas = new ArrayList<Paginas>();

    @Override
    public String toString() {
        return "LIBRO ------ PAGINAS : " + paginas;
    }

  
 // Constructor
    public Libro() {
    }

   
  /**
   * * Metodo para añadir una pagina al libro.
   * 
   * @param numPag Numero de pagina
   * @param texto texto que se añadirá a la pagina.
   */
    public void añadirPagina(int numPag, String texto) {
       paginas.add(new Paginas(numPag, texto));
    }

    
   /**
    * * Metodo para eliminar paginas.
    * 
    * @param pag Numero de pagina a eliminar.
    * @return True si puede eliminar la pagina, false si no puede eliminarla.
    */
    public boolean eliminarPagina(int pag) {
        if(pag <= paginas.size()){
            paginas.remove(paginas.get(pag - 1));
            return true;
        }else{
            return false;
        }
    }

    
    /**
     * * Reemplaza el texto de una página con el texto pasado   como parámetro.
     * 
     * @param numPag El número de página a reemplazar.
     * @param texto El texto que se escribirá en la página.
     */
    public void reemplazarPagina(int numPag, String texto) {
            paginas.get(numPag - 1).setTexto(texto);      
    }

/**
 * * Esta función imprime el texto de una página
 * 
 * @param pag El numero de la pagina.
 */
    public void obtenerContenido(int pag) {
        System.out.println(paginas.get(pag - 1).getTexto());
    }
//Getters y setters.
    public ArrayList<Paginas> getPaginas() {
        return paginas;
    }

    public void setPaginas(ArrayList<Paginas> paginas) {
        this.paginas = paginas;
    }

}