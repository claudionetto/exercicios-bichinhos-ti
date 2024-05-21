package exercicio;

import java.time.LocalDateTime;
import java.util.List;

public class PedidoSimples extends Pedido {

    private static final double VALOR_FRETE = 10;

    @Override
    public double calcularValorTotal() {
        return super.calcularValorTotal() - VALOR_FRETE;
    }

    public PedidoSimples() {
    }

    public PedidoSimples(Long id, Cliente cliente, LocalDateTime dataPedido, List<ItemPedido> itens) {
        super(id, cliente, dataPedido, itens);
    }
}
