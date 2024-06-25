package tests.ingredientesTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ingredientes.presuntos.*;

import org.junit.Before;
import org.junit.Test;

public class PresuntosTest {

    private PresuntoFrango presuntoFrango;
    private PresuntoPeru presuntoPeru;

    @Before
    public void setUp() {
        presuntoFrango = new PresuntoFrango();
        presuntoPeru = new PresuntoPeru();
    }

    @Test
    public void getNomePresuntoFrangoTest() {
        assertEquals("Presunto de Frango",presuntoFrango.getName());
    }

    @Test
    public void getNomePresuntoPeruTest() {
        assertEquals("Presunto de Peru",presuntoPeru.getName());
    }



}
