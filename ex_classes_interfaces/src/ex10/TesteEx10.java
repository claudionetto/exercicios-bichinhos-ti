package ex10;

public class TesteEx10 {
    public static void main(String[] args) {

        Produto produto = new Produto(10, 10);

        System.out.println(produto.aplicarDesconto(50));
        System.out.println(produto.calcularPrecoTotal());

    }
}
