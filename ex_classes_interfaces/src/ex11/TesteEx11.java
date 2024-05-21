package ex11;

public class TesteEx11 {
    public static void main(String[] args) {
        Servico servico = new Servico(10, 160);

        System.out.println(servico.calcularPrecoTotal());
        System.out.println(servico.aplicarDesconto(10));
    }
}
