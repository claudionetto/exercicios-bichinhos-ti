package ex1;

public class TesteEx1 {
    public static void main(String[] args) {

        ConversorMoeda conversorMoeda = new ConversorMoeda();
        double valorConvertido = conversorMoeda.converterDolarParaReal(5);
        System.out.println(valorConvertido);

    }
}
