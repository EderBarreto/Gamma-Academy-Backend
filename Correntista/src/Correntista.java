import java.util.Scanner;

public class Correntista {
    public static void main(String[] args) {
        String  nome, agencia, conta ;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do correntista");
        nome =  entrada.nextLine();
        System.out.println("digite o numero da agencia ");
        agencia = entrada.nextLine();
        System.out.println(" digite o numero da conta");
        conta = entrada.nextLine();

        System.out.println("\n O cliente: " + nome + " tem conta numero: " + conta + " e agencia: " + agencia );
    }
}
