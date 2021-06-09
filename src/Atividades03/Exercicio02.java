package Atividades03;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String numero = new String();
        int i=0;

        System.out.println("Digite um numero: ");
        numero = leia.next();

        for(i=0;i<numero.length();i++) {
            if(numero.charAt(i) == '0'){
                System.out.println("ZERO ");
            }
            if(numero.charAt(i) == '1'){
                System.out.println("UM ");
            }
            if(numero.charAt(i) == '2'){
                System.out.println("DOIS ");
            }
            if(numero.charAt(i) == '3'){
                System.out.println("TRES ");
            }
            if(numero.charAt(i) == '4'){
                System.out.println("QUATRO ");
            }
            if(numero.charAt(i) == '5'){
                System.out.println("CINCO ");
            }
            if(numero.charAt(i) == '6'){
                System.out.println("SEIS ");
            }
            if(numero.charAt(i) == '7'){
                System.out.println("SETE ");
            }
            if(numero.charAt(i) == '8'){
                System.out.println("OITO ");
            }
            if(numero.charAt(i) == '9'){
                System.out.println("NOVE ");
            }
        }
    }



}
