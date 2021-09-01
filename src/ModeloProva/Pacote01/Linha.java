package ModeloProva.Pacote01;

import java.util.ArrayList;

public class Linha {
    private String nome;
    ArrayList<Parada> linhaDeParadas = new ArrayList<Parada>();

    public Linha(String nome){
        this.nome = nome;
    }

    public Parada getParada(int x){
        return linhaDeParadas.get(x);
    }
}
