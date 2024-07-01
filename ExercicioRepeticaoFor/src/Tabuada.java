//Ler um número inteiro N e mostrar na tela a tabuada de N para 1 a 10

import java.util.Scanner;

public class Tabuada{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja tabuada para qual valor? ");
        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            int resultado = N * i;
            System.out.println(N + " x " + i + " = " + resultado);
        }

        sc.close();

    }

}