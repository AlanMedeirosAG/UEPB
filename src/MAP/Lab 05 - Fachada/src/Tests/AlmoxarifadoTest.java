package Tests;

import model.almoxarifado.*;
import org.junit.*;
import static org.junit.Assert.*;

import java.util.List;


    public class AlmoxarifadoTest {

        private Almoxarifado almoxarifado;

        @Before
        public void setUp() {
            almoxarifado = new Almoxarifado();
        }

        @Test
        public void testAdicionarProduto() {
            almoxarifado.adicionarProduto(1, "Produto 1");
            List<Produto> produtos = almoxarifado.getProdutos();
            assertEquals(1, produtos.size());
            assertEquals(1, produtos.get(0).getId());
            assertEquals("Produto 1", produtos.get(0).getNome());
        }

        @Test
        public void testRemoverProduto() {
            almoxarifado.adicionarProduto(1, "Produto 1");
            almoxarifado.removerProduto(1);
            List<Produto> produtos = almoxarifado.getProdutos();
            assertTrue(produtos.isEmpty());
        }

        @Test(expected = IllegalArgumentException.class)
        public void testRemoverProdutoInexistente() {
            almoxarifado.removerProduto(1);
        }

        @Test
        public void testFazerPedidoProdutos() {
            almoxarifado.fazerPedidoProdutos("Pedido 1");
            almoxarifado.fazerPedidoProdutos("Pedido 2");
            List<Pedido> pedidos = almoxarifado.getPedidos();
            assertEquals(2, pedidos.size());
            assertEquals("Pedido 1", pedidos.get(0).getNome());
            assertEquals("Pedido 2", pedidos.get(1).getNome());
        }

        @Test
        public void testListarPedidos() {
            almoxarifado.fazerPedidoProdutos("Pedido 1");
            almoxarifado.fazerPedidoProdutos("Pedido 2");
            almoxarifado.listarPedidos();
        }

        @Test
        public void testListarProdutos() {
            almoxarifado.adicionarProduto(1, "Produto 1");
            almoxarifado.adicionarProduto(2, "Produto 2");
            almoxarifado.listarProdutos();
        }
    }


