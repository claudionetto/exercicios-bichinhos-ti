package ex7;

import ex6.Calculavel;

public class Livro implements Calculavel {

    private double precoBase;
    private double descontoPercentual;

    public Livro(double precoBase, double descontoPercentual) {
        this.precoBase = precoBase;
        this.descontoPercentual = descontoPercentual;
    }


    @Override
    public double calcularPrecoFinal() {
        return precoBase - precoBase * (descontoPercentual * 0.01);
    }
}
