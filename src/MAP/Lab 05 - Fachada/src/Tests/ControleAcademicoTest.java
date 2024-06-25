package Tests;

import model.academico.Aluno;
import model.academico.ControleAcademico;
import model.academico.Disciplina;
import model.academico.Professor;
import model.util.Lotacao;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ControleAcademicoTest {
    static Aluno a = new Aluno(1, "Pitoco Malucao");
    static Disciplina d = new Disciplina(1,"Matematica",200);
    static Professor p = new Professor(1,"Fabio Marcel", Lotacao.CCT, LocalDate.now());
    private static ControleAcademico controleAcademicoTest;
    @BeforeEach
    void setup(){
        controleAcademicoTest = new ControleAcademico();
    }
    @Nested
    class adicionarDisciplina{
        @Test
        void adicionarDisciplinaNova() {

            assertDoesNotThrow(()-> controleAcademicoTest.adicionarDisciplina(d));
        }
        @Test
        void adicionarDisciplinaNovamente() {
            controleAcademicoTest.adicionarDisciplina(d);
            assertThrows(IllegalArgumentException.class, ()-> controleAcademicoTest.adicionarDisciplina(d));
        }
    }

    @Nested
    class adicionarAluno{

        @Test
        void adicionarNovoAluno() {
            assertDoesNotThrow(()->controleAcademicoTest.adicionarAluno(a));
        }
        @Test
        void adicionarAlunoDeNovo() {
            controleAcademicoTest.adicionarAluno(a);
            assertThrows(IllegalArgumentException.class, ()-> controleAcademicoTest.adicionarAluno(a));
        }

    }

    @Nested
    class matricularAlunoPorId{
        @Test
        void matricularAlunoOkDisciplinaOk() {
            controleAcademicoTest.adicionarAluno(a);
            controleAcademicoTest.adicionarDisciplina(d);
            assertDoesNotThrow(()->controleAcademicoTest.matricularAlunoPorId(1,1));
        }
        @Test
        void matricularAlunoQueNaoExiste() {
            assertThrows(IllegalArgumentException.class, () -> controleAcademicoTest.matricularAlunoPorId(2,1));
        }
        @Test
        void matricularAlunoEmDisciplinaInexistente() {
            assertThrows(IllegalArgumentException.class, () -> controleAcademicoTest.matricularAlunoPorId(1,2));
        }

    }

    @Nested
    class addProfessor{
        @Test
        void adicionarProfessor() {
            assertDoesNotThrow(()->controleAcademicoTest.adicionarProfessor(p));
        }
        @Test
        void adicionarProfessorNovamente() {
            controleAcademicoTest.adicionarProfessor(p);
            assertThrows(IllegalArgumentException.class, ()->controleAcademicoTest.adicionarProfessor(p));
        }

    }
    @Nested
    class professorAdicionarDisciplinarPorId{
        @Test
        void idsCorretos() {
            controleAcademicoTest.adicionarProfessor(p);
            controleAcademicoTest.adicionarDisciplina(d);

            assertDoesNotThrow(()-> controleAcademicoTest.professorAdicionarDisciplinaPorId(p.getId(),d.getId()));
        }
        @Test
        void idProfessorIncorreto() {
            controleAcademicoTest.adicionarProfessor(p);
            controleAcademicoTest.adicionarDisciplina(d);

            assertThrows(IllegalArgumentException.class,()-> controleAcademicoTest.professorAdicionarDisciplinaPorId(20,d.getId()));
        }
        @Test
        void idDisciplinaIncorreto() {
            controleAcademicoTest.adicionarProfessor(p);
            controleAcademicoTest.adicionarDisciplina(d);

            assertThrows(IllegalArgumentException.class,()-> controleAcademicoTest.professorAdicionarDisciplinaPorId(p.getId(),9));
        }
    }
}