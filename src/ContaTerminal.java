import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("---CONTA---");

        System.out.println("Por favor insira o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Por favor insira a sua agência: ");
        String agencia = scan.nextLine();

        System.out.println("Por favor insira o numero de sua agencia: ");
        int numero = scan.nextInt();

        System.out.println("Por favor insira o numero do seu saldo: ");
        float saldo = scan.nextFloat();


        System.out.println("Olá " + nome.concat(", obrigado por criar uma conta em nosso banco, ") +
                "sua agência é ".concat(agencia) + ", conta " + numero + " e seu saldo " + saldo +
                " já está disponível para saque");
    }
}