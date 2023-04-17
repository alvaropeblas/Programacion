
public class ejer_1 {
    public static void main(String[] args) throws Exception {
        for (int i = 4; i >= 0; i--){
            for (int j = 4; j >= 0; j--){
                if (i <= j){
                    System.out.print("|");
                }else{
                        System.out.print(" ");
                }
            }
            System.out.println();
        }    
    }
}