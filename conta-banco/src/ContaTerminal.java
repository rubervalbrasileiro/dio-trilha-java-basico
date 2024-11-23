import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        //todo: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir a s mensagens para nosso usário

        System.out.println("Por favor, digite o número da Agência ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta ");
        int numero = scanner.nextInt(); 

        scanner.nextLine();

        System.out.println("Por favor, informe o nome do cliente");
        String nome = scanner.nextLine();

        System.out.println("Informe o saldo inicial ");
        double saldo = scanner.nextDouble();

        //Obter pelo Sacaner os valores digitados no terminal

        System.out.println("Olá "+ nome + " obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + " Conta "+ numero+ " seu saldo é "+ saldo);


    }
}
