package ex1;

public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public double converterDolarParaReal(double valorDolar) {
        double cotacaoDolarEmReaisAtual = 5.1;
        return valorDolar * cotacaoDolarEmReaisAtual;
    }
}
