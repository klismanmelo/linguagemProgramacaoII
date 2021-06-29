package Atividade07;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList();
        int x, i, n=5;

        for (i=0;i<n;i++) {
            System.out.println("Digite um valor: ");
            x = leia.nextInt();
            lista.add(x);
        }

        for (Integer k : lista)   {
            System.out.println("Elementos: " + k);
        }

        for(i=0;i<n;i++) {
            if((lista.get(i) % 2) == 0) {
                lista.remove(i);
            }
        }

        for (Integer k : lista)   {
            System.out.println("Elementos: " + k);
        }
    }
}
