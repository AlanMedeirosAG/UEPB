package model;

public class AcentoOnibus implements Acento {
    
    private int id;
    private String cor;

    public AcentoOnibus(int id, String cor){
        this.id = id;
        this.cor = cor;
    }

    public int getId(){
        return this.id;
    }

    public String getSituacao(){
        return this.cor;
    }

    public void setSituacao(String cor){
        this.cor = cor;
    }

}
