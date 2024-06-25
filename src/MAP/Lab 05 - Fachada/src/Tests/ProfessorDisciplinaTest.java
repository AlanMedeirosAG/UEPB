package Tests;

import model.academico.Disciplina;
import model.academico.ProfessorDisciplina;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ProfessorDisciplinaTest {

    private static ProfessorDisciplina professorDisciplina;
    private static Disciplina d;
    @BeforeEach
    void init(){
        d = new Disciplina(1,"Algoritmos", 230);
        professorDisciplina = new ProfessorDisciplina(1);
    }

    @Nested
    class adicionarDisciplina{
        @Test
        void adicionarDisciplinaCorreto() {
            assertDoesNotThrow(()->professorDisciplina.adicionarDisciplina(d));
        }
        @Test
        void adicionarMesmaDisciplinaNovamente() {
            professorDisciplina.adicionarDisciplina(d);
            assertThrows(IllegalArgumentException.class, () -> professorDisciplina.adicionarDisciplina(d));
        }
    }
}