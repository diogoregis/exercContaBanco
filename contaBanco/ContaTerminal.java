package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia, nomeCliente;
        double saldo;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem vindo, digite os dados para cadastro");
        System.out.println();
        System.out.print("Digite seu nome: ");
        nomeCliente = teclado.nextLine();
        System.out.print("Digite sua agência: ");
        agencia = teclado.nextLine();
        System.out.print("Digite o numero da conta: ");
        numero = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite seu saldo: ");
        saldo = Double.parseDouble(teclado.nextLine());
        System.out.println("---------------------------------------");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %d e seu saldo %.2f já está disponível para saque %n", nomeCliente.toUpperCase(), agencia, numero, saldo);
        System.out.println("---------------------------------------");



    }

}
