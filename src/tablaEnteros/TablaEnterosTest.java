package tablaEnteros;

import static org.junit.Assert.*;
import org.junit.Test;

public class TablaEnterosTest {
    private Integer[] numeros = {1, 2, 3};
    private TablaEnteros tablaenteros = new TablaEnteros(numeros);

    @Test
    public void testSumaTabla() {
        int result = tablaenteros.sumaTabla();
        assertEquals(6, result);
    }

    @Test
    public void testMayorTabla() {
        int result = tablaenteros.mayorTabla();
        assertEquals(3, result);
    }

    @Test
    public void testPosicionTabla() {
        int result = tablaenteros.posicionTabla(1);
        assertEquals(0, result);
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testPosicionTabla2() {
        int result = tablaenteros.posicionTabla(4);
        assertEquals(0, result);
    }
}
