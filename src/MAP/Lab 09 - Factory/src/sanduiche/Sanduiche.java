package sanduiche;

import ingredientes.*;

public class Sanduiche {
    private Pao pao;
    private Queijo queijo;
    private Presunto presunto;
    private Ovo ovo;
    private Tomate tomate;

    public Pao getPao() {
        return pao;
    }

    public void setPao(Pao pao) {
        this.pao = pao;
    }

    public Queijo getQueijo() {
        return queijo;
    }

    public void setQueijo(Queijo queijo) {
        this.queijo = queijo;
    }

    public Presunto getPresunto() {
        return presunto;
    }

    public void setPresunto(Presunto presunto) {
        this.presunto = presunto;
    }

    public Ovo getOvo() {
        return ovo;
    }

    public void setOvo(Ovo ovo) {
        this.ovo = ovo;
    }

    public Tomate getTomate() {
        return tomate;
    }

    public void setTomate(Tomate tomate) {
        this.tomate = tomate;
    }

    public String mostrarIngredientes(){
        return "Sanduiche com: \n" +
                "- " + pao.getName() + "\n" +
                "- " + queijo.getName() + "\n" +
                "- " + presunto.getName() + "\n" +
                "- " + ovo.getName() + "\n" +
                "- " + tomate.getName() + "\n";
    }
}
