import java.util.Scanner;

public class EstruturaCondicionalSimples {

    public static void main(String[] args) {

        /*
        Receba o ano de nascimento do usuario e
        diga se ele é maior de idade
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("insira seu ano de nascimento: ");
        int anoDeNascimento = sc.nextInt();

        int idade = 2022 - anoDeNascimento;

        System.out.println("Sua idade é: " + idade);

//        if(idade >= 18) {
//            System.out.println("Maior de idade");
//        }

//        if(idade >= 60) {
//            System.out.println("Idoso");
//        }

        // Entre 18 e 60 anos - adulto

        if((idade>=18) && (idade <=60)) {
            System.out.println("Adulto");
        }


    }

}
