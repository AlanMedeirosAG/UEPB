package facade;

import model.academico.Aluno;
import model.academico.ControleAcademico;
import model.financeiro.ProfessorPagamento;
import model.infraestrutura.Sala;
import model.administracao.AdmReuniao;
import model.almoxarifado.Almoxarifado;
import model.util.Lotacao;
import model.academico.Professor;

import java.time.LocalDate;

public class SIG {

    private ControleAcademico controleAcademico = new ControleAcademico();
    private Sala sala;
    private Almoxarifado almoxorifado;
    private AdmReuniao reuniao;

    public ControleAcademico getControleAcademico() {
        return controleAcademico;
    }

    public Sala getSala() {
        return sala;
    }

    public Almoxarifado getAlmoxorifado() {
        return almoxorifado;
    }

    public AdmReuniao getReuniao() {
        return reuniao;
    }
//Setor infraestrutura

    public void criarSala(String horario,int capacidadeMaxima){
        sala = new Sala(horario,capacidadeMaxima);
    }

    public void adicionarAluno(String Aluno){
        sala.adicionarAluno(Aluno);
    }

    public void remover(String Aluno){
        sala.removerAluno(Aluno);
    }

    public void listarAlunos(){
        sala.listarAlunos();
    }


    //Setor almoxarifado

    public void criarAlmoxarifado(){
        almoxorifado = new Almoxarifado();
    }

    public void adicionarProduto(int id, String nome){
        almoxorifado.adicionarProduto(id, nome);
    }

    public void removerProduto(int id){
        almoxorifado.removerProduto(id);
    }

    public void listarProdutos(){
        almoxorifado.listarProdutos();
    }

    public void fazerPedido(String nome){almoxorifado.fazerPedidoProdutos(nome);}

    public void listarPedidos(){almoxorifado.listarPedidos();}

    //Setor administração

   public void marcarReuniao(String horarioReuniao){
        reuniao = new AdmReuniao(horarioReuniao);
   }

   public void adicionarParticipantes(String participante){
        reuniao.adicionarParticipante(participante);
   }

   public void listarParticipantes(){
        reuniao.listarParticipantes();
   }

   // CA
   // disciplinas


   //professores
    public void criarProfessor(int id, String nome, Lotacao lotacao, LocalDate dataContratacao){
        Professor p = controleAcademico.criarProfessor(id,nome,lotacao,dataContratacao);
        controleAcademico.adicionarProfessor(p);
    }

    public Professor buscarProfessorPorId(int id){
        return controleAcademico.buscarProfessorPorId(id);
    }

    //alunos
    public void criarAluno(int id, String nome){
       Aluno a = controleAcademico.criarAluno(id, nome);
       controleAcademico.adicionarAluno(a);
    }

    public Aluno buscarAlunoPorId(int id){
        return controleAcademico.buscarAlunoPorID(id);
    }

    public void mostrarTodosAlunos(){
        System.out.println(controleAcademico.getAlunos()); ;
    }
    public void matricularAlunoPorId(int idAluno, int idDisciplina){
        controleAcademico.matricularAlunoPorId(idAluno, idDisciplina);
    }
    public void mostrarRdmAlunoId(int id){
        System.out.println(buscarAlunoPorId(id).toString() +" "+
                controleAcademico.buscarDisciplinasAlunoPorId(id).getDisciplinas().toString());
    }

    public void criarDisciplina(int id, String nome, int ch){
        var disciplina = controleAcademico.criarDisciplina(id, nome, ch);
        controleAcademico.adicionarDisciplina(disciplina);
    }
    public void adicionarDisciplinaProfessor(int idProfessor, int idDisciplina){
        controleAcademico.professorAdicionarDisciplinaPorId(idProfessor, idDisciplina);
    }

    public void mostrarDisciplinasProfessorId(int idProfessor){
        System.out.println(buscarProfessorPorId(idProfessor).toString() +" "+
                controleAcademico.buscarDisciplinaProfPorId(idProfessor).getDisciplinas().toString());
    }
   //setor financeiro

    public ProfessorPagamento criarFolhaPagamento(Professor servidor){
        return new ProfessorPagamento(servidor);
    }

    public void mostrarSalarioProfessorId(int id){
        Professor p = buscarProfessorPorId(id);
        ProfessorPagamento fp = criarFolhaPagamento(p);
        System.out.println(fp);
    }

}
