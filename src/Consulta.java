package src;

import java.util.Date;

public class Consulta {

    private Paciente paciente;
    private String especialidade;
    private Medico medico;
    private Date data;

    public Consulta (Paciente paciente, String especialidade, Medico medico, Date data) {
        this.paciente = paciente;
        this.especialidade = especialidade;
        this.medico= medico;
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public void exibirDetalhes() {
        System.out.println("Consulta marcada:");
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Médico: " + medico.getNome());
        System.out.println("Data e horário: " + data);
    }


}