package src;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Recepcionista {

    // Listas para armazenar pacientes, médicos e consultas
    private static List<Paciente> pacientes = new ArrayList<>();
    private static List<Medico> medicos = new ArrayList<>();
    private static List<Consulta> consultas = new ArrayList<>();

    // Método para cadastrar um paciente
    public static void cadastrarPaciente(String nome, String cpf, Date dataNascimento, String telefone, String nomeAcompanhante) {
        if (buscarPacientePorCpf(cpf) != null) {
            System.out.println("Erro: Já existe um paciente cadastrado com este CPF.");
            return;
        }
        Paciente paciente = new Paciente(nome, cpf, dataNascimento, telefone, nomeAcompanhante);
        pacientes.add(paciente);
    }

    // Método para atualizar um paciente
    public static void atualizarPaciente(String cpf, String novoNome, String novoTelefone, String novoNomeAcompanhante) {
        Paciente paciente = buscarPacientePorCpf(cpf);
        if (paciente != null) {
            paciente.setNome(novoNome);
            paciente.setTelefone(novoTelefone);
            paciente.setNomeAcompanhante(novoNomeAcompanhante);
        } else {
            System.out.println("Erro: Paciente não encontrado para atualização.");
        }
    }

    // Método para excluir um paciente
    public static void excluirPaciente(String cpf) {
        Paciente paciente = buscarPacientePorCpf(cpf);
        if (paciente != null) {
            pacientes.remove(paciente);
        } else {
            System.out.println("Erro: Paciente não encontrado para exclusão.");
        }
    }

    // Método para marcar uma consulta
    public static void marcarConsulta(String cpfPaciente, String especialidade, Date data) {
        Paciente paciente = buscarPacientePorCpf(cpfPaciente);
        if (paciente == null) {
            System.out.println("Erro: Paciente não encontrado. Verifique o CPF digitado.");
            return;
        }
        Medico medico = buscarMedicoPorEspecialidade(especialidade);
        if (medico == null) {
            System.out.println("Erro: Não há médicos disponíveis para essa especialidade.");
            return;
        }
        Consulta consulta = new Consulta(paciente, especialidade, medico, data);
        consultas.add(consulta);
    }

    // Método para listar todos os pacientes
    public static List<Paciente> listarPacientes() {
        return pacientes;
    }

    // Método para listar todos os médicos
    public static List<Medico> listarMedicos() {
        return medicos;
    }

    // Método para listar todas as consultas
    public static List<Consulta> listarConsultas() {
        return consultas;
    }

    // Método auxiliar para buscar paciente por CPF
    private static Paciente buscarPacientePorCpf(String cpf) {
        for (Paciente paciente : pacientes) {
            if (paciente.getCpf().equals(cpf)) {
                return paciente;
            }
        }
        return null;
    }

    // Método auxiliar para buscar médico por especialidade
    private static Medico buscarMedicoPorEspecialidade(String especialidade) {
        for (Medico medico : medicos) {
            if (medico.getEspecialidade().equals(especialidade)) {
                return medico;
            }
        }
        return null;
    }

    // Método para adicionar médicos (simulação)
    public static void adicionarMedico(String nome, String cpf, Date dataNascimento, String telefone, String areaEspecializada, String crm) {
        if (buscarMedicoPorCpf(cpf) != null) {
            System.out.println("Erro: Já existe um médico cadastrado com este CPF.");
            return;
        }
        Medico medico = new Medico(nome, cpf, dataNascimento, telefone, areaEspecializada, crm);
        medicos.add(medico);
    }

    // Método auxiliar para buscar médico por CPF
    private static Medico buscarMedicoPorCpf(String cpf) {
        for (Medico medico : medicos) {
            if (medico.getCpf().equals(cpf)) {
                return medico;
            }
        }
        return null;
    }
}
