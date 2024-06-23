import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        int nota = scanner.nextInt();

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");

        scanner.close();
    }    
}