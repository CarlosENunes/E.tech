public class SaidaDados {

    public static void main(String[] args) {

        String nome = "Carlos";
        int idade = 33;
        float salario = 1.500f;

        //print = não pula linha
        //println = pula linha
        //usar \n para pular linha

//        System.out.print("Seu nome é: " + nome);
//        System.out.print("\nSua idade é: " + idade);
//
//        System.out.println("\nSeu nome é: " + nome);
//        System.out.println("Sua idade é: " + idade);


        //printf formatando saida de dados decimais
        // usa o %f para formatar
        // usa um ponto apos o % para colocar o numero de casas desejadas apos a virgula na formatação %.3f
//        System.out.println("Seu salario é: " + salario);
//        System.out.printf("Seu salario é: %.3f" , salario );

        float altura = 1.73f;
        float peso = 99.5f;
        System.out.printf("Seu peso é: %.1f kg e sua altura é: %.2f metros ", peso , altura);

    }

}
