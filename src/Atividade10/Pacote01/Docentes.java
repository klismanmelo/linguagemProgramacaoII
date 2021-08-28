package Atividade10.Pacote01;

public class Docentes extends Pessoa{
    Double salario;
    public Docentes(String nome, Integer idade, Integer id, Double salario) {
        super(nome, idade, id);
        this.salario = salario;
    }

    public void imprimir(){
        System.out.println("Id: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salario: " + this.salario);
    }
}
