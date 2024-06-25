package model.infraestrutura;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private String horario;
    private int capacidadeMaxima;
    private List<String> alunos;

    public Sala(String horario, int capacidadeMaxima) {
        this.horario = horario;
        this.capacidadeMaxima = capacidadeMaxima;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(String aluno) {
        if (aluno == null || aluno.isEmpty()) {
            throw new IllegalArgumentException("Nome do aluno não pode ser nulo ou vazio.");
        }
        if (alunos.size() < capacidadeMaxima) {
            alunos.add(aluno);
            System.out.println("Aluno " + aluno + " adicionado à sala de aula às " + horario);
        } else {
            System.out.println("Não é possível adicionar mais alunos. Capacidade máxima atingida.");
        }
    }

    public void removerAluno(String aluno) {
        if (aluno == null || aluno.isEmpty()) {
            throw new IllegalArgumentException("Nome do aluno não pode ser nulo ou vazio.");
        }
        if (alunos.contains(aluno)) {
            alunos.remove(aluno);
            System.out.println("Aluno " + aluno + " removido da sala de aula às " + horario);
        } else {
            System.out.println("Aluno " + aluno + " não encontrado na sala de aula às " + horario);
        }
    }

    public void listarAlunos() {
        System.out.println("Alunos na sala de aula às " + horario + ":");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public List<String> getAlunos() {
        return alunos;
    }
}