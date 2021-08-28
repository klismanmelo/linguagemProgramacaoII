package Atividade10.Pacote02;

public class TestaFuncionarios {
    public static void main(String[] args){
        Gerentes g1 = new Gerentes("Klisman", 1000.00, "klismanmelo", "klis05melo");
        Gerentes g2 = new Gerentes("Aline", 1001.00, "alinemelo", "aline08melo");
        Gerentes g3 = new Gerentes("Rentato", 2000.00, "renatomelo", "renato1234");

        Secretarias s1 = new Secretarias("Amanda", 2000.00, 302);
        Secretarias s2 = new Secretarias("Andressa", 2001.00, 303);
        Secretarias s3 = new Secretarias("Andreia", 2004.00, 301);

        Telefonistas t1 = new Telefonistas("Loreane", 3000.11, 888);
        Telefonistas t2 = new Telefonistas("Lorezete", 3003.11, 777);
        Telefonistas t3 = new Telefonistas("Lucinda", 3002.11, 666);

        System.out.println("GERENTE");
            System.out.println("Nome: " + g1.getNomeFuncionario());
            System.out.println("Salario: " + g1.getSalario());
            System.out.println("Usuário: " + g1.getUserName());
            System.out.println("Password: " + g1.getPassword());
            System.out.println("Bonificacao: " + g1.calculaBonificacao());

            System.out.println("Nome: " + g2.getNomeFuncionario());
            System.out.println("Salario: " + g2.getSalario());
            System.out.println("Usuário: " + g2.getUserName());
            System.out.println("Password: " + g2.getPassword());
            System.out.println("Bonificacao: " + g2.calculaBonificacao());

            System.out.println("Nome: " + g3.getNomeFuncionario());
            System.out.println("Salario: " + g3.getSalario());
            System.out.println("Usuário: " + g3.getUserName());
            System.out.println("Password: " + g3.getPassword());
            System.out.println("Bonificacao: " + g3.calculaBonificacao());


        System.out.println("TELEFONISTA");
            System.out.println("Nome: " + t1.getNomeFuncionario());
            System.out.println("Salario: " + t1.getSalario());
            System.out.println("Usuário: " + t1.getCod());
            System.out.println("Bonificacao: " + t1.calculaBonificacao());

            System.out.println("Nome: " + t2.getNomeFuncionario());
            System.out.println("Salario: " + t2.getSalario());
            System.out.println("Usuário: " + t2.getCod());
            System.out.println("Bonificacao: " + t2.calculaBonificacao());

            System.out.println("Nome: " + t3.getNomeFuncionario());
            System.out.println("Salario: " + t3.getSalario());
            System.out.println("Usuário: " + t3.getCod());
            System.out.println("Bonificacao: " + t3.calculaBonificacao());

        System.out.println("SECRETARIAS");
            System.out.println("Nome: " + s1.getNomeFuncionario());
            System.out.println("Salario: " + s1.getSalario());
            System.out.println("Usuário: " + s1.getNumRamal());
            System.out.println("Bonificacao: " + s1.calculaBonificacao());

            System.out.println("Nome: " + s2.getNomeFuncionario());
            System.out.println("Salario: " + s2.getSalario());
            System.out.println("Usuário: " + s2.getNumRamal());
            System.out.println("Bonificacao: " + s2.calculaBonificacao());

            System.out.println("Nome: " + s3.getNomeFuncionario());
            System.out.println("Salario: " + s3.getSalario());
            System.out.println("Usuário: " + s3.getNumRamal());
            System.out.println("Bonificacao: " + s3.calculaBonificacao());
    }
}
