package Prova;

public class Principal {
    public static void main(String[] args){
        Editor editor1 = new Editor("Robotica");
        Docente docente1 = new Docente("Tiago", "Docente");
        Aluno aluno1 = new Aluno("Maria", "Aluno");

        Mensagem msg = new Mensagem("Hello", "Hello Word");

        editor1.cadastrarSeguidor(docente1);
        editor1.cadastrarSeguidor(aluno1);

        editor1.enviarMensagem(msg);
    }
}
