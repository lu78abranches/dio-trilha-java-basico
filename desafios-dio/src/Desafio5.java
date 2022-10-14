// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.*;

public class Desafio5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numeroX = leitor.nextInt();

        int[] elementos = { 64, 137, -16, 43, 67, 81, -90, 212, 10, 75 };

        // TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

        int contador;

        for (contador = 0; contador < elementos.length; contador++) {

            if (elementos[contador] == numeroX) {
                System.out.println("Achei " + elementos[contador] + " na posicao " + contador);
                break;

            }

        }

        if (contador == 10) {
            contador--;
        }
        if (numeroX != elementos[contador]) {
            System.out.println("Numero " + numeroX + " nao encontrado!");

        }

    }
}