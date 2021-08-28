package Atividade10.Pacote01;

import java.util.ArrayList;

public class Escola {
    String nomeEscola;
    ArrayList<Pessoa> pessoaEscola = new ArrayList<Pessoa>();
    Pessoa objPessoa;

    public void addPessoaEscola( Pessoa p) {
        this.pessoaEscola.add(p);
    }

    public Escola(String nomeEscola){
        this.nomeEscola = nomeEscola;
    }

    public void imprimir(){
        for(int i=0; i< pessoaEscola.size(); i++) {
            System.out.println("Nome: " + this.pessoaEscola.get(i).nome);
            if (this.pessoaEscola.get(i) instanceof Alunos) {
                System.out.println("Aluno");
            }
            if (this.pessoaEscola.get(i) instanceof Docentes) {
                System.out.println("Docentes");
            }
            if (this.pessoaEscola.get(i) instanceof TAE) {
                System.out.println("TAE");
            }
        }
    }

}
