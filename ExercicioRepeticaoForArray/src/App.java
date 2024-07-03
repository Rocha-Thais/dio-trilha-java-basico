//Programa para ler nome, idade e altura de N pessoas. Depois mostrar na tela:
//Altura média das pessoas
//Porcentagem de pessoas com menos de 16 anos
//E nome das pessoas com menos de 16 anos (caso houver)

import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Quantas pessoas serão digitadas? ");
        int N = sc.nextInt();
        sc.nextLine();

        String[] name = new String[N];
        int[] age = new int[N];
        double[] height = new double[N];

        for (int i = 0; i < N; i++) {

            System.out.printf("Dados da %dª pessoa:\n", i + 1);
            System.out.print("Nome: ");
            name[i] = sc.nextLine();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();
            System.out.print("Altura: ");
            height[i] = sc.nextDouble();
            sc.nextLine();

        }

        double sum = 0;
        for (int i = 0; i < N; i++) {

            sum += height[i];

        }

        double averageHeight = sum / N;
        System.out.printf("\nAltura média: %.2f\n", averageHeight);

        int smaller16 = 0;
        for (int i = 0; i < N; i++) {
            if (age[i] < 16) {
                smaller16 ++;
            }
        }

        if (smaller16 > 0) {
            double percentage = ((double)smaller16 / N) * 100;
            System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentage);

            for (int i = 0; i < N; i++) {
                if (age[i] < 16) {
                    System.out.printf("%s\n", name[i]);
                }
            }

        }

        else {
            System.out.print("Não há pessoas com menos de 16 anos.");
        }

        sc.close();

    }
}