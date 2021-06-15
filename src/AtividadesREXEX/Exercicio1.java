package AtividadesREXEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio1 {
    public static void main(String[] args){
        String fonte = "(16) 91231-6165";
        String verificacao = "(\\(?\\d{2}\\)?\\s)?(\\d{4,5}\\-\\d{4})";

        Pattern padrao = Pattern.compile(verificacao);
        Matcher match = padrao.matcher(fonte);

        if (match.find() == true) {
            System.out.println("Padrao");
        } else
            System.out.println("Nao identificado");
    }
}
