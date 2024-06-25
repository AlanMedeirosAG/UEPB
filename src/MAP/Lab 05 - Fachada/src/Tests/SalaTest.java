package Tests;

import model.infraestrutura.Sala;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SalaTest {

    private Sala sala;

    @Before
    public void setUp() {
        sala = new Sala("08:00", 20);
    }

    @Test
    public void testAdicionarAluno() {
        sala.adicionarAluno("João");
        assertTrue(sala.getAlunos().contains("João"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdicionarAlunoNulo() {
        sala.adicionarAluno(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdicionarAlunoVazio() {
        sala.adicionarAluno("");
    }

    @Test
    public void testRemoverAluno() {
        sala.adicionarAluno("João");
        sala.removerAluno("João");
        assertFalse(sala.getAlunos().contains("João"));
    }

    @Test
    public void testRemoverAlunoInexistente() {
        sala.removerAluno("Maria");
        // Não deve lançar exceção
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoverAlunoNulo() {
        sala.removerAluno(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoverAlunoVazio() {
        sala.removerAluno("");
    }

    @Test
    public void testListarAlunos() {
        sala.adicionarAluno("João");
        sala.adicionarAluno("Maria");
        sala.listarAlunos();
    }
}

