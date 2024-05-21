package ex3;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++){
            int produto = numero * i;
            System.out.printf("%d x %d = %d %n", numero, i, produto);
        }
    }
}
