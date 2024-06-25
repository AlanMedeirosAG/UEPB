package Tests;

import static org.junit.Assert.assertEquals;

import model.administracao.AdmReuniao;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

public class AdmReuniaoTest {

    private AdmReuniao admReuniao;

    @Before
    public void setUp() {
        admReuniao = new AdmReuniao("10:00");
    }

         @Test
         public void testAdicionarParticipante() {
         admReuniao.adicionarParticipante("João");
         assertEquals(1, admReuniao.getParticipantes().size());
         assertEquals("João", admReuniao.getParticipantes().get(0));
     }

        @Test(expected = IllegalArgumentException.class)
        public void testAdicionarParticipanteNulo() {
         admReuniao.adicionarParticipante(null);
     }

     @Test(expected = IllegalArgumentException.class)
     public void testAdicionarParticipanteVazio() {
         admReuniao.adicionarParticipante("");
     }


    @Test
    public void testListarParticipantes() {
        admReuniao.adicionarParticipante("João");
        admReuniao.adicionarParticipante("Maria");
        admReuniao.listarParticipantes();
    }
}
