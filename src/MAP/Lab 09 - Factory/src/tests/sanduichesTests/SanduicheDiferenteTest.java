package tests.sanduichesTests;

import factory.SanduicheDiferenteFactory;
import factory.SanduicheFactory;
import ingredientes.ovos.OvoGranja;
import ingredientes.paes.PaoFrances;
import ingredientes.presuntos.PresuntoFrango;
import ingredientes.queijos.QueijoPrato;
import ingredientes.tomates.TomateFatiado;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SanduicheDiferenteTest {

    private SanduicheFactory factory;

    @Before
    public void setUp() {
        factory = new SanduicheDiferenteFactory();}

    @Test
    public void testCriarPao() {
        assertTrue(factory.criarPao() instanceof PaoFrances);
    }

    @Test
    public void testCriarQueijo() {
        assertTrue(factory.criarQueijo() instanceof QueijoPrato);
    }

    @Test
    public void testCriarPresunto() {
        assertTrue(factory.criarPresunto() instanceof PresuntoFrango);
    }

    @Test
    public void testCriarOvo() {
        assertTrue(factory.criarOvo() instanceof OvoGranja);
    }

    @Test
    public void testCriarTomate() {
        assertTrue(factory.criarTomate() instanceof TomateFatiado);
    }
}
