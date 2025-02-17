package src.ui;

import java.awt.*;

import javax.swing.*;

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