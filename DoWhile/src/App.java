/* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de
senha incorreta informada, escrever a mensagem "Senha Invalida! Tente novamente:". Quando a senha
for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo
encerrado. Considere que a senha correta é o valor 2023. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        do {

            System.out.print("Senha inválida. Tente novamente: ");
            senha = sc.nextInt();

        } while (senha != 2023);

        System.out.print("Acesso Permitido");

        sc.close();

    }
}