/* Programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int N = sc.nextInt();

        int[] vetA = new int[N];
        int[] vetB = new int[N];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < N; i++) {
            vetA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < N; i++) {
            vetB[i] = sc.nextInt();
        }

        System.out.println("\nVETOR RESULTANTE: ");

        int[] vetC = new int[N];
        for (int i = 0; i < N; i++) {
            vetC[i] = vetA[i] + vetB[i];
            System.out.printf("%d\n", vetC[i]);
        }

        sc.close();

    }
}