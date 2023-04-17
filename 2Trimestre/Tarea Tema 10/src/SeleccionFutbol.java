import java.util.ArrayList;

public class SeleccionFutbol {
    private int id;
    private String nombre;
    private Mundial mundial;
    ArrayList<Persona> equipos = new ArrayList<>();
    Entrenador entrenador;
    Fisioterapeuta fisioterapeuta;

/*Constructor */
    public SeleccionFutbol(int id, String nombre, Mundial mundial, Entrenador entrenador,
            Fisioterapeuta fisioterapeuta) {
        this.id = id;
        this.nombre = nombre;
        this.mundial = mundial;
        this.entrenador = entrenador;
        this.fisioterapeuta = fisioterapeuta;
    }

/*Getter y Setter */
/*Un bucle for que itera a través de los equipos de la lista de arreglos y verifica si el objeto es un
          instancia de Entrenador. Si lo es, devuelve el objeto como Entrenador. Si no lo es,
         lanza una excepción. */
    public Entrenador getEntrenador() throws PersonaNotFound{
        for (Persona persona : equipos) {
            if(persona instanceof Entrenador){
                return (Entrenador) persona;
            }            
        }
        throw new PersonaNotFound("El entrenador no exite");
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

/*Un bucle for que itera a través de los equipos de la lista de arreglos y verifica si el objeto es un
          instancia de Fisioterapeuta. Si lo es, devuelve el objeto como Fisioterapeuta. Si no lo es,
         lanza una excepción. */
    public Fisioterapeuta getFisioterapeuta() throws PersonaNotFound {
        for (Persona persona : equipos) {
            if(persona instanceof Fisioterapeuta){
                return (Fisioterapeuta) persona;
            }            
        }
        throw new PersonaNotFound("El fisio no exite");
    }

    public void setFisioterapeuta(Fisioterapeuta fisioterapeuta) {
        this.fisioterapeuta = fisioterapeuta;
    }

    public ArrayList<Persona> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Persona> equipos) {
        this.equipos = equipos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mundial getMundial() {
        return mundial;
    }
    
    public void setMundial(Mundial mundial) {
        this.mundial = mundial;
    }




    





    @Override
    public String toString() {
        return "SeleccionFutbol [id=" + id + ", nombre=" + nombre + ", mundial=" + mundial + "]";
    }





    public boolean asignarMundial(Mundial m){
        if (this.mundial != m) {
            setMundial(m);
            return true;
        } else {
            return false;
        }
    }
    public boolean borrarMundial(){
        setMundial(null);
        return true;
    }
    public boolean añadirPersona(Persona p){

        for (Persona persona : equipos) {
            if (persona.getId() == p.getId()) {
                return false;
            }
        }
        equipos.add(p);
        return true;
    }

    public boolean borrarPersona(int id){
        for (Persona persona : equipos) {
            if (persona.getId() == id) {
                equipos.remove(persona);
                return true;
            } 
        }
        return false;
    }
     public void listarIntegrantes(){
        for (Persona persona : equipos) {
            System.out.println(persona);
            
        }
        
    }
 


   


}
