import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
    @BeforeClass
    public static void antesDeEjecutarTodosLosTest() {
        //Tareas a realizar antes de ejecutar todos los test
    }
    
    @AfterClass
    private static void despuesDeEjecutarTodosLosTest() {
        //Tareas a realizar despues de ejecutar todos los test
    }

    @Before
    public void antesDeCadaTest(){
        //Tareas a realizar antes de cada test
    }

    @After
    public void despuesDeCadaTest(){
        //Tareas a realizar despues de cada test
    }
    
    @Test
    public void comprobarFuncionalidad(){
        //Comprueba la funcionalidad
    }
}
