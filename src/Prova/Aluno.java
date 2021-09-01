package Prova;

public class Aluno extends Usuario{
    private String tipo;
    public Aluno(String nome, String tipo) {
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
        System.out.println("Aluno= " + super.getNome() + mensagem.toString());
    }
}
