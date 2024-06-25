package ArvoreBinaria;

public class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public No getRaiz() {
        return raiz;
    }

    // Método para inserir um novo nó na árvore binária
    public void adicionarNo(int valor) {
        raiz = insertRec(raiz, valor);
    }

    // Método auxiliar para inserir um novo nó de forma recursiva
    private No insertRec(No raiz, int valor) {
        if (raiz == null) {
            raiz = new No(valor);
            return raiz;
        }
        if (valor < raiz.getValor()) {
            raiz.setEsquerda(insertRec(raiz.getEsquerda(), valor));
        } else if (valor > raiz.getValor()) {
            raiz.setDireita(insertRec(raiz.getDireita(), valor));
        }

        return raiz;
    }

    //metodo para buscar no
    public boolean buscar(int key) {
        return buscarRec(raiz, key);
    }

    private boolean buscarRec(No raiz, int key) {
        if (raiz == null) {
            return false; // A árvore está vazia ou a chave não foi encontrada
        }

        if (raiz.getValor() == key) {
            return true; // A chave foi encontrada na raiz
        }

        if (key < raiz.getValor()) {
            return buscarRec(raiz.getEsquerda(), key); // Busca na subárvore esquerda
        } else {
            return buscarRec(raiz.getDireita(), key); // Busca na subárvore direita
        }
    }

    // Método para realizar uma travessia pré-order (raiz, esquerda, direita)
    public String percursoPreOrdem() {
        return percursoPreOrdemRec(raiz);
    }

    private String percursoPreOrdemRec(No raiz) {
        if (raiz != null) {
            String resultado = String.valueOf(raiz.getValor() + " ");
            String esquerda =  percursoPreOrdemRec(raiz.getEsquerda()) + " ";
            String direita = percursoPreOrdemRec(raiz.getDireita()) ;

            return (resultado + esquerda + direita).trim().replace("\\s+", " ");
        }
        return "";
    }


    // Método para realizar uma travessia in-order (esquerda, raiz, direita)
    public String percursoInOrdem() {
        return percursoInOrdemRec(raiz);
    }

    // Método auxiliar para a travessia in-order
    private String percursoInOrdemRec(No raiz) {
        if (raiz != null) {
                String esquerda =  percursoInOrdemRec(raiz.getEsquerda()) + " ";
                String resultado = String.valueOf(raiz.getValor() + " ");
                String direita = percursoInOrdemRec(raiz.getDireita());

                return (esquerda + resultado +  direita).trim().replaceFirst("\\s+", " ");
            }
            return "";
        }


    // Método para realizar uma travessia pós-order (esquerda, direita, raiz)
    public String percursoPosOrdem() {
        return percursoPosOrdemRec(raiz);
    }

    private String percursoPosOrdemRec(No raiz) {
        if (raiz != null) {

            String esquerda =  percursoPosOrdemRec(raiz.getEsquerda());
            String direita =  " " + percursoPosOrdemRec(raiz.getDireita());
            String valor = " " + String.valueOf(raiz.getValor());


            return (esquerda + direita + valor).trim().replaceFirst("\\s+", " ");
        }
        return "";
    }
//Método para realizar uma travessia em profundidade (raiz, esquerda, direita)

    public String percursoProfundidade() {
        return percursoProfundidadeRec(raiz);
    }

    private String percursoProfundidadeRec(No raiz) {
        if (raiz != null) {
            String resultado = raiz.getValor() + " " ; // Visita o nó raiz
            String esquerda = percursoProfundidadeRec(raiz.getEsquerda()) + " ";    // Visita a subárvore esquerda
            String direita = percursoProfundidadeRec(raiz.getDireita());   // Visita a subárvore direita


            return (resultado + esquerda + direita).trim().replace("\\s+", " ");
        }
        return "";
    }


//Método para realizar remoções de nós em uma árvore binária(folhas,com um filho,com dois filhos)

    public boolean removerNo(int key) {
        if (raiz == null) {
            return false; // Árvore vazia, nada para excluir
        } else {
            No pai = null;
            return removerNoRec(raiz, key, pai);
        }
    }

    private boolean removerNoRec(No currentNode, int key, No pai) {
        if (currentNode == null) {
            return false; // A chave não foi encontrada na árvore
        } else if (key < currentNode.getValor()) {
            return removerNoRec(currentNode.getEsquerda(), key, currentNode);
        } else if (key > currentNode.getValor()) {
            return removerNoRec(currentNode.getDireita(), key, currentNode);
        } else {
            // Caso 1: Nó folha (não tem filhos)
            if (currentNode.getEsquerda() == null && currentNode.getDireita() == null) {
                if (pai == null) {
                    raiz = null; // O nó raiz é um nó folha
                } else if (pai.getEsquerda() == currentNode) {
                    pai.setEsquerda(null);
                } else {
                    pai.setDireita(null);
                }
                return true;
            }
            // Caso 2: Nó com um filho
            else if (currentNode.getEsquerda() == null || currentNode.getDireita() == null) {
                No child = (currentNode.getEsquerda() != null) ? currentNode.getEsquerda() : currentNode.getDireita();
                if (pai == null) {
                    raiz = child;
                } else if (pai.getEsquerda() == currentNode) {
                    pai.setEsquerda(child);
                } else {
                    pai.setDireita(child);
                }
                return true;
            }
            // Caso 3: Nó com dois filhos
            else {
                No successor = findInOrderSuccessor(currentNode);
                currentNode.setValor(successor.getValor());
                return removerNoRec(currentNode.getDireita(), successor.getValor(), currentNode);
            }
        }
    }
    private static No findInOrderSuccessor (No no){
        No successor = no.getDireita();
        while (successor.getEsquerda() != null) {
            successor = successor.getEsquerda();
        }
        return successor;
    }

}//fim da classe arvore binaria