package ModeloProva.Pacote01;

import java.util.ArrayList;

public class Passageiro {
    private String nomePassageiro;
    public Parada origem;
    public Parada destino;

    public Passageiro(String nomePassageiro, Parada origem, Parada destino){
        this.nomePassageiro = nomePassageiro;
        this.origem = origem;
        this.destino = destino;
    }


    private String getClass(String nomePassageiro) {
        return nomePassageiro;
    }

    public String toString(){
        return getClass(nomePassageiro) + getClass(origem.nomeParada) + getClass(destino.nomeParada);
    }

}
