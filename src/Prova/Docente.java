package Prova;

public class Docente extends Usuario{
    private String tipo;
    public Docente(String nome, String tipo) {
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
        System.out.println("Docente= " + super.getNome() + mensagem.toString());
    }


}
