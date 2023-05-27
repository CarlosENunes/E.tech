import java.util.Scanner;

public class EstruturaCondicionalComposta {

    public static void main(String[] args) {

        /*
        Escreva um programa que receba o ano de nascimento e informe
        se é maior ou menor de idade
        >= 18 - maior de idade
        < 18 - menor de idade
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento: ");
        int anoDeNascimento = sc.nextInt();
        int idade = 2022 - anoDeNascimento;

        System.out.println("Sua idade é: " + idade);

        if(idade>=18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }

    }

}
