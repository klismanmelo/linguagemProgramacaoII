package Atividade11.Pacote01;

public class Cavalo extends Animal{
    private String deveCorrer;
    public Cavalo(String nome, Integer idade, boolean emitirSom, String deveCorrer) {
        super(nome, idade, emitirSom);
        this.deveCorrer = deveCorrer;
    }
}
