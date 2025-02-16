import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaPrincipal().mostrarTela());
    }

    private void mostrarTela() {
        JFrame frame = new JFrame("Tela Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(4, 1));

        JButton botaoCadastrarPaciente = new JButton("Cadastrar Paciente");
        JButton botaoCriarConsulta = new JButton("Criar Consulta");
        JButton botaoVerPacientes = new JButton("Verificar Pacientes");
        JButton botaoVerConsultas = new JButton("Verificar Consultas");

        botaoCadastrarPaciente.addActionListener(e -> new TelaCadastroPaciente());
        botaoCriarConsulta.addActionListener(e -> new TelaCriarConsulta());
        botaoVerPacientes.addActionListener(e -> new TelaVerPacientes());
        botaoVerConsultas.addActionListener(e -> new TelaVerConsultas());

        frame.add(botaoCadastrarPaciente);
        frame.add(botaoCriarConsulta);
        frame.add(botaoVerPacientes);
        frame.add(botaoVerConsultas);

        frame.setVisible(true);
    }
}

class TelaCadastroPaciente {
    public TelaCadastroPaciente() {
        JFrame frame = new JFrame("Cadastro de Paciente");
        frame.setSize(300, 400);
        frame.setLayout(new GridLayout(6, 1));

        JTextField txtNome = new JTextField();
        JTextField txtCpf = new JTextField();
        JTextField txtNascimento = new JTextField();
        JTextField txtTelefone = new JTextField();
        JTextField txtAcompanhante = new JTextField();
        JButton botaoCadastrar = new JButton("Cadastrar");

        frame.add(new JLabel("Nome:"));
        frame.add(txtNome);
        frame.add(new JLabel("CPF:"));
        frame.add(txtCpf);
        frame.add(new JLabel("Data de Nascimento:"));
        frame.add(txtNascimento);
        frame.add(new JLabel("Telefone:"));
        frame.add(txtTelefone);
        frame.add(new JLabel("Nome do Acompanhante:"));
        frame.add(txtAcompanhante);
        frame.add(botaoCadastrar);

        frame.setVisible(true);
    }
}

class TelaCriarConsulta {
    public TelaCriarConsulta() {
        JFrame frame = new JFrame("Criar Consulta");
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(4, 1));

        JTextField txtNomePaciente = new JTextField();
        JTextField txtData = new JTextField();
        String[] especialidades = {"Fisiatria", "Neurologia", "Ortopedia", "Reumatologia", "Pneumologia", "Fisioterapia", "Psicologia", "Psiquiatria"};
        JComboBox<String> selectEspecialidade = new JComboBox<>(especialidades);
        JButton botaoMarcar = new JButton("Marcar Consulta");

        frame.add(new JLabel("Nome do Paciente:"));
        frame.add(txtNomePaciente);
        frame.add(new JLabel("Data:"));
        frame.add(txtData);
        frame.add(new JLabel("Especialidade Médica:"));
        frame.add(selectEspecialidade);
        frame.add(botaoMarcar);

        frame.setVisible(true);
    }
}

class TelaVerPacientes {
    public TelaVerPacientes() {
        JFrame frame = new JFrame("Ver Pacientes");
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(5, 1));

        for (int i = 0; i < 5; i++) {
            JButton botaoPaciente = new JButton("Paciente " + (i + 1));
            botaoPaciente.addActionListener(e -> new DialogPaciente());
            frame.add(botaoPaciente);
        }
        
        frame.setVisible(true);
    }
}

class DialogPaciente {
    public DialogPaciente() {
        JDialog dialog = new JDialog();
        dialog.setTitle("Detalhes do Paciente");
        dialog.setSize(300, 200);
        dialog.setLayout(new GridLayout(6, 1));

        dialog.add(new JLabel("Nome: Fulano"));
        dialog.add(new JLabel("CPF: 123.456.789-12"));
        dialog.add(new JLabel("Data de Nascimento: 12/12/1234"));
        dialog.add(new JLabel("Telefone: 1234-5678"));
        dialog.add(new JLabel("Acompanhante: Ciclano"));
        JButton botaoAtualizar = new JButton("Atualizar");
        dialog.add(botaoAtualizar);

        dialog.setVisible(true);
    }
}

class TelaVerConsultas {
    public TelaVerConsultas() {
        JFrame frame = new JFrame("Ver Consultas");
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(5, 1));

        for (int i = 0; i < 5; i++) {
            JButton botaoConsulta = new JButton("Consulta " + (i + 1));
            botaoConsulta.addActionListener(e -> new DialogConsulta());
            frame.add(botaoConsulta);
        }
        
        frame.setVisible(true);
    }
}

class DialogConsulta {
    public DialogConsulta() {
        JDialog dialog = new JDialog();
        dialog.setTitle("Detalhes da Consulta");
        dialog.setSize(300, 200);
        dialog.setLayout(new GridLayout(6, 1));

        dialog.add(new JLabel("Nome: Fulano"));
        dialog.add(new JLabel("CPF: 123.456.789-12"));
        dialog.add(new JLabel("Data de Nascimento: 12/12/1234"));
        dialog.add(new JLabel("Especialidade: Neurologia"));
        dialog.add(new JLabel("Data da Consulta: 12/12/2025"));
        JButton botaoAtualizar = new JButton("Atualizar");
        dialog.add(botaoAtualizar);

        dialog.setVisible(true);
    }
}
