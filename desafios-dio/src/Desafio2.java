// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, N;
        int somaMultiplos = 0;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        // TODO: Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".

        for (int i = 1; i <= N; i++) {
            System.out.println(i + "vezes que passou ");
            if (i % A == 0) {
                somaMultiplos += i;
                System.out.println(i + " : " + somaMultiplos);
            }
        }

        System.out.println(somaMultiplos);

    }
}