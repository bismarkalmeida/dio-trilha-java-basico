import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {        
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = myScanner.nextLine();

        System.out.println("Seu numero da agencia");
        String agencia = myScanner.nextLine();

        System.out.println("Informe seu numero de conta: ");
        int numeroConta = myScanner.nextInt();
        
        System.out.println("Informe o saldo da conta: ");
        double saldo = myScanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
