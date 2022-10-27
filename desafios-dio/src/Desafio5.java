// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.*;

/*Desafio
Uma busca sequencial se caracteriza por percorrermos todos os  elementos de uma estrutura em busca do elemento “X” desejado. Neste desafio, dada uma estrutura de vetor A [a1, a2...an], percorra todo o vetor fazendo as comparações de A[N] = X. Caso a condição seja verdadeira, “X” existe na estrutura e a busca será concluída com sucesso. 

Considere um array de 10 elementos do tipo inteiro: 

Os elementos são {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}. 

● Carregue esses elementos em um array.  

● Implementação da busca sequencial: 

● Crie um método  que realiza uma busca sequencial.  

● Se o valor constar no array, retorne um texto contendo o valor e sua respectiva posição no array. Caso contrario retorne um texto dizendo que o número não foi encontrado, conforme exemplos abaixo.

 

Entrada
A entrada consiste em um valor de busca e/ou array

Saída
A saída será a a posição do elemento no array, caso o valor não se encontre na Array, retorne a frase " Numero __ nao encontrado!", como no exemplo abaixo:

 

EXEMPLO DE ENTRADA              EXEMPLO DE SAÍDA 

81                              Achei 81 na posicao 5 

10                              Achei 10 na posicao 8 

-16                             Achei –16 na posicao 2 

4                               Numero 4 nao encontrado!  */

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