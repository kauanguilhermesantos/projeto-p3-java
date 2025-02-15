package src;

import java.util.Date;

public class Paciente extends Usuario {
    private String nomeAcompanhante;

    public Paciente (String nome, String cpf, Date dataNascimento, String telefone, String nomeAcompanhante) {
        super (nome, cpf, dataNascimento, telefone);
        this.nomeAcompanhante = nomeAcompanhante;
    }
    public String getNomeAcompanhante() {
        return nomeAcompanhante;
    }
    public void setNomeAcompanhante(String nomeAcompanhante){
        this.nomeAcompanhante = nomeAcompanhante;
    }
}
