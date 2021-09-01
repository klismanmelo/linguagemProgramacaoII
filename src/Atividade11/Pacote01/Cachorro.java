package Atividade11.Pacote01;

public class Cachorro extends Animal{
    private String deveCorrer;
    public Cachorro(String nome, Integer idade, boolean emitirSom, String deveCorrer) {
        super(nome, idade, emitirSom);
        this.deveCorrer = deveCorrer;
    }
}
