import java.util.Scanner;

public class exSimples_Scanner {
    public static void main (String[] args){

        double nota1, nota2, media ;


// entrada de dados
        Scanner entrada = new Scanner(System.in);
        String nome;

        System.out.println("digite a primeira nota");
        nota1 = entrada.nextDouble();
        System.out.println("digite a segunda nota");
        nota2 = entrada.nextDouble();
        media = (nota1 + nota2) /2 ;   
        System.out.println("media " + media);
    } 

}
