package model.almoxarifado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Almoxarifado {

    private List<Produto> produtos;
    private List<Pedido> pedidos;

    public Almoxarifado() {
        produtos = new ArrayList<>();
        pedidos = new ArrayList<>();
    }

    public void adicionarProduto(int id, String nome) {
        Produto novoProduto = new Produto(id, nome);
        produtos.add(novoProduto);
        System.out.println("Produto adicionado: " + novoProduto);
    }

    public void removerProduto(int id) {
        Iterator<Produto> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            if (produto.getId() == id) {
                iterator.remove();
                System.out.println("Produto removido: " + produto);
                return;
            }
        }
        throw new IllegalArgumentException("Produto com ID " + id + " não encontrado.");
    }

    public void fazerPedidoProdutos(String nomePedido) {
        Pedido novoPedido = new Pedido(nomePedido);
        pedidos.add(novoPedido);
        System.out.println("Pedido de produtos '" + nomePedido + "' realizado.");
    }

    public void listarPedidos() {
        System.out.println("Lista de pedidos:");
        for (Pedido pedido : pedidos) {
            System.out.println("Nome do pedido: " + pedido.getNome());
        }
    }

    public void listarProdutos() {
        System.out.println("Produtos no almoxarifado:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
