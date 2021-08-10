package Atividade08;

public class Funcionario {
        String nomeFuncionario;
        String departamento;
        Double salarioFuncionaio;
        String dataEntradaFuncionario;
        String RGFuncionario;

        public void recebeAumento(double valor){
            salarioFuncionaio = salarioFuncionaio + valor;
        }

        public void calculaGanhoAnual(){
            double ganhoAnual;
            ganhoAnual = salarioFuncionaio*12;
            System.out.println(ganhoAnual);
        }

        public void mostra(){
            System.out.println("Nome: " +this.nomeFuncionario);
            System.out.println("Nome: " +this.departamento);
            System.out.println("Nome: " +this.salarioFuncionaio);
            System.out.println("Nome: " +this.dataEntradaFuncionario);
            System.out.println("Nome: " +this.RGFuncionario);
        }
}
