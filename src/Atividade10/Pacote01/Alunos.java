package Atividade10.Pacote01;

public class Alunos extends Pessoa{
    Integer ano;
    public Alunos(String nome, Integer idade, Integer id, Integer ano) {
        super(nome, idade, id);
        this.ano = ano;
    }

    public void imprimir(){
        System.out.println("Id: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Ano: " + this.ano);
    }
}
