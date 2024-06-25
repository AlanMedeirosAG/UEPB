package tests.sanduichesTests;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


import factory.SanduicheDeCheddarFactory;
import factory.SanduicheFactory;
import ingredientes.paes.PaoBola;
import ingredientes.queijos.QueijoCheddar;
import ingredientes.presuntos.PresuntoFrango;
import ingredientes.ovos.OvoGranja;
import ingredientes.tomates.TomateFatiado;


public class SanduicheCheddarTest {

    private SanduicheFactory factory;

    @Before
    public void setUp() {
        factory = new SanduicheDeCheddarFactory();}

    @Test
    public void testCriarPao() {
        assertTrue(factory.criarPao() instanceof PaoBola);
    }

    @Test
    public void testCriarQueijo() {
        assertTrue(factory.criarQueijo() instanceof QueijoCheddar);
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

