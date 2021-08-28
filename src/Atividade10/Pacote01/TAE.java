package Atividade10.Pacote01;

public class TAE extends Pessoa{
    String setor;
    public TAE(String nome, Integer idade, Integer id, String setor) {
        super(nome, idade, id);
        this.setor = setor;
    }

    public void imprimir(){
        System.out.println("Id: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Setor: " + this.setor);
    }
}
