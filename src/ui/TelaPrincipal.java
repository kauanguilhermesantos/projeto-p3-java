package src.ui;
import javax.swing.*;
import java.awt.*;

public class TelaPrincipal {
    public void mostrarTela() {
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
