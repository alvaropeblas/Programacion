public class Coche {
   
    String marca, modelo, color, matricula;
   
    public Coche(){
      
        marca="Mercedes";
       
        modelo="MB100";
      
        color="Blanco";
      
        matricula="1234 ABC";
    }

    public Coche (String marca, String modelo, String color, String matricula){
        
        this.marca = marca;
       
        this.modelo = modelo;
        
        this.color = color;
      
        this.matricula = matricula;
    }

    public Coche (String marca, String modelo){
        
        this();
       
        this.marca = marca;
       
        this.modelo = modelo;
    }

    public Coche (Coche copia){
        this.marca = copia.marca;
        this.modelo = copia.modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
