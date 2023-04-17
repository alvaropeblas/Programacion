import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CifPruebaTest {
 

    @Test
    public void testCifPruebaLongitudMayor() {
        CifPrueba c;
        try {
            c = new CifPrueba('A', "65656565656565");
            assertNull(c.getNumeracion());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       

    }

    @Test
    public void testCifPruebaLongitudMenor() {
        CifPrueba c;
        try {
            c = new CifPrueba('A', "656");
            assertNull(c.getNumeracion());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
    }

    @Test
    public void testCifPruebaLetraNoPermitida() {
 
        try {
            
          Exception e = assertThrows(Exception.class, () -> new CifPrueba('X', "1234567"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
      

    }

    @Test
    public void testCifPruebaLetraIntermedia() {
        CifPrueba c;
        try {
            c = new CifPrueba('A', "123r567");
            assertNull(c.getNumeracion());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       

    }

 /*    @Test
    public void testCifPruebaCorrecto1() {
        //6
        CifPrueba c = new CifPrueba('A', "01969542");
        assertEquals("2", c.getCod()+"");

    } */
    
}
