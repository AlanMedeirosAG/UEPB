package ArvoreBinaria;

public class No  {
    int valor;
     No esquerda;
     No direita;

    public No (int valor) {
        this.valor = valor;
        esquerda = null;
        direita = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }
}

