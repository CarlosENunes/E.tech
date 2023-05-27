public class OperadoresLogicos {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;
        int n3 = 10;

        //Utilizando o && só da verdadeiro se todas as expressões tem que sere verdadeiras para retornar verdadeiro
        System.out.println((n1 == n2)&&(n1 >= n3)); //falso
        System.out.println((n1 < n2)&&(n3 >= n1)); //verdadeiro

        // Utilizando o || ao menos uma expressao tem de ser verdadeira para retornar verdadeiro
        System.out.println((n1 == n2)||(n1 >= n3)); //verdadeiro
        System.out.println((n1 < n2)||(n3 >= n1)); //verdadeiro
        System.out.println((n1 > n2)||(n1 > n3)); //falso






    }

}
