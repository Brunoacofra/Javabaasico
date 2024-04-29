import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String cliente = scanner.nextLine();
        
        System.out.println("Digite o Numero da agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo da conta: ");
        float saldo = scanner.nextFloat();
        scanner.close();
        System.out.println("Olá "+cliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}