package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Luffy", 20, 1.7, 68);
        Pessoa p2 = new Pessoa("Zoro", 22, 1.85, 80);
        Pessoa p3 = new Pessoa("Nami", 21, 1.68, 62.25);

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        System.out.println("Tamanho da lista pessoas: " + pessoas.size());
        System.out.println("Primeira pessoa da lista: " + pessoas.get(0));

        System.out.println("Lista completa: " + pessoas);

        System.out.println("==========================================");
        System.out.println("Lista formatada: ");
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(i + "- " + pessoas.get(i));
        }

    }
}
