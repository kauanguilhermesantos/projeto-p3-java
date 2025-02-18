package src.models;

public class Consulta {
    private Paciente paciente;
    private String especialidade;

    public Consulta(Paciente paciente, String especialidade) {
        this.paciente = paciente;
        this.especialidade = especialidade;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Paciente: " + paciente.getNome() + ", Especialidade: " + especialidade;
    }
}