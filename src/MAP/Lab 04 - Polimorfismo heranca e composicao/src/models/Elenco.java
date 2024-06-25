package models;
import tools.Funcao;

import java.util.ArrayList;

public class Elenco {

    private Funcionario diretor;
    private Funcionario cinegrafista;
    private Funcionario camera;
    private Funcionario roteirista;
    private ArrayList<Funcionario> atores;

    public Elenco(Funcionario diretor, Funcionario cinegrafista, Funcionario camera
            , Funcionario roteirista, ArrayList<Funcionario> atores){
        if(
                verificaSePodeAssumirPapel( diretor, "Diretor") &&
                        verificaSePodeAssumirPapel( cinegrafista, "Cinegrafista") &&
                        verificaSePodeAssumirPapel( camera, "Camera") &&
                        verificaSePodeAssumirPapel( roteirista, "Roteirista") &&
                        verificaSePodeAssumirPapel( atores, "Ator"))
        {
            this.diretor = diretor;
            this.cinegrafista = cinegrafista;
            this.camera = camera;
            this.roteirista = roteirista;
            this.atores = atores;
        }

    }

    public boolean verificaSePodeAssumirPapel(Funcionario funcionario, String funcaoASerAssumida){
        for( Funcao funcao : funcionario.getFuncoes() ){
            if( funcao.getNome().equals(funcaoASerAssumida) ){
                return true;
            }
        }
        throw new IllegalArgumentException("O funcionário " + funcionario.getNome() + "nao pode exercer a funcao " + funcaoASerAssumida);
    }

    public boolean verificaSePodeAssumirPapel(ArrayList<Funcionario> atores , String funcaoASerAssumida ){
        for( Funcionario funcionario : atores ){
            for( Funcao funcao : funcionario.getFuncoes() ){
                if( !(funcao.getNome().equals(funcaoASerAssumida)) ){
                    throw new IllegalArgumentException("O funcionário " + funcionario.getNome() + "nao pode exercer a funcao " + funcaoASerAssumida);
                }
            }
        }
        return true;
    }

    public Funcionario getCamera(){
        return this.camera;
    }

    public Funcionario getDiretor(){
        return this.diretor;
    }

    public Funcionario getCinegrafista(){
        return this.cinegrafista;
    }

    public Funcionario getRoteirista(){
        return this.roteirista;
    }

    public ArrayList<Funcionario> getAtores(){
        return this.atores;
    }

}