package ListaDuplamenteEncadeada;

class ListaDuplamenteEncadeada {
    No cabeca;
    No cauda;

    public ListaDuplamenteEncadeada() {
        this.cabeca = null;
        this.cauda = null;
    }

    public void adicionarNoInicio(int valor) {
        No no = new No(valor);
        if (cabeca == null) {
            cabeca = no;
            cauda = no;
        } else {
            no.proximo = cabeca;
            cabeca.anterior = no;
            cabeca = no;
        }
    }

    public void adicionarNoFinal(int valor) {
        No no = new No(valor);
        if (cabeca == null) {
            cabeca = no;
            cauda = no;
        } else {
            no.proximo = cauda;
            cauda.anterior = no;
            cauda = no;
        }
    }

    public boolean buscar(int valor) {
        No currentNode = cabeca;
        while (currentNode != null) {
            if (currentNode.valor == valor) {
                return true;
            }
            currentNode = currentNode.proximo;
        }
        return false;
    }

    public void adicionarNaPosicaoK(int valor, int informacao) {
            No no = new No(valor);
        no.informacao = informacao;

        if (cabeca == null) {
            cabeca = no;
            cauda = no;
        } else if (informacao == 1) {
            no.proximo = cabeca;
            cabeca.anterior = no;
            cabeca = no;
        } else {
            No currentNode = cabeca;
            for (int i = 1; i < informacao - 1 && currentNode != null; i++) {
                currentNode = currentNode.proximo;
            }

            if (currentNode != null) {
                no.proximo = currentNode.proximo;
                if (currentNode.proximo != null) {
                    currentNode.proximo.anterior = no;
                }
                currentNode.proximo = no;
                no.anterior = currentNode;
            }
        }
    }

    public boolean remover(int value) {
        No currentNode = cabeca;
        while (currentNode != null) {
            if (currentNode.valor == value) {
                if (currentNode.anterior != null) {
                    currentNode.anterior.proximo = currentNode.proximo;
                } else {
                    cabeca = currentNode.proximo;
                }

                if (currentNode.proximo != null) {
                    currentNode.proximo.anterior = currentNode.anterior;
                } else {
                    cauda = currentNode.anterior;
                }

                return true; // Node found and removed
            }
            currentNode = currentNode.proximo;
        }
        return false; // Node not found
    }
}
