class Operadores4 {
    public static void main(String[] args) {
        // classe Operadores.java
        String nomeUm = "Luis";
        String nomeDois = "Luis";

        System.out.println(nomeUm == nomeDois); // essa comparação é possivel porque estamos 2 variaveis da classe
                                                // String

        String nomeTres = "Luis";
        String nomeQuatro = new String("Luis Abranches");

        System.out.println(nomeTres.equals(nomeQuatro)); // nesse caso a comparação é com um objeto, usamos o método
                                                         // equals

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numero1 é igual a numero2?: " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente a numero2?: " + simNao);

        if (numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if (numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if (numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");
    }
}