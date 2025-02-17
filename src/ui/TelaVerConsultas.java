package src.ui;

import java.awt.*;

import javax.swing.*;

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
