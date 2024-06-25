package tests.ingredientesTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ingredientes.ovos.*;
import org.junit.Before;
import org.junit.Test;


public class OvosTest {

    private OvoCapoeira ovoCapoeira;
    private OvoGranja ovoGranja;

    @Before
    public void setUp() {
        ovoCapoeira = new OvoCapoeira();
        ovoGranja = new OvoGranja();
    }

    @Test
    public void getNameOvoCapoeiraTest() {
        assertEquals("Ovo de Capoeira", ovoCapoeira.getName());
    }

    @Test
    public void getNameOvoGranjaTest() {
        assertEquals("Ovo de Granja", ovoGranja.getName());
    }

}
