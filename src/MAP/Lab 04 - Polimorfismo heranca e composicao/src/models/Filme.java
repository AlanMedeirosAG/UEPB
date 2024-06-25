package models;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private int ano;
    private Elenco elenco;

    public Filme( String nome, int ano){
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public Elenco getElenco(){
        return elenco;
    }

    public void setElenco(Elenco elenco){
        this.elenco = elenco;
    }

}