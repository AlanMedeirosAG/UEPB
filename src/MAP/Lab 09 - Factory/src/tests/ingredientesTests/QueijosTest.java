package tests.ingredientesTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ingredientes.queijos.*;
import org.junit.Before;
import org.junit.Test;

public class QueijosTest {

    private QueijoCheddar cheddar;
    private QueijoMussarela mussarela;
    private QueijoPrato prato;

    @Before
    public void setUp() {
        cheddar = new QueijoCheddar();
        mussarela = new QueijoMussarela();
        prato = new QueijoPrato();
    }

    @Test
    public void getNomeQueijoCheddarTest() {
        assertEquals("Queijo Cheddar",cheddar.getName());
    }

    @Test
    public void getNomeQueijoMussarelaTest() {
        assertEquals("Queijo Mussarela",mussarela.getName());
    }

    @Test
    public void getNomeQueijoPratoTest() {
        assertEquals("Queijo Prato",prato.getName());
    }

}
