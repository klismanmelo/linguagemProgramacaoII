package Atividades03;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int i, countVogais = 0;
        String palavra;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        palavra = ler.nextLine();

        i = palavra.length();
        System.out.println(i);
        System.out.println(palavra.toUpperCase());

        for (i=0;i<palavra.length();i++) {
            char vogais = palavra.toLowerCase().charAt(i);
            if(
                    vogais == 'a'||
                    vogais == 'e'||
                    vogais == 'i'||
                    vogais == 'o'||
                    vogais == 'u'
            ){
                countVogais++;
            }
        }
        System.out.println(i);
        System.out.println(palavra.toUpperCase());
        System.out.println(countVogais);

    }
}
