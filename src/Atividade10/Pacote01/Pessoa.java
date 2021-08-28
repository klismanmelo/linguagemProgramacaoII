package Atividade10.Pacote01;

public class Pessoa {
    String nome;
    Integer idade;
    Integer id;

    public Pessoa(String nome, Integer idade, Integer id) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }


    public String getNomePessoa() {
        return nome;
    }

    public void setNomePessoa(String nome) {
        this.nome = nome;
    }

    public Integer getIdPessoa() {
        return id;
    }

    public void setIdPessoa(Integer id) {
        this.id = id;
    }

    public Integer getIdadePessoa() {
        return idade;
    }

    public void setIdadePessoa(Integer idade) {
        this.idade = idade;
    }

    public void imprimirPessoa(){
        System.out.println("Id: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
}
