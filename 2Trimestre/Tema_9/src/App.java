import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);      
        int caso;
        Libro libro;

do {

    System.out.println("Pulse 1 para crear un libro");
        caso = sc.nextInt();
        int caso2;
  
        switch (caso) {
            case 1:
             libro = new Libro();
            do {
                        System.out.println("Pulse 1 para añadir una pagina");
                        System.out.println("Pulse 2 para eliminar una pagina");
                        System.out.println("Pulse 3 para reemplazar una pagina");
                        System.out.println("Pulse 4 para mostrar el contenido de una pagina");
                        System.out.println("Pulse 5 para mostrar el contenido del libro");
                        System.out.println("Pulse 0 para volver");
                        caso2 = sc.nextInt();
        
                switch (caso2) {

                    case 1:
                        // Le pide al usuario que ingrese un número y un texto, y luego agrega la página al libro.
                        System.out.println("---------------Introduzca numero de pagina---------------");
                        int n = sc.nextInt();
                        sc.nextLine();
                        System.out.println("---------------Introduzca el texto---------------");
                        String t = sc.nextLine();
                        libro.añadirPagina(n, t);
                    break;
                    
                    case 2: 
                       // Le pide al usuario que ingrese un número y luego elimina la página con ese número si existe.
                        System.out.println("¿Que pagina desea eliminar?");
                        int n2 = sc.nextInt();
                        if (libro.eliminarPagina(n2)){
                            System.out.println("Se ha eliminado la pagina correctamente");
                        }else{
                        System.out.println("La pagina que desea eliminar no existe");
                        }
                    break;

                    case 3:
                       // Pide al usuario que ingrese un número y un texto, y luego reemplaza la página con ese número.
                        System.out.println("¿Que pagina desea reemplazar?");
                        int n3 = sc.nextInt();
                        System.out.println("Que nuevo texto quiere añadir");
                        String text = sc.next();
                        libro.reemplazarPagina(n3, text);
    
                    break;

                    case 4:
                       // Pide al usuario que ingrese un número y luego muestra el contenido de la página con ese número.
                        System.out.println("¿De que pagina desea mostrar el contenido");
                        int p = sc.nextInt();
                        libro.obtenerContenido(p);
                    break;

                    case 5:
                        System.out.println(libro);
                    break;
                
                }
            } while (caso2 != 0);

        }
    
} while (caso != 0);
       
        
        sc.close();
    }
}
