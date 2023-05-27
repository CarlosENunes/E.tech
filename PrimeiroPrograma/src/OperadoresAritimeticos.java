import java.util.Scanner;

public class OperadoresAritimeticos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        float primeiroNumero = sc.nextFloat();

        System.out.print("Insira o segundo número: ");
        float segundoNumero = sc.nextFloat();

        System.out.println("O resultado da soma é: " + (primeiroNumero + segundoNumero));

        System.out.println("O resultado da subtração é: " + (primeiroNumero - segundoNumero));

        System.out.println("O resultado da multiplicação é: " + (primeiroNumero * segundoNumero));

        System.out.println("O resultado da divisão é: " + (primeiroNumero / segundoNumero));

        System.out.println("O resultado do resto de divisão é: " + (primeiroNumero % segundoNumero));

        System.out.println("a média dos números é: " + (primeiroNumero + segundoNumero) / 2);

    }

}
