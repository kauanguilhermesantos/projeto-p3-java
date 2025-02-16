import java.util.Date;

public class Usuario {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String telefone;


    public Usuario(String nome, String cpf, Date dataNascimento, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public Date getNascimento(){
        return dataNascimento;
    }
    public String getTel(){
        return telefone;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
