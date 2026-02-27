import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        // TODO: 
        
        // Conhecer e importar a classe Scanner para ler os dados do terminal

        // Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Olá, bem-vindo ao nosso banco! Por favor, digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Agora digite o número da sua agência:");
        String agencia = scanner.nextLine();

        System.out.println("Agora digite o número da sua conta:");
        int conta = scanner.nextInt();

        System.out.println("Agora digite o valor do seu saldo:");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");


    }
}
