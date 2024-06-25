package tests.ingredientesTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ingredientes.tomates.TomateFatiado;
import org.junit.Before;
import org.junit.Test;

public class TomateTest {

    private TomateFatiado tomate;

    @Before
    public void setUp() {
        tomate = new TomateFatiado();
    }

    @Test
    public void getNameTomateFatiadoTest() {
        assertEquals("Tomate Fatiado",tomate.getName());
    }

}
