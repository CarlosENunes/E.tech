import java.util.Scanner;

public class EstruturaCondicionalSwitchCase {

    public static void main(String[] args) {

        /*
        Escreva um programa que receba o nome de usuario
        e indique o nivel de acesso baseado nos requisitos abaixo:
        Administrador - 100% de acesso
        Vendedor - 50% de acesso
        Consultor - 10% de acesso
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Tipos: Administrador/Vendedor/Consultor");
        System.out.println("Insira o tipo de usuario: ");

        String tipoDeUsuario = sc.nextLine();

        switch (tipoDeUsuario){
            case "Administrador":
                System.out.println("Nivel de acesso: 100%");
                break;
            case "Vendedor":
                System.out.println("Nivel de acesso: 50%");
                break;
            case "Consultor":
                System.out.println("Nivel de acesso: 10%");
            default:
                System.out.println("Tipo de usuario invalido");

        }



    }

}
