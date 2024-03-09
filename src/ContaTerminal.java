import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da conta: ");
        conta.numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a agência da conta: ");
        conta.agencia = scanner.next();
        scanner.nextLine();

        System.out.print("Digite o nome do cliente: ");
        conta.nomeCliente = scanner.next();
        scanner.nextLine();

        System.out.print("Digite o saldo da conta: ");
        conta.saldo = scanner.nextDouble();

        System.out.printf("Olá, %s! Sua conta de número %d, agência %s, possui saldo de R$ %.2f.\n", conta.nomeCliente, conta.numero, conta.agencia, conta.saldo);
    }
}