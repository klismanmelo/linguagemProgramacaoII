package Prova;

public class Mensagem {
    private String titulo;
    private String conteudo;

    public Mensagem(String titulo, String conteudo){
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getConteudo(){
        return conteudo;
    }
    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return"titulo Mensagem='" + this.getTitulo() + '\'' +
                "- conteudo Mensagem='" + this.getConteudo() + '\'';
    }
}
