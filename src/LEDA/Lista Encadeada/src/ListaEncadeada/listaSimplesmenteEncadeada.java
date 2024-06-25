package ListaEncadeada;

public class listaSimplesmenteEncadeada {

    public No cabeca;
    public No cauda;

public listaSimplesmenteEncadeada(){
    this.cabeca = null;
    this.cauda = null;
}

public void adicionarNoInicio(int valor) {
    No no = new No(valor);
    if (cabeca == null) {
        cabeca = no;
        cauda = no;
    } else {
        no.setProximo(cabeca);
        cabeca = no;
    }
}
public void adicionarNoFinal(int valor){
    No no = new No(valor);
    if (cabeca == null) {
        cabeca = no;
        cauda = no;
    } else {
        cauda.setProximo(no);
        cauda = no;
    }
}
public boolean buscar(int valor){
    No atual = cabeca;
    while(atual != null){
        if(atual.valor() == valor){
          return true;
        }
        atual = atual.getProximo();
    }
    return false;
}

}