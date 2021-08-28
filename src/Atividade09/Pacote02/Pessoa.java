package Atividade09.Pacote02;

public class Pessoa {
    public String nome;
    public Pessoa pai;
    public Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa Mae){
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public boolean mesmaPessoa(Pessoa pessoa){
        if( this.nome.equals(pessoa.nome) && pessoa.mae == this.mae){
            return true;
        }else{
            return false;
        }
    }

    public  boolean irmao(Pessoa pessoa){
        if(this.mae == pessoa.mae || this.pai == pessoa.pai){
            return true;
        }else{
            return false;
        }
    }

    public boolean antecessor(Pessoa pessoa){
        boolean status = false;

        if(     pessoa == this.mae ||
                pessoa == this.pai ||
                pessoa == this.mae.pai ||
                pessoa == this.mae.mae ||
                pessoa == this.pai.mae ||
                pessoa == this.pai.pai
        ){
            status = true;
        }

        return false;
    }

}
