package Prova;

public class Tecnico extends Usuario{
    private String tipo;
    public Tecnico(String nome, String tipo) {
        super(nome);
        this.tipo = tipo;
    }

    public String getTipo(String tipo){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public void imprimirMensagem(Mensagem mensagem) {
        System.out.println("Tecnico= " + super.getNome() + mensagem.toString());
    }
}
