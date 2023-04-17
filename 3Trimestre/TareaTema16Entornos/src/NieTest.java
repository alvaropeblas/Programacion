import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class NieTest {

    // Test para la longitud mayor
    @Test
    public void testNieLongitudMayor() {
        assertThrows(NieException.class, () -> new Nie("Y82372411K"));
    }

    // Test para la longitud menor
    @Test
    public void testNieLongitudMenor() {
        assertThrows(NieException.class, () -> new Nie("Y823K"));
    }

    // Test para comprobar la letra inicial
    @Test
    public void testNieEmpiezaLetraDiferente() {
        assertThrows(NieException.class, () -> new Nie("G8237411K"));
    }

    // Test para comprobar la letra final
    @Test
    public void testNieEmpiezaLetraDiferenteFinal() {
        assertThrows(NieException.class, () -> new Nie("X8237411J"));
    }

    //Test para comprobar letras en medio
    @Test
    public void testNieContieneLetrasEnMedio() {
        assertThrows(NieException.class, () -> new Nie("G8274f11K"));
    }

}
