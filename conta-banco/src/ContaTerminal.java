import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digito o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o numero da agencia");
        String agencia = scanner.nextLine();

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " obrigado por criar um conta em nosso banco, sua agência " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível");
    }
}
