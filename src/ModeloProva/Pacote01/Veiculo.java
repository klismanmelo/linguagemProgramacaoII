package ModeloProva.Pacote01;

import java.util.ArrayList;

public abstract class Veiculo {
    int cod;
    int capacidade;
    ArrayList<Passageiro> listaPassageirosNoOnibus = new ArrayList<Passageiro>();
    Passageiro objPassageiro;
    Linha linhaAtual;
    int indiceParadaAtual;

    public Veiculo(int cod, int capacidade, Linha linhaAtual, int indiceParadaAtual){
        this.cod = cod;
        this.capacidade = capacidade;
        this.linhaAtual = linhaAtual;
        this.indiceParadaAtual = 0;
    }

    public void proximaParada(){
        linhaAtual.getParada(0);
        indiceParadaAtual++;

    }

    public void adicionarAluno(Passageiro a){
        listaPassageirosNoOnibus.add(a);
    }

    public void removerAluno(){

    }

    public void imprimirPassageiro(){
        objPassageiro.toString();
        System.out.println(listaPassageirosNoOnibus);
    }
}
