public class Alumno extends Persona {
    private float notaMedia;


    @Override
    public String toString() {
        return super.toString() + ", Nota media: " + notaMedia;
    }
    public Alumno(String nombre, int edad, float notaMedia) {
        super(nombre, edad);
        this.notaMedia = notaMedia;
    }
    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

}
