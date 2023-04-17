


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente extends Persona {
    private String domicilio;
    private String telefono;


    
    public Cliente(String nombre, String apellidos, Dni dni, String domicilio, String telefono) {
        super(nombre, apellidos, dni);
        this.domicilio = domicilio;
        this.telefono = telefono;
        
        if (validaTelefonoRegex(telefono)) {
            this.telefono = telefono;
        } else {
            System.out.println("Telefono: incorrecto");
            this.telefono = "000000000";
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


    public String getDomicilio() {
        return domicilio;
    }


    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
















   




    


   




   



   


}