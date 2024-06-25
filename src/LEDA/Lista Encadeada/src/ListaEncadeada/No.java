package ListaEncadeada;

public class No{
    public int valor;
    private No proximo;

    public No(int valor){
        this.valor = valor;
        this.proximo = null;
    }

    public void setValor(int valor){
        this.valor = valor;
    }
    public int valor(){
        return valor;
    }

    public void setProximo(No proximo){
        this.proximo = proximo;
    }
    public No getProximo(){
        return proximo;
    }
}