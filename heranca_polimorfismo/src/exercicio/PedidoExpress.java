package exercicio;

import java.time.LocalDateTime;
import java.util.List;

public class PedidoExpress extends Pedido{

    private double valorFrete;

    public PedidoExpress(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public PedidoExpress(Long id, Cliente cliente, LocalDateTime dataPedido, List<ItemPedido> itens, double valorFrete) {
        super(id, cliente, dataPedido, itens);
        this.valorFrete = valorFrete;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    @Override
    public double calcularValorTotal() {
        return super.calcularValorTotal() - valorFrete;
    }
}
