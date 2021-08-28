package Atividade09.Pacote01;

import java.util.ArrayList;
import java.util.Scanner;

public class Continente {
    String nomeContinente;
    ArrayList<Pais> paisContinente = new ArrayList<Pais>();
    Pais pais;
    Scanner leia = new Scanner(System.in);

    public Continente(String nome) {
        this.nomeContinente = nome;
    }


    public void setPaisContinente(){
        paisContinente.add(pais);
    }

    public void addPais(Pais p){
        this.paisContinente.add(p);
    }

    public float dimensaoContinente(){
        float soma = 0;
        for(Pais p: this.paisContinente){
            soma = (float )(soma + p.getDimensao());
        }
        return soma;
    }

    public float popiulcaoContinente(){
        float soma = 0;
        for(Pais p: this.paisContinente){
            soma = (float )(soma + p.getPop());
        }
        return soma;
    }

    public float densPop(){
        return (float) this.popiulcaoContinente() / this.dimensaoContinente();
    }

    public Pais maiorPop(){
        Pais paisMaiorPop = this.paisContinente.get(0);

        for(int i=0; i<this.paisContinente.size(); i++){
            Pais p = this.paisContinente.get(i);
            if(p.getPop() > paisMaiorPop.getPop()){
                paisMaiorPop = p;
            }
        }
        return paisMaiorPop;
    }

    public Pais maenorPop(){
        Pais paisMenorPop = this.paisContinente.get(0);

        for(int i=0; i<this.paisContinente.size(); i++){
            Pais p = this.paisContinente.get(i);
            if(p.getPop() < paisMenorPop.getPop()){
                paisMenorPop = p;
            }
        }
        return paisMenorPop;
    }

    public Pais maiorDimensao(){
        Pais paisMaiorDim = this.paisContinente.get(0);

        for(int i=0; i<this.paisContinente.size(); i++){
            Pais p = this.paisContinente.get(i);
            if(p.getDimensao() > paisMaiorDim.getDimensao()){
                paisMaiorDim = p;
            }
        }
        return paisMaiorDim;
    }

    public Pais menorDimensao(){
        Pais paisMenorDimensao = this.paisContinente.get(0);

        for(int i=0; i<this.paisContinente.size(); i++){
            Pais p = this.paisContinente.get(i);
            if(p.getDimensao() < paisMenorDimensao.getDimensao()){
                paisMenorDimensao = p;
            }
        }
        return paisMenorDimensao;
    }

    public float razao(){
        Pais paisMaior = this.maiorDimensao();
        Pais paisMenor = this.menorDimensao();

        return (float) (paisMaior.getDimensao() / paisMenor.getDimensao());
    }




}
