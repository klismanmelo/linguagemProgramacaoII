package Atividade04;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String frase;
        String[] fraseInvertida;

        System.out.println("Escreva uma frase: ");
        frase = ler.nextLine();

        fraseInvertida = frase.split(" ");

        System.out.println("Contrário: \n");
        for(int i = fraseInvertida.length-1; i >=0;  i--) {
            System.out.println(fraseInvertida[i] + "");
        }


    }
}
