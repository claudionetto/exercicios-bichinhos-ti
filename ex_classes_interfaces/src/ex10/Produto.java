package ex10;

import ex9.Vendavel;

public class Produto implements Vendavel {

    private double precoUnitario;
    private int quantidade;

    public Produto(double precoUnitario, int quantidade) {
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    @Override
    public double calcularPrecoTotal() {

        return precoUnitario * quantidade;
    }

    @Override
    public double aplicarDesconto(double descontoPercentual) {
        return precoUnitario - precoUnitario * (descontoPercentual * 0.01);
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
