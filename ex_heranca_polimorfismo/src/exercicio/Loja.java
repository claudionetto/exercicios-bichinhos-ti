package exercicio;

import java.time.LocalDateTime;
import java.util.*;

public class Loja {

    List<Produto> produtos = new ArrayList<>();
    HashMap<Long, Pedido> pedidos = new HashMap<>();

    Long pedidoId = 1L;

    public Loja() {
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void removerProduto(Produto produto){
        produtos.remove(produto);
    }

    public List<Produto> listarProdutos(){
        return new ArrayList<>(produtos);
    }

    public Pedido criarPedidoSimples(Cliente cliente, List<ItemPedido> itens){
        Pedido pedido = new PedidoSimples(pedidoId++, cliente, LocalDateTime.now(), itens);
        return pedido;
    }

    public Pedido criarPedidoExpress(Cliente cliente, List<ItemPedido> itens, double taxaFrete){
        Pedido pedido = new PedidoExpress(pedidoId++, cliente, LocalDateTime.now(), itens, taxaFrete);
        return pedido;
    }

    public void salvarPedido(Pedido pedido){
        pedidos.put(pedido.obterId(), pedido);
    }

    public List<Pedido> listarPedidos(){
        return new ArrayList<>(pedidos.values());
    }

    public Pedido obterPedidoPorId(Long idPedido){
        return pedidos.get(idPedido);
    }

    public double calcularFaturamentoTotal(){
        OptionalDouble faturamento = pedidos.values().stream().mapToDouble(Pedido::calcularValorTotal).reduce(Double::sum);
        return faturamento.isPresent() ? faturamento.getAsDouble() : 0;
    }


}
