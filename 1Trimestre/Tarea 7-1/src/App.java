
public class App {
    public static void main(String[] args) throws Exception {

        Reloj reloj = new Reloj();  
        do{
            reloj.incrementar();
        System.out.println(reloj);
        Thread.sleep(0,1);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        }while(true);
       
        
       
        
        
    

        
    }
}
