import java.util.Date;

public class Medico extends Usuario {
    private String areaEspecializada;
    private String crm;
    
    public Medico(String nome, String cpf, Date dataNascimento, String telefone, String areaEspecializada, String crm){
        super(nome, cpf, dataNascimento, telefone);
        this.areaEspecializada = areaEspecializada;
        this.crm = crm;
    }

    public String getEspecialidade(){
        return areaEspecializada;
    }
    public String getCrm(){
        return crm;
    }

    public void setEspecialidade(){
        this.areaEspecializada = areaEspecializada;
    }

    public void setCrm(){
        this.crm = crm;
    }

    void atender(){
        System.out.println(String.format("O medico %s esta atendendo, aguarde o seu horario" , getNome()));
    }

}
