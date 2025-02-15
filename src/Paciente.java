package src;
public class Paciente extends Usuario {
    private String nomeAcompanhante;

    public Paciente (String nome, String cpf, String dataNascimento, String telefone, String nomeAcompanhante) {
        super (nome, cpf, dataNascimento, telefone);
        this.nomeAcompanhante = nomeAcompanhante;
    }
    public String getNomeAcompanhante() {
        return nomeAcompanhante;

    }
}
