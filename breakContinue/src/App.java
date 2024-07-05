//Desenvolver um programa que faz a leitura de uma lista de números inteiros
//O programa deve:
//Ler uma quantidade 'N' de números inteiros
//Ignorar qualquer número negativo na lista
//Calcular a soma dos números até encontrar o primeiro número zero
//Se um zero for encontrado, interrompe o processamento
//Exibir a soma dos números válidos (não negativos e antes do primeiro zero)
//Exibir os números que foram ignorados (os números negativos)

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números irá digitar? ");
        int N = sc.nextInt();
        
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {

            System.out.println("Digite os números inteiros:");
            numbers[i] = sc.nextInt();

        }
        
        int sum = 0;
        System.out.println("Números negativos: ");
        for (int i = 0; i < N; i++) {

            if (numbers[i] < 0) {
                System.out.print(numbers[i] + " ");
                continue;
            } 
            
            if (numbers[i] == 0) {
                break;
            }  

            sum += numbers[i];
        }    

        System.out.printf("\nSoma dos números válidos: %d\n", sum);

        sc.close();

    }
}
