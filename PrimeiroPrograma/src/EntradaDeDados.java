import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        int idade = 2022 - anoNascimento;

        System.out.println("Digite seu salario: ");
        float salario = sc.nextFloat();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua renda mensal é: " + salario);

    }

}
