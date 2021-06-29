package Atividades06;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        ArrayList nomesLista = new ArrayList();
        String nomes;
        Boolean status = false;
        Boolean statusNome = false;
        Scanner leia = new Scanner(System.in);

        do{
            System.out.println("Digite um nome para adicionar na lista: ");
            nomes = leia.next();
            do{
                if(nomesLista.contains(nomes)){
                    System.out.println("Esse nome já existe. Digite outro nome: ");
                    nomes = leia.next();
                } else {
                    status = true;
                }
            }while(status == false);

            nomesLista.add(nomes);
            System.out.println(nomesLista.indexOf(nomes));

            if(nomesLista.get(nomesLista.size()-1) == null){
                statusNome = true;
            }
        }while(statusNome == false);


    }
}
