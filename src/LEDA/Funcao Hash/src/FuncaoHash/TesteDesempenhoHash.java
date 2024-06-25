package FuncaoHash;

import java.util.Random;

public class TesteDesempenhoHash {

    public static void main(String[] args) {
        int tamanhoTabela = 100;
        int tamanhoDados = 10000;

        // Criar vetor de tamanho 10000 e preenchê-lo com Strings aleatórias
        String[] vetor = new String[tamanhoDados];
        for (int i = 0; i < tamanhoDados; i++) {
            vetor[i] = gerarStringAleatoria();
        }

        // Testar desempenho da função de hash por multiplicação
        testarDesempenho("Multiplicacao", tamanhoTabela, vetor);

        // Testar desempenho da função de hash por divisão
        testarDesempenho("Divisao", tamanhoTabela, vetor);

        // Testar desempenho da função de hash personalizada
        testarDesempenho("Personalizada", tamanhoTabela, vetor);
    }

    // Método para testar o desempenho da tabela hash
    private static void testarDesempenho(String tipoHash, int tamanhoTabela, String[] dados) {
        System.out.println("Testando função de hash: " + tipoHash);

        // Medir o tempo de inserção na tabela hash
        long tempoInicioInsercao = System.nanoTime();
        TabelaHash tabelaHash = new TabelaHash(tamanhoTabela);
        tabelaHash.inserirElementos(dados);
        long tempoInsercao = (System.nanoTime() - tempoInicioInsercao);

        System.out.println("Tempo de inserção: " + tempoInsercao + " ns");

        // Realizar buscas em diferentes valores e medir o tempo
        Random random = new Random();

        //numero de testes
          int numeroBuscas = 10000;
        //int numeroBuscas = 15000;
        //int numeroBuscas = 30000;
        //int numeroBuscas = 50000;


        long tempoTotalBuscas = 0;

        for (int i = 0; i < numeroBuscas; i++) {
            String elementoBusca = dados[random.nextInt(dados.length)];

            long tempoInicioBusca = System.nanoTime();
            boolean encontrado = tabelaHash.buscar(elementoBusca);
            long tempoBusca = (System.nanoTime() - tempoInicioBusca);

            System.out.println("Busca por '" + elementoBusca + "': " + (encontrado ? "Encontrado" : "Não encontrado") +" - Tempo: " + tempoBusca + "ms");

            tempoTotalBuscas += tempoBusca;
        }

        // Calcular e exibir o tempo médio de busca
        System.out.printf("Tempo médio de busca: %.2f ns%n%n", (tempoTotalBuscas / (double) numeroBuscas));
    }

    // Método para gerar uma string aleatória de comprimento variável
    private static String gerarStringAleatoria() {
        int comprimento = (int) (Math.random() * 10) + 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < comprimento; i++) {
            char randomChar = (char) ('a' + Math.random() * ('z' - 'a' + 1));
            sb.append(randomChar);
        }
        return sb.toString();
    }
}
