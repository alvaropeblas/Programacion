import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class DniTest {

    // Test para la longitud mayor
    @Test
    public void testDniLongitudMayor() {
        assertThrows(DniExcepcion.class, () -> new Dni("460732345", 'L'));
    }

    // Test para la longitud menor
    @Test
    public void testDniLongitudMenor() {
        assertThrows(DniExcepcion.class, () -> new Dni("4607", 'L'));
    }

    // Test para letra final
    @Test
    public void testDniAcabaConLetraNoPermitida() throws DniExcepcion {
        assertThrows(DniExcepcion.class, () -> new Dni("46073483", 'L'));
    }

    // Test para comprobar letras en medio
    @Test
    public void testDniContieneLetrasEnMedio() {
        assertThrows(DniExcepcion.class, () -> new Dni("407f383", 'L'));
    }

    // Test para letra final de otra manera
    @Test
    public void testDniUltimaLetraCorrecta() {

        Dni d = new Dni();

        char l = d.obtenerLetra("46073483");
        assertEquals('K', l);
    }

}
