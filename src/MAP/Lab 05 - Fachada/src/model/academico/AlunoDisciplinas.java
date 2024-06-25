package model.academico;

import java.util.ArrayList;

public class AlunoDisciplinas {
    private final int idAluno;
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
    public AlunoDisciplinas(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getIdAluno() {
        return idAluno;
    }
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
