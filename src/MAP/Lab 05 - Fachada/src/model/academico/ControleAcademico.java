package model.academico;

import model.util.Lotacao;

import java.time.LocalDate;
import java.util.ArrayList;

public class ControleAcademico {
    private final ArrayList<Professor> professores = new ArrayList<Professor>();
    private final ArrayList<Aluno> alunos = new ArrayList<>();
    private final ArrayList<ProfessorDisciplina> professorDisciplinas = new ArrayList<>();
    private final ArrayList<AlunoDisciplinas> alunoDisciplinas = new ArrayList<>();
    private final ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Disciplina criarDisciplina(int id, String nome, int ch){
        return new Disciplina(id, nome, ch);
    }

    public Disciplina buscarDisciplinaPorId(int id){
        for (Disciplina d : disciplinas){
            if (d.getId() == id) return d;
        }
        return null;
    }

    public void adicionarDisciplina(Disciplina d){
        if (buscarDisciplinaPorId(d.getId()) != null) {
            throw new IllegalArgumentException("Disciplina já existe.");
        }
        disciplinas.add(d);
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public Aluno buscarAlunoPorID(int id){
        for (Aluno a : alunos){
            if (a.getId() == id) return a;
        }
        return null;
    }

    public Aluno criarAluno(int id, String nome){
        return new Aluno(id, nome);
    }

    public void adicionarAluno(Aluno a){
        if (buscarAlunoPorID(a.getId()) != null) {
            throw new IllegalArgumentException("Aluno já existe.");
        }
        alunos.add(a);
        AlunoDisciplinas ad = new AlunoDisciplinas(a.getId());
        alunoDisciplinas.add(ad);
    }

    public AlunoDisciplinas buscarDisciplinasAlunoPorId(int idAluno){
        for (AlunoDisciplinas ad : alunoDisciplinas){
            if (ad.getIdAluno() == idAluno) return ad;
        }
        return null;
    }

    public void matricularAlunoPorId(int idAluno, int idDisciplina){
        Aluno aluno = buscarAlunoPorID(idAluno);
        Disciplina disciplina = buscarDisciplinaPorId(idDisciplina);

        if (aluno == null || disciplina == null) {
            throw new IllegalArgumentException("Aluno ou disciplina não encontrada.");
        }

        AlunoDisciplinas disciplinasAluno = buscarDisciplinasAlunoPorId(idAluno);
        disciplinasAluno.adicionarDisciplina(disciplina);
    }

    public Professor buscarProfessorPorId(int id){
        for (Professor servidor : professores){
            if (servidor.getId() == id){
                return servidor;
            }
        }
        return null;
    }

    public Professor criarProfessor(int id, String nome, Lotacao lotacao, LocalDate dataContratacao){
        return new Professor(id, nome, lotacao, dataContratacao);
    }

    public ProfessorDisciplina buscarDisciplinaProfPorId(int id){
        for (ProfessorDisciplina pd : professorDisciplinas){
            if (pd.getProfessor() == id) return pd;
        }
        return null;
    }

    public void adicionarProfessor(Professor p){
        if(buscarProfessorPorId(p.getId()) != null) {
            throw new IllegalArgumentException("Professor já existe.");
        }
        professores.add(p);
        ProfessorDisciplina pd = new ProfessorDisciplina(p.getId());
        professorDisciplinas.add(pd);
    }

    public void professorAdicionarDisciplinaPorId(int idProfessor, int idDisciplina){
        Professor professor = buscarProfessorPorId(idProfessor);
        Disciplina disciplina = buscarDisciplinaPorId(idDisciplina);

        if (professor == null || disciplina == null) {
            throw new IllegalArgumentException("Professor ou disciplina não encontrada.");
        }

        ProfessorDisciplina disciplinasProfessor = buscarDisciplinaProfPorId(idProfessor);
        disciplinasProfessor.adicionarDisciplina(disciplina);
    }
}
