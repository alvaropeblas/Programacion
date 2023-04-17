import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class SameAndEqualsTest {

    SameAndEquals a = new SameAndEquals();
    
    @Test
    public void testSameB1B2(){
       assertSame( "KO",a.getB1(), a.getB2());
    }
    
    @Test
    public void testSameB1B3(){
       assertSame( "KO",a.getB1(), a.getB3());
    }

    @Test
    public void testEqualsB1B2(){
       assertEquals( "KO",a.getB1(), a.getB2());
    }

    @Test
    public void testEqualsB1B3(){
       assertEquals( "KO",a.getB1(), a.getB3());
    }

    public void testSameI1I2(){
        assertSame("KO",a.getI1(), a.getI2());
    }
}
