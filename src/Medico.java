package src;

import java.util.Date;

public class Medico extends Usuario implements Especialista{
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

    public void setEspecialidade(String areaEspecializada){
        this.areaEspecializada = areaEspecializada;
    }

    public void setCrm(String crm){
        this.crm = crm;
    }

    public void atender(){
        System.out.println(String.format("O medico %s esta atendendo, aguarde o seu horario" , getNome()));
    }

}
