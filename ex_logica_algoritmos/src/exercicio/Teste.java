package exercicio;

import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da lista: ");
        int n = scanner.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < n; i++){

            System.out.println("Digite o número no index " + i);
            array[i] = scanner.nextInt();

        }

        System.out.println("Sua lista final ficou: " + Arrays.toString(array));
        QuickSort quickSort = new QuickSort();

        System.out.println("Ordenando usando QuickSort... ");
        long startTime = System.currentTimeMillis();

        quickSort.quickSort(array);

        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Levou " + duration + "ms para ordenar");
        System.out.println("Lista ordenada: "+ Arrays.toString(array));

        scanner.close();

    }
}
