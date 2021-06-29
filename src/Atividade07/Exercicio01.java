package Atividade07;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        int x;
        Scanner leia = new Scanner(System.in);

        do{
            System.out.println("Digite um valor interio: ");
            x = leia.nextInt();
            if(x>=0){
                lista.add(x);
            }
        }while(x>=0);

        for(Integer i : lista) {
            System.out.println("Elementos: " + i);
        }
    }
}
