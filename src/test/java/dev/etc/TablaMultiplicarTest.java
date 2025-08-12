package dev.etc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class TablaMultiplicarTest {

    @Test
    void testGenerarTabla() {
        TablaMultiplicar tm = new TablaMultiplicar();
        List<String> tabla = tm.generarTabla(5);

        assertThat(tabla, hasSize(10));
        assertThat(tabla.get(0), is("5 x 1 = 5"));
        assertThat(tabla.get(9), is("5 x 10 = 50"));
    }

    @Test
    void testGenerarTablaConNumeroNegativo() {
        TablaMultiplicar tm = new TablaMultiplicar();
        List<String> tabla = tm.generarTabla(-3);

        assertThat(tabla.get(0), is("-3 x 1 = -3"));
        assertThat(tabla.get(9), is("-3 x 10 = -30"));
    }

    @Test
    void testImprimirTablaCubreMetodo() {
        TablaMultiplicar tm = new TablaMultiplicar();
        tm.imprimirTabla(2);
    }

    @Test
    void testMainCubreMetodo() {
        App.main(new String[]{"3"}); 
        App.main(new String[]{});
    }
}
