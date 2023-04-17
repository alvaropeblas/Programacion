import java.util.Objects;

public class Alumnos{
    String nombre;
    int edad;


    




    @Override
    public int hashCode() {    
        return Objects.hash(nombre, edad);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alumnos other = (Alumnos) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (edad != other.edad)
            return false;
        return true;
    }


    public Alumnos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumnos [nombre=" + nombre + ", edad=" + edad + "]";
    }

    

}
