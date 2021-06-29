package Atividade07;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> telefone = new ArrayList();
        int x,k;
        String s;

        do{
            System.out.println("1-Adicionar; 2-Listar; 3-Remover; 10-Sair" + "\nMenu: ");
            x = leia.nextInt();
            if(x == 1) {
                System.out.println("Nome;Telefone\n");
                s = leia.next();
                telefone.add(s);
            }
            if(x == 2) {
                System.out.println(telefone);
            }
            if(x == 3) {
                System.out.println("Indice a ser removido: ");
                k = leia.nextInt();
                telefone.remove(k);
            }
            if(x == 10) {
                return;
            }
        }while(x<=10);
    }
}
