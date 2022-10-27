import java.util.*;
/*Desafio
Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine se uma determinada string é válida. 

Entrada
Uma string é considerada válida se:

Caracteres de abertura devem ser fechadas pelo mesmo tipo. Abertura devem ser fechados com uma chave correspondente. Uma string vazia é considerada válida. 

Saída
A saída corresponde a um valor Booleano como no exemplo abaixo:

Entrada	Saída
[ ]  true
( )  true
[ )  false */

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        String[] letraVazia = s.split("");
        String[] tags = { "(", ")", "{", "}", "[", "]" };
        boolean valido = false;

        for (int i = 0; i < tags.length; i++) {
            if (letraVazia[0].equals(tags[i]) && letraVazia[letraVazia.length - 1].equals(tags[i + 1])) {
                valido = true;
            }
        }
        return valido;
    }
}