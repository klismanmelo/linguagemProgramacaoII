package Atividades03;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        String frase = new String();
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        frase = leia.nextLine();

        int palavras = frase.split(" ", -1).length  -1;
        int caracteres = frase.length();
        System.out.println(caracteres);
        System.out.println((palavras+1) + " palavas");
    }
}
