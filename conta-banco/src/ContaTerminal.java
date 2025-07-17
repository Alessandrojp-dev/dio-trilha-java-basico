import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

 

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.nextLine();

        System.out.println("Digite o número da Conta !");
        int conta = sc.nextInt();

        System.out.println("Digite seu nome completo: ");
        sc.nextLine(); 
        String nome = sc.nextLine();

        System.out.println("Agora, deposite um valor para criar sua conta !");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}
