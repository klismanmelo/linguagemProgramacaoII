package Atividade04;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String frase = new String();
        StringBuilder fraseDecotificada = new StringBuilder();

        System.out.println("Escreva uma frase: ");
        frase = ler.nextLine();

        for(int i=0; i<frase.length(); i++) {
            if(frase.charAt(i) != 'p' && frase.charAt(i) != 'P' ){
                fraseDecotificada.append(frase.charAt(i));
            }else{
                if (i > 1 && i < frase.length() - 1) {
                    if ( frase.charAt(i-1) == 'p' || frase.charAt(i-1) == 'P'
                        && frase.charAt(i+1) == 'p' || frase.charAt(i+1) == 'P'){
                        fraseDecotificada.append(frase.charAt(i));
                    }
                }
            }
        }
    }
}
