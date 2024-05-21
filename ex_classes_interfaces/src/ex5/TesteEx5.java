package ex5;

public class TesteEx5 {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();

        System.out.println(conversorTemperaturaPadrao.celsiusParaFahrenheit(10));
        System.out.println(conversorTemperaturaPadrao.fahrenheitParaCelsius(50));

    }
}
