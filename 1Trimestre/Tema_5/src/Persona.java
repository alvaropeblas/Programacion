import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * * Clase Persona.
 * 
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private Dni dni;
    private String telefono;
    private String fecha_nac;
    private String email;

    /**
     * * Constructor
     * ? Combprueba si el telefono es válido, si no lo es fija el numero en
     * 000000000.
     * 
     * 
     * 
     * ?Comprueba si la fecha es válida y si no lo es, está fijando la fecha a
     * 01/01/1970.
     * 
     * 
     * 
     * ? Comprueba si el correo electrónico es válido y si no lo es, está
     * configurando el correo electrónico en ''.
     * 
     * 
     * 
     * @param nombre
     * @param apellidos
     * @param edad
     * @param dni
     * @param telefono
     * @param fecha_nac
     * @param email
     */
    public Persona(String nombre, String apellidos, int edad, Dni dni, String telefono, String fecha_nac,
            String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;

        if (validaTelefonoRegex(telefono)) {
            this.telefono = telefono;
        } else {
            System.out.println("Telefono: incorrecto");
            this.telefono = "000000000";
        }

        if (validaFechaNac(fecha_nac)) {
            this.fecha_nac = fecha_nac;
        } else {
            System.out.println("Fecha: incorrecto");
            this.fecha_nac = "01/01/1970";
        }
        if (validaEmailRegex(email)) {
            this.email = email;
        } else {
            System.out.println("Email: incorrecto");
            this.email = "''";
        }
    }

    /**
     ** Comprueba si la cadena contiene al menos 9 dígitos
     * 
     * @param telefono El número de teléfono para validar.
     * @return Un valor booleano.
     */
    public boolean validaTelefonoRegex(String telefono) {
        String regex = "[\\d]{9,}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(telefono);
        return m.matches();
    }

    /**
     * * Comprueba si la cadena es una fecha válida en el formato dd/mm/yyyy
     * 
     * @param fecha_nac la fecha a validar
     * @return Un valor booleano.
     */
    public boolean validaFechaNac(String fecha_nac) {
        String regex = "([0-2][\\d]|[3][0,1])/([0][\\d]|[1][0-2])/([1][9][\\d]{2}|[2][0][0,1][\\d]|[2][0][2][0,2])";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(fecha_nac);
        return m.matches();
    }

    /**
     * * Comprueba si la dirección de correo electrónico es válida comprobando si
     * coincide con la siguiente expresión regular:
     * 
     * ! No he sido capaz de resolverlo (el apartado de los dos puntos seguidos, lo
     * demás si era capaz), he buscado información para este apartado.
     * 
     * @param email La dirección de correo electrónico a validar.
     * @return Un valor booleano.
     */
    public boolean validaEmailRegex(String email) {
        String regex = "^((?=.{1,64}@)[A-Za-z\\d_-]+(\\.[A-Za-z\\d_-]+)*@[^-][A-Za-z\\d-]+(\\.[A-Za-z\\d-]+)*(\\.[A-Za-z]{2,4})){1,256}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        return m.matches();
    }

    /**
     * * Devuelve verdadero si la cadena tiene más de 2 caracteres y todos los
     * caracteres son alfabéticos
     * ! Ejercicio de clase
     * 
     * @return Un valor booleano.
     */
    public boolean validaNombreif() {
        boolean correcto = true;
        if (nombre.length() > 2) {
            for (int i = 0; i < nombre.length() && correcto; i++) {
                if (!Character.isAlphabetic((nombre.charAt(i)))) {
                    correcto = false;
                }

            }
        } else {
            correcto = false;
        }
        return correcto;
    }

    /**
     * * La función devuelve una cadena que contiene el número de DNI y la letra del
     * DNI
     * 
     * @return Se devuelve el método toString().
     */
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", dni=" + dni
                + ", telefono=" + telefono + ", fecha_nac=" + fecha_nac + ", email=" + email + "]";
    }

    // Getters y setters
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Dni getDni() {
        return dni;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
