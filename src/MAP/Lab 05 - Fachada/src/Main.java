import facade.SIG;
import model.util.Lotacao;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    SIG sig = new SIG();

    //Setor infraestrutura

    sig.criarSala("8:00 - 10:00",30);
    sig.adicionarAluno("João");
    sig.adicionarAluno("Pedro");
    sig.adicionarAluno("Maria");
    sig.listarAlunos();
    sig.remover("João");
    sig.listarAlunos();

    System.out.print("\n");

    //Setor almoxarifado

    sig.criarAlmoxarifado();
    sig.adicionarProduto(1,"Papel Sufite");
    sig.adicionarProduto(2,"Kit laboratório");
    sig.adicionarProduto(3,"Extintor");
    sig.listarProdutos();
    sig.removerProduto(1);
    sig.listarProdutos();
    sig.fazerPedido("Canetas");
    sig.fazerPedido("Lapis grafite");
    sig.fazerPedido("Mesa");
    sig.listarPedidos();

    System.out.print("\n");

    //Setor Administração

    sig.marcarReuniao("14:00 - 16:00");
    sig.adicionarParticipantes("Jorge");
    sig.adicionarParticipantes("Luna");
    sig.adicionarParticipantes("Adriana");
    sig.listarParticipantes();

    System.out.print("\n");


    //setor academico
    sig.criarProfessor(1,"Marcio Torres", Lotacao.CCT, LocalDate.now());
    sig.criarProfessor(2, "Ana Nery", Lotacao.CCBS, LocalDate.of(2013,11,1));

    sig.criarDisciplina(1, "Matematica Discreta IV", 240);
    sig.criarDisciplina(2, "Calculo VI", 240);
    sig.criarDisciplina(3, "Engenharia de Software XX", 240);

    sig.adicionarDisciplinaProfessor(1,1);
    sig.adicionarDisciplinaProfessor(1,2);

    sig.adicionarDisciplinaProfessor(2,1);
    sig.adicionarDisciplinaProfessor(2,3);

    sig.mostrarDisciplinasProfessorId(1);
    sig.mostrarDisciplinasProfessorId(2);

    sig.criarAluno(1, "Fernando Cabral");
    sig.criarAluno(2, "Sávio Barbosa");

    sig.matricularAlunoPorId(1,1);
    sig.matricularAlunoPorId(1,2);
    sig.matricularAlunoPorId(1,3);

    sig.matricularAlunoPorId(2,2);

    sig.mostrarTodosAlunos();
    sig.mostrarRdmAlunoId(1);
    sig.mostrarRdmAlunoId(2);

    System.out.print("\n");

        //Setor financeiro
    sig.mostrarSalarioProfessorId(1);
    sig.mostrarSalarioProfessorId(2);

    }
}