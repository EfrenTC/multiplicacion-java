package dev.etc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

class TablaMultiplicarTest {

    @Test
    void testGenerarTabla() {
        TablaMultiplicar tm = new TablaMultiplicar();
        List<String> tabla = tm.generarTabla(5);

        assertEquals(10, tabla.size(), "La tabla debe tener 10 elementos");
        assertEquals("5 x 1 = 5", tabla.get(0));
        assertEquals("5 x 10 = 50", tabla.get(9));
    }

    @Test
    void testGenerarTablaConNumeroNegativo() {
        TablaMultiplicar tm = new TablaMultiplicar();
        List<String> tabla = tm.generarTabla(-3);

        assertEquals("-3 x 1 = -3", tabla.get(0));
        assertEquals("-3 x 10 = -30", tabla.get(9));
    }
}
