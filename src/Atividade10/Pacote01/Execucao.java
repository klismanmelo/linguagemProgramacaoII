package Atividade10.Pacote01;

public class Execucao {
    public static void main(String[] args){
        Alunos al1 = new Alunos("Klisman", 22, 100, 302);
        Alunos al2 = new Alunos("Aline", 42, 101, 301);
        Alunos al3 = new Alunos("Renato", 52, 102, 303);

        Docentes d1 = new Docentes("Fernando", 25, 200, 200.00);
        Docentes d2 = new Docentes("Ana Paula", 29, 201, 500.00);
        Docentes d3 = new Docentes("Murilo", 30, 202, 900.00);

        TAE t1 = new TAE("Jussara", 20, 300, "Pedagogico");
        TAE t2 = new TAE("Felipe", 19, 301, "Informática");
        TAE t3 = new TAE("Samuel", 40, 302, "Solda");

        Escola e1 = new Escola("IFRS");

        e1.addPessoaEscola(al1);
        e1.addPessoaEscola(al2);
        e1.addPessoaEscola(al3);

        e1.addPessoaEscola(d1);
        e1.addPessoaEscola(d3);
        e1.addPessoaEscola(d2);

        e1.addPessoaEscola(t1);
        e1.addPessoaEscola(t2);
        e1.addPessoaEscola(t3);

        e1.imprimir();
    }
}
