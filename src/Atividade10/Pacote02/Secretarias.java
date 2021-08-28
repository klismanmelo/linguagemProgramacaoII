package Atividade10.Pacote02;

public class Secretarias extends Funcionario{
    Integer numRamal;
    public Secretarias(String nome, double salario, Integer numRamal) {
        super(nome, salario);
        this.numRamal = numRamal;
    }

    //GETTERS AND SETTERS

    public void setNumRamal(Integer numRamal){
        this.numRamal = numRamal;
    }
    public Integer getNumRamal(){
        return numRamal;
    }
}
