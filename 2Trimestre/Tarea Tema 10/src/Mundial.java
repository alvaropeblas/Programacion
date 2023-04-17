import java.util.ArrayList;
/*Clase Mundial */
public  class Mundial {
    private int id;
    private int anyo;
    private ArrayList<SeleccionFutbol> selecciones = new ArrayList<>();

/*Constructor */
    public Mundial(int id, int anyo) {
        this.id = id;
        this.anyo = anyo;
    }
/**
 * Metodo para añadir seleccion dentro del arraylist, Controlamos si existe, si no existe lo añade.
 * @param s Seleccion que queremos añadir
 * @return true o false
 */
    public boolean asignarSeleccion(SeleccionFutbol s){
       for (SeleccionFutbol seleccionFutbol : selecciones) {
        if (s.getId() == seleccionFutbol.getId()) {
            return false;
        } 
       }
       selecciones.add(s);
       return true;
    }

    /**
 * Metodo para eliminar seleccion dentro del arraylist, Controlamos si existe, si  existe lo elimina.
 * @param s Seleccion que queremos añadir
 * @return true o false
 */
    public boolean borrarSeleccion(int id){
        for (SeleccionFutbol seleccionFutbol : selecciones) {
            if (seleccionFutbol.getId() == id) {      
                selecciones.remove(seleccionFutbol);
                return true;
            }
        }
        return false;
    }

    

/*Getter y Setter */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAnyo() {
        return anyo;
    }
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    public ArrayList<SeleccionFutbol> getSelecciones() {
        return selecciones;
    }
    public void setSelecciones(ArrayList<SeleccionFutbol> selecciones) {
        this.selecciones = selecciones;
    }

    @Override
    public String toString() {
        return "Mundial [id=" + id + ", anyo=" + anyo + ", selecciones=" + selecciones + "]";
    }
    
    
}
