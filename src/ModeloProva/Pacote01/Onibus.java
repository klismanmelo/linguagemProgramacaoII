package ModeloProva.Pacote01;

public class Onibus extends Veiculo{
    public Onibus(int cod, int capacidade, Linha linhaAtual, int indiceParadaAtual) {
        super(cod, capacidade, linhaAtual, indiceParadaAtual);
        this.capacidade = 40;
    }
}
