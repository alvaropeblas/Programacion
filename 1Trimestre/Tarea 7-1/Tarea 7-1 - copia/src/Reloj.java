import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class Reloj {
  private Contador horas;
  private Contador min;
  private Contador seg;

    


  


@Override
public String toString() {
    return "Reloj: " + this.horas.getNumero() + ":" + this.min.getNumero() + ":" + this.seg.getNumero();
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

do{
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
    
}while(this.horas.getNumero() != 24);
    


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







public void start() {
    Timer timer = new Timer(1000, new ActionListener(){
        private Object seg;
        private Object min;
        private Object horas;

        @Override
        public void actionPerformed(ActionEvent e) {
            
                ((Reloj) this.seg).incrementar();
                if(((Contador) this.seg).getNumero() == 60) {
                    ((Reloj) this.min).incrementar();
                    ((Contador) this.seg).setNumero(0);
                }if (((Contador) this.min).getNumero() == 60){
                    ((Reloj) this.horas).incrementar();
                    ((Contador) this.min).setNumero(0);
                }if(((Contador) this.horas).getNumero() == 24){
                    ((Contador) this.horas).setNumero(0);
                    ((Contador) this.min).setNumero(0);
                    ((Contador) this.seg).setNumero(0);
                }
                
            
        }
    });
}

    
}



