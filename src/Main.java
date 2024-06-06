import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("---CONTA---");
        System.out.println("Por favor insira o seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Por favor insira a sua agência: ");
        String agencia = scan.nextLine();
        System.out.println("Por favor insira o numero de sua agencia: ");
        int conta = scan.nextInt();
        System.out.println("Por favor insira o numero do seu saldo: ");
        float saldo = scan.nextFloat();

        contaTerminal.nomeCliente(nome);
        contaTerminal.agencia(agencia);
        contaTerminal.numero(conta);
        contaTerminal.saldo(saldo);

        System.out.println("Olá " + nome.concat(", obrigado por criar uma conta em nosso banco, ") +
                "sua agência é ".concat(agencia) + ", conta " + conta + " e seu saldo " + saldo +
                " já está disponível para saque");
    }
}