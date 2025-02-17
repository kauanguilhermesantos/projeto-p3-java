package src.ui;

import java.awt.*;

import javax.swing.*;

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