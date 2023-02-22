import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int anoNascimento, idade;

        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu ano de nascimento");
        anoNascimento = teclado.nextInt();
        idade = 2023 - anoNascimento;

        System.out.println("Sua idade é: " + idade);

    }
}