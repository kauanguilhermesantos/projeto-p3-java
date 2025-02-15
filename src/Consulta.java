package src;


import java.time.LocalDateTime;

public class Consulta {

    private Paciente paciente;
    private String especialidade;
    private Medico medico;
    private LocalDateTime dataHora;

    public Consulta (Paciente paciente, String especialidade, Medico medico, LocalDatatime dataHora) {
        this.paciente = paciente;
        this.especialidade = especialidade;
        this.medico= medico;
        this.dataHora = dataHora;
        
    }

    public Paciente getPaciente() {
        return paciente;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public Medico getMedico() {
        return medico;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;

    }
    public void exibirDetalhes() {

        System.out.println("Consulta marcada:");
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Médico: " + medico.getNome());
        System.out.println("Data e horário: " + dataHora);
    }


}

