package tests;
import models.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class TesteAssumirFuncao {

    Ator ator1  = null;
    Funcionario funcionario1 = null;
    Diretor diretor1 = null;
    Funcionario funcionario2 = null;
    Cinegrafista cinegrafista1 = null;
    Funcionario funcionario3 = null;
    Camera camera1 = null;
    Funcionario funcionario4 = null;
    Roteirista roteirista1 = null;
    Funcionario funcionario5 = null;


    @BeforeEach
    public void setUp(){

        //Cadastrando funcionarios e as funções que podem exercer
        ator1 = new Ator("Ator");
        funcionario1 = new Funcionario("Alberto", 001);
        funcionario1.adicionarFuncao(ator1);

        diretor1 = new Diretor("Diretor");
        funcionario2 = new Funcionario("Ana", 002);
        funcionario2.adicionarFuncao(diretor1);

        cinegrafista1 = new Cinegrafista("Cinegrafista");
        funcionario3 = new Funcionario("Jonas", 003);
        funcionario3.adicionarFuncao(cinegrafista1);

        camera1 = new Camera("Camera");
        funcionario4 = new Funcionario("Maria", 004);
        funcionario4.adicionarFuncao(camera1);;

        roteirista1 = new Roteirista("Roteirista");
        funcionario5 = new Funcionario("Thiago", 005);
        funcionario5.adicionarFuncao(roteirista1);

    }

    @Test
    public void TestAssumirFuncaoTrue(){

        //Criando uma equipe
        ArrayList<Funcionario> atores1 = new ArrayList<Funcionario>();
        atores1.add(funcionario1);
        Elenco equipe = new Elenco( funcionario2, funcionario3, funcionario4, funcionario5, atores1 );

        assertNotNull(equipe);
    }

    @Test
    public void TestAssumirFuncaoFalse() {
        // Tentando criar uma equipe sem nenhum ator
        ArrayList<Funcionario> atores1 = new ArrayList<>();
        atores1.add(funcionario2); // Adicionando apenas o diretor à lista de atores
        assertThrows(IllegalArgumentException.class, () -> {
            new Elenco(funcionario2, funcionario3, funcionario4, funcionario5, atores1);
        });
    }




}