package Atividades06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        String nome;
        int i = 0;
        Scanner leia = new Scanner(System.in);
        ArrayList listaNomes = new ArrayList();

        for(i=0; i<5;i++){
            System.out.println("Digite um nome: ");
            nome = leia.next();
            listaNomes.add(nome);
        }
        Collections.sort(listaNomes);
        for(i=0;i<5;i++){
            System.out.println(listaNomes.get(i) + "\n");
        }
    }
}
