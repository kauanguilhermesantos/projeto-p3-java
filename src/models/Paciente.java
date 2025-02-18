package src.models;

public class Paciente extends Usuario {
    private String acompanhante;

    public Paciente(String nome, String cpf, int idade, String acompanhante) {
        super(nome, cpf, idade);
        this.acompanhante = acompanhante;
    }

    public String getAcompanhante() {
        return acompanhante;
    }

    public void setAcompanhante(String acompanhante) {
        this.acompanhante = acompanhante;
    }

    @Override
    public String toString() {
        return super.toString() + ", Acompanhante: " + acompanhante;
    }
}
