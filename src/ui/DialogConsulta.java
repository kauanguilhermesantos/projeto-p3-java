package src.ui;

import java.awt.*;

import javax.swing.*;

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

