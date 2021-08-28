package Atividade10.Pacote02;

public class Funcionario {
    private String nome;
    private double salario;


    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    //GETTERS AND SETTER

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNomeFuncionario(){
        return this.nome;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }

    public double calculaBonificacao() {
        return this.salario * 1.1;
    }

}
