import java.io.Serializable;

/**
 * La clase Pacientes implementa la interfaz Serializable y la interfaz Comparable
 */
public class Pacientes implements Serializable, Comparable<Pacientes>{
   private int habitacion;
   private int cama;
   private String nombre;
   private String apellidos;
   private transient String dieta;//Para que no escriba el dato



   
//Constructor
public Pacientes(int habitacion, int cama, String nombre, String apellidos, String dieta) {
    this.habitacion = habitacion;
    this.cama = cama;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.dieta = dieta;
}

//Getters y Setters
public int getHabitacion() {
    return habitacion;
}
public void setHabitacion(int habitacion) {
    this.habitacion = habitacion;
}
public int getCama() {
    
    return cama;
}
public void setCama(int cama) {
    this.cama = cama;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getApellidos() {
    return apellidos;
}
public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}
public String getDieta() {
    return dieta;
}
public void setDieta(String dieta) {
    this.dieta = dieta;
}
     


/**
 * Comprueba las habitaciones y las camas para ordenarlas en el main
 * 
 * @param o Pacientes
 */
@Override
public int compareTo(Pacientes o) {
    if (this.getHabitacion() > o.getHabitacion()) {
        return 1;
    }else if(this.getHabitacion() < o.getHabitacion()){

        return -1;
    }else{
        if (this.getCama() > o.getCama()) {
            return 1;
        }else if(this.getCama() < o.getCama()){
            return -1;
        }else{
            return 0;
        }
    }
}
//ToString
@Override
public String toString() {
    return "Pacientes [habitacion=" + habitacion + ", cama=" + cama + ", nombre=" + nombre
            + ", apellidos=" + apellidos + ", dieta=" + dieta + "]";
}
  

}