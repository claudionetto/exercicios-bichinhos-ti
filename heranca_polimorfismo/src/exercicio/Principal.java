package exercicio;

import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Craudin", "Minha casa");
        Produto produto = new Produto("PC", "Personal Computer", 1000);
        ItemPedido itemPedido = new ItemPedido(produto, 1);

        Loja loja = new Loja();
        Pedido pedido = loja.criarPedidoExpress(cliente, List.of(itemPedido), 25);
        pedido.aplicarDesconto(10);
        loja.salvarPedido(pedido);
        System.out.println(loja.calcularFaturamentoTotal());
        System.out.println(loja.listarPedidos());

        loja.adicionarProduto(produto);

        List<Produto> produtos = loja.listarProdutos();
        System.out.println(produtos);
        produtos.remove(0);

        System.out.println(produtos);
        System.out.println(loja.listarProdutos());
    }
}
