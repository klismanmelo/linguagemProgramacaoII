package Atividade10.Pacote02;

public class Gerentes extends Funcionario{
    private String userName;
    private String password;
    public Gerentes(String nome, double salario, String userName, String password) {
        super(nome, salario);
        this.userName = userName;
        this.password = password;
    }


    //GETTERS AND SETTERS

    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

}
