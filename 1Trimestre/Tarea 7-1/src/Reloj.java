/**
 * *Crea una clase llamada
 */

public class Reloj {
  private Contador horas;
  private Contador min;
  private Contador seg;

    


  


@Override
public String toString() {
    return String.format("Reloj %02d:%02d:%02d ",this.horas.getNumero(),this.min.getNumero(),this.seg.getNumero());
}







public Reloj() {
    horas = new Contador(0);
    min = new Contador(0);
    seg = new Contador(0);
    
    this.horas.setNumero(0);
    this.min.setNumero(0);
    this.seg.setNumero(0);
}







public void incrementar(){


    this.seg.incrementar();
    if(this.seg.getNumero() == 60) {
        this.min.incrementar();
        this.seg.setNumero(0);
    }if (this.min.getNumero() == 60){
        this.horas.incrementar();
        this.min.setNumero(0);
    }if(this.horas.getNumero() == 24){
        this.horas.setNumero(0);
        this.min.setNumero(0);
        this.seg.setNumero(0);
    }
    

    


}







public Contador getHoras() {
    return horas;
}







public void setHoras(Contador horas) {
    this.horas = horas;
}







public Contador getMin() {
    return min;
}







public void setMin(Contador min) {
    this.min = min;
}







public Contador getSeg() {
    return seg;
}







public void setSeg(Contador seg) {
    this.seg = seg;
}


    
}



