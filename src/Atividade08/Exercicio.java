package Atividade08;

public class Exercicio {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        f1.nomeFuncionario = "Klisman";
        f1.departamento = "TI";
        f1.dataEntradaFuncionario = "01-03-2017";
        f1.RGFuncionario = "0000000000";
        f1.salarioFuncionaio = 1500.00;

        f2.nomeFuncionario = "Renato";
        f2.departamento = "Projetos";
        f2.dataEntradaFuncionario = "01-03-2017";
        f2.RGFuncionario = "0000000000";
        f2.salarioFuncionaio = 1500.00;

        System.out.println("salario atual:" + f1.salarioFuncionaio);
        f1.calculaGanhoAnual();
        f1.mostra();

        if(f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}
