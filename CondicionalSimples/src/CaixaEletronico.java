import java.util.Scanner;
import java.util.Locale;

public class CaixaEletronico {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 500.00;
        System.out.println(String.format("Seu saldo é: R$ %.2f", saldo));
        System.out.println("Quanto deseja sacar? ");
        double valorSolicitado = scanner.nextDouble();

        if (valorSolicitado < saldo)
            saldo -= valorSolicitado; 
        System.out.println(String.format("Saldo: R$ %.2f", saldo));           
        
        
        scanner.close();
    }
}