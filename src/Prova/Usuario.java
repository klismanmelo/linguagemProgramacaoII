package Prova;

import java.util.ArrayList;

public abstract class Usuario{
    private String nome;
    ArrayList<Mensagem> listaMensagemRecebidas = new ArrayList();

    public Usuario(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void receberMensagem(Mensagem msg){
        cadastrarMensagem(msg);
        imprimirMensagem(msg);
    }

    private void cadastrarMensagem(Mensagem msg){
        listaMensagemRecebidas.add(msg);
    }

    public abstract void imprimirMensagem(Mensagem msg);
}
