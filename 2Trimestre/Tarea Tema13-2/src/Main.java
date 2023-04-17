import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static Pacientes p;

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ArrayList<Pacientes> lista = new ArrayList<>();

        int caso;
        do {
            System.out.println("1: Añadir paciente");
            System.out.println("2: listar pacientes");
            System.out.println("3: Buscar Paciente");
            System.out.println("0: Salir del programa");
            caso = sc.nextInt();
            switch (caso) {

                case 1:
                    System.out.println("Escribe nombre del paciente");
                    String nombre = sc.next();
                    System.out.println("Escribe los apellidos del paciente");
                    String apellidos = sc.next();
                    System.out.println("Escribe la habitación");
                    int numhab = sc.nextInt();
                    System.out.println("Escribe la cama");
                    int numcama = sc.nextInt();
                    // Comprueba si el número de la cama está entre 1 y 3. Si no es así, imprimirá
                    // un mensaje y volverá a empezar el programa.
                    if (numcama < 1 || numcama > 3) {
                        System.out.println("numero de cama incorrecto");
                        break;
                    }
                    System.out.println("Escribe la dieta del paciente");
                    String dieta = sc.next();
                    p = new Pacientes(numhab, numcama, nombre, apellidos, dieta);

                    // LLama al metodo, si es true, se añade el paciente a la lista y llama al
                    // metodo para escribir en el fichero.
                    if (comprobarDisp(lista, p)) {
                        lista.add(p);
                        anadirPacientes(p);
                        System.out.println("Se añadió el paciente");
                    } else {
                        System.out.println("No se añadió el paciente");
                    }

                    break;
                case 2:
                    listarPacientes();
                    break;

                case 3:
                    System.out.println("Escribe la habitación");
                    int hab = sc.nextInt();
                    System.out.println("Escribe la cama");
                    int cama = sc.nextInt();
                    buscarPacientes(hab, cama);
                    break;
            }

        } while (caso != 0);
        sc.close();
    }

    /**
     * Lee un archivo, y si el archivo contiene un objeto Pacientes con los mismos
     * valores que los parámetros, lo imprime
     * 
     * @param n1 numero de habitacion
     * @param n2 numero de cama
     */
    public static void buscarPacientes(int n1, int n2)
            throws IOException, ClassNotFoundException {
        FileInputStream fic = null;
        ObjectInputStream flujo = null;
        try {
            fic = new FileInputStream("pacientes.dat");
            ArrayList<Pacientes> texto = new ArrayList<Pacientes>();

            while (fic.available() > 0) {
                flujo = new ObjectInputStream(fic);
                texto.add((Pacientes) flujo.readObject());
            }
            for (Pacientes pacientes : texto) {
                if (pacientes.getHabitacion() == n1 && pacientes.getCama() == n2) {
                    System.out.println("paciente encontrado\nPaciente: " + pacientes.toString());
                }
            }

        } catch (Exception e) {
            System.out.println("Error leyendo el fichero: " + e.getMessage());
        } finally {
            try {
                flujo.close();
                fic.close();
            } catch (Exception e) {
                System.out.println("Error cerrando el fichero: " + e.getMessage());
            }
        }

    }

    /**
     * Metodo que escribe un objeto Paciente en el fichero
     * 
     * @param p
     */
    public static void anadirPacientes(Pacientes p) {
        FileOutputStream fichero = null;
        ObjectOutputStream flujosalida = null;

        try {

            fichero = new FileOutputStream("pacientes.dat", true);
            flujosalida = new ObjectOutputStream(fichero);
            flujosalida.writeObject(p);

        } catch (IOException e) {

            System.out.println("Error escribiendo el fichero: " + e.getMessage());
        } finally {
            try {
                flujosalida.close();
                fichero.close();
            } catch (IOException e) {
                System.out.println("Error cerrando el fichero: " + e.getMessage());
            }
        }
    }

    /**
     * Comprueba si la cama está disponible en la habitación.
     * 
     * @param lista ArrayList ode Pacientes
     * @param p     Es el paciente que quiero agregar al archivo
     * @return comprobador
     */
    public static boolean comprobarDisp(ArrayList<Pacientes> lista, Pacientes p) {
        FileInputStream fic = null;
        ObjectInputStream flujo = null;
        boolean disp = true;
        try {
            fic = new FileInputStream("pacientes.dat");
            while (fic.available() > 0) {
                flujo = new ObjectInputStream(fic);
                lista.add((Pacientes) flujo.readObject());
            }
            

            Iterator<Pacientes> it = lista.iterator();
            while (it.hasNext()) {
                Pacientes al = it.next();
                if (al.getHabitacion() == p.getHabitacion()) {
                    if (al.getCama() != p.getCama()) {
                        disp = true;
                    } else {
                        disp = false;
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error leyendo el fichero: " + e.getMessage());
        } finally {
            try {
                flujo.close();
                fic.close();
            } catch (Exception e) {
                System.out.println("Error cerrando el fichero: " + e.getMessage());
            }
        }
        return disp;
    }

    /**
     * Lee el archivo, crea una ArrayList de Pacientes, ordena la ArrayList e
     * imprime los pacientes
     */
    public static void listarPacientes() throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fic = null;
        ObjectInputStream flujo = null;
        try {
            fic = new FileInputStream("pacientes.dat");
            ArrayList<Pacientes> texto = new ArrayList<Pacientes>();

            while (fic.available() > 0) {
                flujo = new ObjectInputStream(fic);
                texto.add((Pacientes) flujo.readObject());
            }

            Collections.sort(texto);
            for (Pacientes pacientes : texto) {
                System.out.println(pacientes);
            }

        } catch (Exception e) {
            System.out.println("Error leyendo el fichero: " + e.getMessage());
        } finally {
            try {
                flujo.close();
                fic.close();
            } catch (Exception e) {
                System.out.println("Error cerrando el fichero: " + e.getMessage());
            }
        }

    }

}
