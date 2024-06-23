import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        int nota = scanner.nextInt();

        if(nota >= 7)
            System.out.println("Aprovado");
        else    
            System.out.println("Reprovado");

        scanner.close();
    }
}