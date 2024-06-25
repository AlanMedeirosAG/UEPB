package Tests;

import model.academico.AlunoDisciplinas;
import model.academico.Disciplina;
import model.academico.ProfessorDisciplina;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoDisciplinasTest {

    private static AlunoDisciplinas alunoDisciplinas;
    private static Disciplina d;
    @BeforeEach
    void init(){
        d = new Disciplina(1,"Algoritmos", 230);
        alunoDisciplinas = new AlunoDisciplinas(1);
    }

    @Nested
    class adicionarDisciplina{
        @Test
        void adicionarDisciplinaCorreto() {
            assertDoesNotThrow(()->alunoDisciplinas.adicionarDisciplina(d));
        }
        @Test
        void adicionarMesmaDisciplinaNovamente() {
            alunoDisciplinas.adicionarDisciplina(d);
            assertThrows(IllegalArgumentException.class, () -> alunoDisciplinas.adicionarDisciplina(d));
        }
    }
}