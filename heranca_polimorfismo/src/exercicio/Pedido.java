package exercicio;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Pedido {

    private Long id;
    private Cliente cliente;

    private LocalDateTime dataPedido;

    private List<ItemPedido> itens;

    private double desconto = 0;

    public Pedido() {
    }

    public Pedido(Long id, Cliente cliente, LocalDateTime dataPedido, List<ItemPedido> itens) {
        this.id = id;
        this.cliente = cliente;
        this.dataPedido = dataPedido;
        this.itens = itens;
    }

    public Long obterId() {
        return id;
    }

    public Cliente obterCliente() {
        return cliente;
    }


    public LocalDateTime obterDataPedido() {
        return dataPedido;
    }

    public List<ItemPedido> obterItens() {
        return itens;
    }

    public double calcularValorTotal(){

        double valorTotal = 0;

        for(ItemPedido item : itens){
            valorTotal += item.getQuantidade() * item.getProduto().getPreco();
        }

        return valorTotal - valorTotal * desconto;
    }

    public double aplicarDesconto(double descontoPercentual){
        this.desconto = descontoPercentual * 0.01;
        return calcularValorTotal();
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", dataPedido=" + dataPedido +
                ", itens=" + itens +
                '}';
    }
}
