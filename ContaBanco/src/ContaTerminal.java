        //TODO: Conhecer e importar a classe Scanner

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        // Declaração das variáveis

        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(new Locale("pt", "BR"));

        // Exibir as mensagens para o nosso usuário

        System.out.println("-------- Seja bem-vindo ao Banco -------- ");

        System.out.println("Conta Terminal: Por favor, digite os dados da conta bancária:");

        // Obter pela classe Scanner os valores digitados no terminal

        System.out.print("Número da Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Número da Conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine(); // Limpar a quebra de linha

        System.out.print("Nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Saldo da Conta: ");
        saldo = scanner.nextDouble();

        // Feche o scanner após a leitura dos dados
        scanner.close();

      // Formatar o saldo com duas casas decimais

        DecimalFormat formatoSaldo = new DecimalFormat("#0.00");
        String saldoFormatado = formatoSaldo.format(saldo);

        // Exiba as informações da conta usando o método concat

       // Exibir a mensagem da conta criada
       
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.\n"
                + "Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo é R$" + saldoFormatado + "\n"
                + "Já está disponível para saque.";

        System.out.println("\n" + mensagem);
    }
}






