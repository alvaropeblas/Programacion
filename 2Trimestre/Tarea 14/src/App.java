import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class App {
    public static void main(String[] args) throws Exception {
        Pacientes P1 = new Pacientes(1, 1, 1, "a", "a", null);
        Pacientes P2 = new Pacientes(2, 2, 1, "b", "b", null);
        Pacientes P3 = new Pacientes(3, 3, 1, "a", "a", null);
        Pacientes P4 = new Pacientes(4, 2, 2, "a", "a", null);
        Pacientes P5 = new Pacientes(5, 1, 2, "a", "a", null);

        TreeSet<Pacientes> lista = new TreeSet<Pacientes>();


                anadirPacientes(P1);
                anadirPacientes(P2);
                anadirPacientes(P3);
                anadirPacientes(P4);
                anadirPacientes(P5);

            lista = listarPacientes();
            
            creacionXml(lista);



    }
 /**
     * Lee el archivo, crea una ArrayList de Pacientes, ordena la ArrayList e
     * imprime los pacientes
     */
    public static TreeSet<Pacientes> listarPacientes() throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fic = null;
        ObjectInputStream flujo = null;
        TreeSet<Pacientes> lista = null;
        try {
            fic = new FileInputStream("pacientes.dat");
            lista = new TreeSet<Pacientes>();

            while (fic.available() > 0) {
                flujo = new ObjectInputStream(fic);
                lista.add((Pacientes) flujo.readObject());
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
        return lista;
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
    public static void creacionXml(TreeSet<Pacientes> l) {
        try {
            DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbfactory.newDocumentBuilder();
            Document doc = db.newDocument();

            File f = new File("pacientes.xml");
            StreamResult result = new StreamResult(f);
            Element eRaiz = doc.createElement("pacientes");
            doc.appendChild(eRaiz);

            for (Pacientes p : l) {
                Element eNombre = doc.createElement(p.getNombre());
                eRaiz.appendChild(eNombre);

                Element eApellidos = doc.createElement(p.getApellidos());
                eRaiz.appendChild(eApellidos);

                Element eHabitacion = doc.createElement(Integer.toString(p.getHabitacion()));
                eRaiz.appendChild(eHabitacion);

                Element eCama = doc.createElement(Integer.toString(p.getCama()));
                eHabitacion.appendChild(eCama);
            }

            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer t = tFactory.newTransformer();
            DOMSource s = new DOMSource(doc);
            t.transform(s, result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
