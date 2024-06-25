package tests.sanduichesTests;

import factory.SanduicheDeMussarelaFactory;
import factory.SanduicheFactory;
import ingredientes.ovos.OvoCapoeira;
import ingredientes.paes.PaoBola;
import ingredientes.presuntos.PresuntoPeru;
import ingredientes.queijos.QueijoMussarela;
import ingredientes.tomates.TomateFatiado;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SanduicheMussarelaTest {

    private SanduicheFactory factory;

    @Before
    public void setUp() {
        factory = new SanduicheDeMussarelaFactory();}

    @Test
    public void testCriarPao() {
        assertTrue(factory.criarPao() instanceof PaoBola);
    }

    @Test
    public void testCriarQueijo() {
        assertTrue(factory.criarQueijo() instanceof QueijoMussarela);
    }

    @Test
    public void testCriarPresunto() {
        assertTrue(factory.criarPresunto() instanceof PresuntoPeru);
    }

    @Test
    public void testCriarOvo() {
        assertTrue(factory.criarOvo() instanceof OvoCapoeira);
    }

    @Test
    public void testCriarTomate() {
        assertTrue(factory.criarTomate() instanceof TomateFatiado);
    }
}
