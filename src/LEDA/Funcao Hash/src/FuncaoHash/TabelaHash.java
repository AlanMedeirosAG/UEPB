package FuncaoHash;

import java.util.LinkedList;

public class TabelaHash {
    private int tamanho;
    private LinkedList<String>[] tabela;

    // Construtor que inicializa a tabela de hash com o tamanho especificado
    public TabelaHash(int tamanho) {
        this.tamanho = tamanho;
        this.tabela = new LinkedList[tamanho];

        // Inicializa cada posição da tabela com uma lista encadeada
        for (int i = 0; i < tamanho; i++) {
            tabela[i] = new LinkedList<>();
        }
    }

    // Função de hash utilizando multiplicação
    private int hashMultiplicacao(String chave) {
        double A = 0.6180339887;
        double h = chave.hashCode() * A;
        // Calcula o índice usando a técnica de multiplicação
        return (int) (tamanho * (h - Math.floor(h)));
    }

    // Função de hash utilizando divisão
    private int hashDivisao(String chave) {
        int somaCaracteres = 0;
        // Calcula a soma dos valores ASCII dos caracteres na chave
        for (char c : chave.toCharArray()) {
            somaCaracteres += c;
        }
        // Calcula o índice usando a técnica de divisão
        return somaCaracteres % tamanho;
    }

    // Função de hash personalizada
    private int hashPersonalizada(String chave) {
        int hash = 0;
        // Calcula o hash ponderado dos caracteres na chave
        for (int i = 0; i < chave.length(); i++) {
            hash += (int) chave.charAt(i) * (i + 1);
        }
        // Calcula o índice usando a técnica de divisão
        return hash % tamanho;
    }

    // Insere uma lista de elementos na tabela de hash
    public void inserirElementos(String[] elementos) {
        for (String elemento : elementos) {
            inserir(elemento);
        }
    }

    // Insere um elemento na tabela de hash usando as três funções de hash
    private void inserir(String elemento) {
        int indexMultiplicacao = hashMultiplicacao(elemento);
        int indexDivisao = hashDivisao(elemento);
        int indexPersonalizada = hashPersonalizada(elemento);

        // Adiciona o elemento nas listas correspondentes
        tabela[indexMultiplicacao].add(elemento);
        tabela[indexDivisao].add(elemento);
        tabela[indexPersonalizada].add(elemento);
    }

    // Busca um elemento na tabela de hash usando as três funções de hash
    public boolean buscar(String elemento) {
        int indexMultiplicacao = hashMultiplicacao(elemento);
        int indexDivisao = hashDivisao(elemento);
        int indexPersonalizada = hashPersonalizada(elemento);

        // Verifica se o elemento está presente em alguma das listas correspondentes
        return tabela[indexMultiplicacao].contains(elemento) ||
                tabela[indexDivisao].contains(elemento) ||
                tabela[indexPersonalizada].contains(elemento);
    }
}

