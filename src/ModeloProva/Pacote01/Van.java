package ModeloProva.Pacote01;

public class Van extends Veiculo{
    public Van(int cod, int capacidade, Linha linhaAtual, int indiceParadaAtual) {
        super(cod, capacidade, linhaAtual, indiceParadaAtual);
        this.capacidade = 15;
    }
}
