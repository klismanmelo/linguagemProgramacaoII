package Prova;

public class Visitante extends Usuario{
    private String tipo;
    public Visitante(String nome, String tipo) {
        super(nome);
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public void imprimirMensagem(Mensagem mensagem) {
        System.out.println("Visitante= " + super.getNome() + mensagem.toString());
    }


}
