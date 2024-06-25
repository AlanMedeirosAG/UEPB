package tests.sanduichesTests;


import ingredientes.*;
import org.junit.After;
import sanduiche.Sanduiche;
import ingredientes.ovos.OvoGranja;
import ingredientes.paes.PaoBola;
import ingredientes.queijos.QueijoCheddar;
import ingredientes.tomates.TomateFatiado;
import ingredientes.presuntos.PresuntoFrango;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


    public class SanduicheTest {

        private Sanduiche sanduiche;
        private Pao pao;
        private Queijo queijo;
        private Presunto presunto;
        private Ovo ovo;
        private Tomate tomate;

        @Before
        public void setUp() {
            sanduiche = new Sanduiche();
            pao = new PaoBola();
            queijo = new QueijoCheddar();
            presunto = new PresuntoFrango();
            ovo = new OvoGranja();
            tomate = new TomateFatiado();

            sanduiche.setPao(pao);
            sanduiche.setQueijo(queijo);
            sanduiche.setPresunto(presunto);
            sanduiche.setOvo(ovo);
            sanduiche.setTomate(tomate);


        }

        @Test
        public void testSetPao() {
            sanduiche.setPao(pao);
            assertEquals(pao, sanduiche.getPao());
        }

        @Test
        public void testSetQueijo() {
            sanduiche.setQueijo(queijo);
            assertEquals(queijo, sanduiche.getQueijo());
        }

        @Test
        public void testSetPresunto() {
            sanduiche.setPresunto(presunto);
            assertEquals(presunto, sanduiche.getPresunto());
        }

        @Test
        public void testSetOvo() {
            sanduiche.setOvo(ovo);
            assertEquals(ovo, sanduiche.getOvo());
        }

        @Test
        public void testSetTomate() {
            sanduiche.setTomate(tomate);
            assertEquals(tomate, sanduiche.getTomate());
        }

        @Test
        public void testGetPao() {
            assertEquals(pao, sanduiche.getPao());
        }

        @Test
        public void testGetQueijo() {
            assertEquals(queijo, sanduiche.getQueijo());
        }

        @Test
        public void testGetPresunto() {
            assertEquals(presunto, sanduiche.getPresunto());
        }

        @Test
        public void testGetOvo() {
            assertEquals(ovo, sanduiche.getOvo());
        }

        @Test
        public void testGetTomate() {
            assertEquals(tomate, sanduiche.getTomate());
        }



        @Test
        public void testMostrarIngredientes() {
            sanduiche.mostrarIngredientes();

            String expectedOutput = "Sanduiche com: \n" +
                    "- " + pao.getName() + "\n" +
                    "- " + queijo.getName() + "\n" +
                    "- " + presunto.getName() + "\n" +
                    "- " + ovo.getName() + "\n" +
                    "- " + tomate.getName() + "\n";

            assertEquals(expectedOutput, sanduiche.mostrarIngredientes());
        }

}
