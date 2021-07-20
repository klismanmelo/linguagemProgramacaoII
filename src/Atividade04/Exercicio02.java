package Atividade04;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String frase = new String();
        StringBuilder fraseInvertida = new StringBuilder();

        System.out.println("Escreva uma frase: ");
        frase = ler.nextLine();

        for(int i=frase.length()-1; i>=0; i--) {
            fraseInvertida.append(frase.charAt(i));
        }

        System.out.println(fraseInvertida);
    }
}
