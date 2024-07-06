/* Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a
4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o
código informado for o número 4, devendo então mostrar a mensagem "MUITO OBRIGADO", bem
como as quantidades de cada combustível. */

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("QUANTIDADE DE PRODUTOS:");
        System.out.printf("1 - Álcool\n2 - Gasolina\n3 - Diesel\n4 - Fim\n");

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (true){

            System.out.print("\nInforme um código (1, 2, 3) ou 4 para sair: ");
            int codigo = sc.nextInt();

            switch (codigo) {

                case 1:
                    alcool ++;
                    break;
                
                case 2:
                    gasolina ++;
                    break;

                case 3:
                    diesel ++;
                    break;
                
                case 4:
                    System.out.println("\nMuito obrigado(a)!");
                    break;
                
                default:
                    System.out.print("Número inválido!\n");
                    break;
            }

            if (codigo == 4) {
                break;
            }
        }

        System.out.printf("Álcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);

        sc.close();

    }
}
