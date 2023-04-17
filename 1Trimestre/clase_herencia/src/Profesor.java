public class Profesor extends Persona {
   private float sueldo;

@Override
public String toString() {
    return super.toString() + ", sueldo: " + sueldo;
}

public Profesor(String nombre, int edad, float sueldo) {
    super(nombre, edad);
    this.sueldo = sueldo;
}

public float getSueldo() {
    return sueldo;
}

public void setSueldo(float sueldo) {
    this.sueldo = sueldo;
}
}
