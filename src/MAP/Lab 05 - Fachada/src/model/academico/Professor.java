package model.academico;

import model.util.Lotacao;

import java.time.LocalDate;

public class Professor {
    int id;
    String nome;
    Lotacao lotacao;
    LocalDate dataContratacao;


    public Professor(int id, String nome, Lotacao lotacao, LocalDate dataContratacao) {
        this.id = id;
        this.nome = nome;
        this.lotacao = lotacao;
        this.dataContratacao = dataContratacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Lotacao getLotacao() {
        return lotacao;
    }

    public void setLotacao(Lotacao lotacao) {
        this.lotacao = lotacao;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    @Override
    public String toString() {
        return "["+id+"] "+nome+" - "+lotacao+" - desde: "+dataContratacao;
    }
}
