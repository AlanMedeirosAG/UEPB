package tests.ingredientesTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ingredientes.paes.*;

import org.junit.Before;
import org.junit.Test;

public class PaesTest {

    private PaoBola bola;
    private PaoFrances frances;
    private PaoIntegral integral;

    @Before
    public void setUp() {
        bola = new PaoBola();
        frances = new PaoFrances();
        integral = new PaoIntegral();
    }

    @Test
    public void paoBolaTest() {
        assertEquals("Pao Bola",bola.getName());
    }

    @Test
    public void paoFrancesTest() {
        assertEquals("Pao Frances",frances.getName());
    }

    @Test
    public void paoIntegralTest() {
        assertEquals("Pao Integral",integral.getName());
    }

}
