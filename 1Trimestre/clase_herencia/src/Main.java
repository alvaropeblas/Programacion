public class Main {
    public static void main(String[] args){
        Alumno alumno = new Alumno("Alvaro", 0, 0);
        System.out.println(alumno);
        Profesor profe = new Profesor("Yoni", 55, 2500);
        System.out.println(profe);


        Persona p = new Profesor(null, 0, 0);

        System.out.println(p);
    }
    
}
