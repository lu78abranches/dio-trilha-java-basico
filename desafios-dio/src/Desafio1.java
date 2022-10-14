import java.util.*;

public class Desafio1 {

    public static void main(String[] args) {

        // TODO: Imprima se os valores numéricos passados são iguais ou não.

        Scanner scan = new Scanner(System.in);

        System.out.println("digite um numero:");

        int a = scan.nextInt();

        System.out.println("digite outro numero:");

        int b = scan.nextInt();

        if (a == b) {
            System.out.println("Sao iguais");
        } else {
            System.out.println("Nao sao iguais");
        }

    }
}