/* Criando um programa que:
Solicita ao usuário para inserir dois números inteiros.
Divide o primeiro número pelo segundo número.
Imprime o resultado da divisão.
Trata possíveis exceções que possam ocorrer durante a entrada dos números e durante a divisão (por exemplo, divisão por zero e entrada inválida).*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        while (true){

            try {

                System.out.print("Digite o primeiro número inteiro: ");
                int num1 = sc.nextInt();

                System.out.print("Digite o segundo número inteiro: ");
                int num2 = sc.nextInt();

                int resultado = num1 / num2;

                System.out.printf("Resultado: %d\n", resultado);
                break;

            }

            catch (InputMismatchException e) {
                System.out.println("Erro: Insira apenas números inteiros.");
            }

            catch (ArithmeticException e) {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }         
                        

        }

        sc.close();
        System.out.println("Programa Encerrado!");      

    }
}
