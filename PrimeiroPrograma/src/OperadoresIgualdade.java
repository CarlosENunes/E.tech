public class OperadoresIgualdade {

    public static void main(String[] args) {

//        int num1 = 70;
//        int num2 = 70;
//
//        String resultado = (num1==num2)?"igual":"Diferente"; // usei Operador ternario
//        System.out.println(resultado);
//
//        resultado = (num1!=num2)?"Diferente":"igual"; // Não declarei como String pois da erro, ja foi declarada então é só usar
//        System.out.println(resultado);

        String nome1 = "E.Tech";
        String nome2 = "E.Tech";
        String nome3 = new String("E.Tech"); //Instanciar ou criar a variavel em um formato diferente utilizando a classe String para criar o valor

        String resultado = (nome1==nome2)?"Igual":"Diferente";
        System.out.println(resultado);

        resultado = (nome1.equals(nome3))?"Igual":"Diferente";
        System.out.println(resultado);


    }

}
