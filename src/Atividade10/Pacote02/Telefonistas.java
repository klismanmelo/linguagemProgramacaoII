package Atividade10.Pacote02;

public class Telefonistas extends Funcionario{
    Integer cod;
    public Telefonistas(String nome, double salario, Integer cod) {
        super(nome, salario);
        this.cod = cod;
    }

    //GETTERS AND SETTERS

    public void setCod(Integer cod){
        this.cod = cod;
    }
    public Integer getCod(){
        return cod;
    }
}
