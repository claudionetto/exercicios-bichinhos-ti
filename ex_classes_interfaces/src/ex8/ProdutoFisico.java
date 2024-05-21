package ex8;

import ex6.Calculavel;

public class ProdutoFisico implements Calculavel {

    private double precoBase;
    private double custoEnvio;
    private double impostoPercentual;

    public ProdutoFisico(double precoBase, double custoEnvio, double impostoPercentual) {
        this.precoBase = precoBase;
        this.custoEnvio = custoEnvio;
        this.impostoPercentual = impostoPercentual;
    }


    @Override
    public double calcularPrecoFinal() {
        return precoBase + precoBase * (impostoPercentual * 0.01) + custoEnvio;
    }
}
