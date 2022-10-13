public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        // TiposEVariaveis.java

        // estude tipos primitivos byte, short, int, long, double, float(com casas
        // decimais)
        // estude aclasse String que representa texto na aplição

        String nome = "LUIS ABRANCHES";

        System.out.println(nome);

        short numeroCurto = 2;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.println(numeroCurto2);

        int numero = 5;
        numero = 10;

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14;

        System.out.println(VALOR_DE_PI);

    }
}
