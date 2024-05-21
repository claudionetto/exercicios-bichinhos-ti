package ex11;

import ex9.Vendavel;

public class Servico implements Vendavel {

    private double precoHora;
    private double horasDeTrabalho;

    public Servico(double precoHora, double horasDeTrabalho) {
        this.precoHora = precoHora;
        this.horasDeTrabalho = horasDeTrabalho;
    }

    @Override
    public double calcularPrecoTotal() {
        return precoHora * horasDeTrabalho;
    }

    @Override
    public double aplicarDesconto(double descontoPercentual) {
        return precoHora - precoHora * (descontoPercentual * 0.01);
    }
}
