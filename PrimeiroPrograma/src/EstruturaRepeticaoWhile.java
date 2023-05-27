import java.util.Scanner;

public class EstruturaRepeticaoWhile {

    public static void main(String[] args) {

        /*
        Escreva um programa que conte de 0 a 100
         */

//        int cont = 0;
//
//        while (cont <= 100 ) {
//            System.out.println(cont);
//            cont = cont + 1;
//        }


        //receber números positivos diferentes de 0


        Scanner sc = new Scanner(System.in);
        int n = 1;

        while (n != 0) {
            System.out.println("sucesso");
            System.out.print("Insira um número: ");
            n = sc.nextInt();


        }

    }

}
