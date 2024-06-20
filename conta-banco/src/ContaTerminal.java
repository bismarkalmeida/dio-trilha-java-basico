import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\nInforme seu numero de conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Sem esse item o nextLine da agência consome o Line new da conta, provocando comportamento inesperado.

        System.out.println("Seu numero da agencia");
        String agencia = scanner.nextLine();

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Informe o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque\n");
    }
}
