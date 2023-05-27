public class ManipulandoDadosReferencia {

    public static void main(String[] args) {

        // Converter uma String para int (sao tipos de dados diferentes e nao se comnversam)
        // nao da pra fazer o typecast
        //fazer a classe que refrencia o tipo de dado que quero utilizar chamadas de wrapper class


        // no caso do int é chamdo de integer
        // depois o .parseint(aqui vai o que eu quero converter)

//        String valor = "20";
//        int total = 10 * Integer.parseInt(valor);
//        System.out.println(total);

        // no caso de float double ou casa decimal

//        String valor = "1500";
//        float salario = 3 * Float.parseFloat(valor);
//        System.out.println(salario);


        // Quando vai converter algo para String usa o .tooString
        // no caso de int para String

//        int idade = 33;
//        String valor = Integer.toString(idade);
//        System.out.println(idade);

        // no caso de float para String

        float salario = 1.500f;
        String valor = Float.toString(salario);
        System.out.println(salario);



    }

}
