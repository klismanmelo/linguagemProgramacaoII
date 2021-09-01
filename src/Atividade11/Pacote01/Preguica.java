package Atividade11.Pacote01;

public class Preguica extends Animal{
    private String subirArvore;
    public Preguica(String nome, Integer idade, boolean emitirSom, String subirArvore) {
        super(nome, idade, emitirSom);
        this.subirArvore = subirArvore;
    }
}
