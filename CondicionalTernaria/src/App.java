import java.util.Scanner;

public class App {
    public static void main(String[] args) {
                
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        int nota = scanner.nextInt();

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
        scanner.close();
    }
}
