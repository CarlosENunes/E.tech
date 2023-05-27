import java.util.Scanner;

public class EstruturaCondicionalCompostaIfElseIf {

    public static void main(String[] args) {

        /*
        Escreva um programa que receba o ano de nascimento
        e informe a categoria de acordo com os requisitos abaixo
        0-10 anos - criança
        11-18 anos - adolescente
        19-60 anos - adulto
        61 anos ou mais - idoso
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        int idade = 2022 - anoNascimento;

        if((idade >= 0) && (idade <= 10)){
            System.out.println("Você tem " + idade + " ano(s) e é Criança");
        } else if ((idade >= 11) && (idade <= 18)){
            System.out.println("Você tem " + idade + " anos e é Adolescente");
        } else if ((idade >= 19) && (idade <= 60)){
            System.out.println("Você tem " + idade + " anos e é Adulto(a)");
        }else {
            System.out.println("Você tem " + idade + " anos e é Idoso(a)");
        }

    }

}
