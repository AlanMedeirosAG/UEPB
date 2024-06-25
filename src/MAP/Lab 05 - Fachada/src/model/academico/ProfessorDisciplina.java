package model.academico;

import java.util.ArrayList;

public class ProfessorDisciplina {
    private int professorId;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Disciplina buscarDisciplinaPorId(int id){
        for (Disciplina d : disciplinas){
            if (d.getId() == id) return d;
        }
        return null;
    }
    public void adicionarDisciplina(Disciplina d){
        if (buscarDisciplinaPorId(d.getId()) != null) {
            throw new IllegalArgumentException("Disciplina com ID " + d.getId() + " já existe.");
        }
        disciplinas.add(d);
    }

    public ProfessorDisciplina(int professor) {
        this.professorId = professor;
    }

    public int getProfessor() {
        return professorId;
    }

    public void setProfessor(int professor) {
        this.professorId = professor;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

}
