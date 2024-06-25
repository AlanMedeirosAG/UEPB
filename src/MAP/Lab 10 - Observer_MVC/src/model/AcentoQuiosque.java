package model;

public class AcentoQuiosque implements Acento {
    
    private int id;
    private String status;

    public AcentoQuiosque(int id, String status){
        this.id = id;
        this.status = status;
    }

    public int getId(){
        return this.id;
    }

    public String getSituacao(){
        return this.status;
    }

    public void setSituacao(String status){
        this.status = status;
    }

}
