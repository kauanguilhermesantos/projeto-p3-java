package src.ui;

import java.awt.*;

import javax.swing.*;

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