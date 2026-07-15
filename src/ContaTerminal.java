import java.util.Scanner;
public class ContaTerminal{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        String agencia,nomeCliente;
        double saldo;
        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = input.nextLine();
        System.out.println("Por favor, digite o número da agência !");
        agencia = input.nextLine();
        System.out.println("Por favor, digite o número da conta !");
        numero = input.nextInt();
        System.out.println("Por favor, digite o seu saldo da conta !");
        saldo = input.nextDouble();
        System.out.println("Olá "+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numero+ " e seu saldo R$"+saldo+" já está disponível para saque");

    }
}
