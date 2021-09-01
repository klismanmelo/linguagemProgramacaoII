package Prova;

import java.util.ArrayList;

public class Editor {
    private String nome;
    ArrayList<Usuario> listaSeguidores = new ArrayList();
    Usuario usr;

    public Editor(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void cadastrarSeguidor(Usuario usr){
        this.listaSeguidores.add(usr);
    }

    public void enviarMensagem(Mensagem msg){
        for(int i=0;i< listaSeguidores.size();i++) {
            usr = listaSeguidores.get(i);
            usr.receberMensagem(msg);
        }
    }
}
