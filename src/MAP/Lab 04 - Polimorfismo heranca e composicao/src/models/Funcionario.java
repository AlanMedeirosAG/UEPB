package models;
import tools.Funcao;

import java.util.ArrayList;

public class Funcionario {

    private String nome;
    private ArrayList<Funcao> funcoes;
    private int id;

    public Funcionario(String nome, int id){
        this.nome = nome;
        this.id = id;
        this.funcoes = new ArrayList<Funcao>();
    }

    public String getNome(){
        return this.nome;
    }

    public int getId(){
        return this.id;
    }

    public void adicionarFuncao(Funcao funcao) {
        this.funcoes.add(funcao);
    }

    public ArrayList<Funcao> getFuncoes(){
        return funcoes;
    }

}