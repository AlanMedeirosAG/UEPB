import models.*;
import java.util.ArrayList;

    public class Main {
    public static void main(String[] args) throws Exception {

        //Cria lista de funcionários e filmes
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        ArrayList<Filme> filmes = new ArrayList<Filme>();

        //Cadaastrando funcionarios e as funções que podem exercer
        Ator ator1 = new Ator("Ator");
        Funcionario funcionario1 = new Funcionario("Alberto", 001);
        funcionario1.adicionarFuncao(ator1);
        funcionarios.add(funcionario1);

        Diretor diretor1 = new Diretor("Diretor");
        Funcionario funcionario2 = new Funcionario("Ana", 002);
        funcionario2.adicionarFuncao(diretor1);
        funcionarios.add(funcionario2);

        Cinegrafista cinegrafista1 = new Cinegrafista("Cinegrafista");
        Funcionario funcionario3 = new Funcionario("Jonas", 003);
        funcionario3.adicionarFuncao(cinegrafista1);
        funcionarios.add(funcionario3);

        Camera camera1 = new Camera("Camera");
        Funcionario funcionario4 = new Funcionario("Maria", 004);
        funcionario4.adicionarFuncao(camera1);
        funcionarios.add(funcionario4);

        Roteirista roteirista1 = new Roteirista("Roteirista");
        Funcionario funcionario5 = new Funcionario("Thiago", 005);
        funcionario5.adicionarFuncao(roteirista1);
        funcionarios.add(funcionario5);

        //Criando um filme e o seu elenco
        Filme filme1 = new Filme("Rocky 33", 2023);
        filmes.add(filme1);
        ArrayList<Funcionario> atores1 = new ArrayList<Funcionario>();
        atores1.add(funcionario1);
        Elenco elenco = new Elenco( funcionario2, funcionario3, funcionario4, funcionario5, atores1 );
        filme1.setElenco(elenco);


        for(Funcionario funcionario : funcionarios){
            System.out.println("Filmografia de " + funcionario.getNome() + "(" + funcionario.getId() + ") " + ":");
            for(Filme filme : filmes){
                if( filme.getElenco().getDiretor().getId() == funcionario.getId()){
                    System.out.println("Diretor em " + filme.getNome());
                }
                if( filme.getElenco().getCinegrafista().getId() == funcionario.getId()){
                    System.out.println("Cinegrafista em " + filme.getNome());
                }
                if( filme.getElenco().getRoteirista().getId()== funcionario.getId() ){
                    System.out.println("Roteirista em " + filme.getNome());
                }
                if( filme.getElenco().getCamera().getId() == funcionario.getId()){
                    System.out.println("Camera em " + filme.getNome());
                }
                for( Funcionario funcionario_ator : filme.getElenco().getAtores() ){
                    if( funcionario.getId() == funcionario_ator.getId()){
                        System.out.println("Ator em " + filme.getNome());
                    }
                }
            }
        }

        for( Filme filme : filmes ){
            System.out.println("\nInformações de " + filme.getNome() +
                    ":\nAno:" + filme.getAno() +
                    "\nElenco:" +
                    "\nDiretor: " + filme.getElenco().getDiretor().getNome() +
                    "\nCinegrafista: " + filme.getElenco().getCinegrafista().getNome() +
                    "\nCamera: " + filme.getElenco().getCamera().getNome() +
                    "\nRoteirista: " + filme.getElenco().getRoteirista().getNome()+
                    "\nAtores:");
            for( Funcionario funcionario : filme.getElenco().getAtores() ){
                System.out.println( "- " + funcionario.getNome() );
            }
        }

    }
}
