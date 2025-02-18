package src.ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import src.models.Consulta;
import src.models.Paciente;
import src.models.Usuario;

public class TelaPrincipal extends JFrame {
    private List<Usuario> pacientes = new ArrayList<>();
    private List<Consulta> consultas = new ArrayList<>();

    public TelaPrincipal() {
        setTitle("Sistema de Pacientes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JButton btnAdicionarPaciente = new JButton("Adicionar Paciente");
        JButton btnListarPacientes = new JButton("Listar Pacientes");
        JButton btnCriarConsulta = new JButton("Criar Consulta");
        JButton btnVerConsultas = new JButton("Ver Consultas");

        panel.add(btnAdicionarPaciente);
        panel.add(btnListarPacientes);
        panel.add(btnCriarConsulta);
        panel.add(btnVerConsultas);

        btnAdicionarPaciente.addActionListener(e -> adicionarPaciente());
        btnListarPacientes.addActionListener(e -> listarPacientes());
        btnCriarConsulta.addActionListener(e -> criarConsulta());
        btnVerConsultas.addActionListener(e -> verConsultas());

        add(panel);
    }

    private void adicionarPaciente() {
        JDialog dialog = new JDialog(this, "Adicionar Paciente", true);
        dialog.setLayout(new GridLayout(5, 2));
        dialog.setSize(300, 200);
        setLocationRelativeTo(null);

        JTextField txtNome = new JTextField();
        JTextField txtCpf = new JTextField();
        JTextField txtIdade = new JTextField();
        JTextField txtAcompanhante = new JTextField();

        dialog.add(new JLabel("Nome:"));
        dialog.add(txtNome);
        dialog.add(new JLabel("CPF:"));
        dialog.add(txtCpf);
        dialog.add(new JLabel("Idade:"));
        dialog.add(txtIdade);
        dialog.add(new JLabel("Acompanhante:"));
        dialog.add(txtAcompanhante);

        JButton btnSalvar = new JButton("Salvar");

        btnSalvar.addActionListener(e -> {
            String nome = txtNome.getText();
            String cpf = txtCpf.getText();
            int idade = Integer.parseInt(txtIdade.getText());
            String acompanhante = txtAcompanhante.getText();

            Paciente paciente = new Paciente(nome, cpf, idade, acompanhante);
            pacientes.add(paciente);
            JOptionPane.showMessageDialog(dialog, "Paciente adicionado com sucesso!");
            dialog.dispose();
        });

        dialog.add(btnSalvar);
        dialog.setVisible(true);
    }

    private void listarPacientes() {
        JDialog dialog = new JDialog(this, "Listar Pacientes", true);
        dialog.setLayout(new BorderLayout());
        dialog.setSize(400, 300);
        setLocationRelativeTo(null);

        DefaultListModel<String> modelo = new DefaultListModel<>();
        for (Usuario paciente : pacientes) {
            modelo.addElement(paciente.toString());
        }

        JList<String> list = new JList<>(modelo);
        JScrollPane scrollPane = new JScrollPane(list);
        dialog.add(scrollPane, BorderLayout.CENTER);

        JPanel panelBotoes = new JPanel();
        JButton btnRemover = new JButton("Remover Paciente");
        JButton btnAlterar = new JButton("Alterar Paciente");

        btnRemover.addActionListener(e -> {
            int selecao = list.getSelectedIndex();
            if (selecao != -1) {
                pacientes.remove(selecao);
                modelo.remove(selecao);
            }
        });

        btnAlterar.addActionListener(e -> {
            int selecao = list.getSelectedIndex();
            if (selecao != -1) {
                alterarPaciente(selecao, modelo);
            }
        });

        panelBotoes.add(btnRemover);
        panelBotoes.add(btnAlterar);
        dialog.add(panelBotoes, BorderLayout.SOUTH);
        dialog.setVisible(true);
    }

    private void alterarPaciente(int index, DefaultListModel<String> modelo) {
        Paciente paciente = (Paciente) pacientes.get(index);

        JDialog dialog = new JDialog(this, "Alterar Paciente", true);
        dialog.setLayout(new GridLayout(5, 2));
        dialog.setSize(300, 200);

        JTextField txtNome = new JTextField(paciente.getNome());
        JTextField txtCpf = new JTextField(paciente.getCpf());
        JTextField txtIdade = new JTextField(String.valueOf(paciente.getIdade()));
        JTextField txtAcompanhante = new JTextField(paciente.getAcompanhante());

        dialog.add(new JLabel("Nome:"));
        dialog.add(txtNome);
        dialog.add(new JLabel("CPF:"));
        dialog.add(txtCpf);
        dialog.add(new JLabel("Idade:"));
        dialog.add(txtIdade);
        dialog.add(new JLabel("Acompanhante:"));
        dialog.add(txtAcompanhante);

        JButton btnSalvar = new JButton("Salvar");

        btnSalvar.addActionListener(e -> {
            paciente.setNome(txtNome.getText());
            paciente.setCpf(txtCpf.getText());
            paciente.setIdade(Integer.parseInt(txtIdade.getText()));
            paciente.setAcompanhante(txtAcompanhante.getText());

            modelo.set(index, paciente.toString());
            JOptionPane.showMessageDialog(dialog, "Paciente alterado com sucesso!");
            dialog.dispose();
        });

        dialog.add(btnSalvar);
        dialog.setVisible(true);
    }

    private void criarConsulta() {
        if (pacientes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não há pacientes cadastrados!");
            return;
        }

        JDialog dialog = new JDialog(this, "Criar Consulta", true);
        dialog.setLayout(new GridLayout(3, 2));
        dialog.setSize(300, 150);

        JComboBox<String> selectPacientes = new JComboBox<>();
        for (Usuario paciente : pacientes) {
            selectPacientes.addItem(paciente.getNome());
        }

        JComboBox<String> comboEspecialidades = new JComboBox<>(new String[] {
                "Fisiatria", "Neurologia", "Ortopedia", "Reumatologia", "Pneumologia", "Fisioterapia", "Psicologia",
                "Psiquiatria"
        });

        dialog.add(new JLabel("Paciente:"));
        dialog.add(selectPacientes);
        dialog.add(new JLabel("Especialidade:"));
        dialog.add(comboEspecialidades);

        JButton btnSalvar = new JButton("Salvar");

        btnSalvar.addActionListener(e -> {
            int selecao = selectPacientes.getSelectedIndex();
            Paciente paciente = (Paciente) pacientes.get(selecao);
            String especialidade = (String) comboEspecialidades.getSelectedItem();

            Consulta consulta = new Consulta(paciente, especialidade);
            consultas.add(consulta);
            JOptionPane.showMessageDialog(dialog, "Consulta criada com sucesso!");
            dialog.dispose();
        });

        dialog.add(btnSalvar);
        dialog.setVisible(true);
    }

    private void verConsultas() {
        if (consultas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não há consultas marcadas!");
            return;
        }

        JDialog dialog = new JDialog(this, "Consultas Marcadas", true);
        dialog.setLayout(new BorderLayout());
        dialog.setSize(400, 300);

        DefaultListModel<String> modelo = new DefaultListModel<>();
        for (Consulta consulta : consultas) {
            modelo.addElement(consulta.toString());
        }

        JList<String> lista = new JList<>(modelo);
        JScrollPane scrollPane = new JScrollPane(lista);
        dialog.add(scrollPane, BorderLayout.CENTER);

        JPanel panelBotoes = new JPanel();
        JButton btnRemover = new JButton("Remover Consulta");
        JButton btnAlterar = new JButton("Alterar Consulta");

        btnRemover.addActionListener(e -> {
            int selecao = lista.getSelectedIndex();
            if (selecao != -1) {
                consultas.remove(selecao);
                modelo.remove(selecao);
            }
        });

        btnAlterar.addActionListener(e -> {
            int selecao = lista.getSelectedIndex();
            if (selecao != -1) {
                alterarConsulta(selecao, modelo);
            }
        });

        panelBotoes.add(btnRemover);
        panelBotoes.add(btnAlterar);
        dialog.add(panelBotoes, BorderLayout.SOUTH);
        dialog.setVisible(true);
    }

    private void alterarConsulta(int index, DefaultListModel<String> listModel) {
        Consulta consulta = consultas.get(index);

        JDialog dialog = new JDialog(this, "Alterar Consulta", true);
        dialog.setLayout(new GridLayout(3, 2));
        dialog.setSize(300, 150);

        JComboBox<String> selectPacientes = new JComboBox<>();
        for (Usuario paciente : pacientes) {
            selectPacientes.addItem(paciente.getNome());
        }
        selectPacientes.setSelectedItem(consulta.getPaciente().getNome());

        JComboBox<String> selectEspecialidades = new JComboBox<>(new String[] {
                "Fisiatria", "Neurologia", "Ortopedia", "Reumatologia", "Pneumologia", "Fisioterapia", "Psicologia",
                "Psiquiatria"
        });
        selectEspecialidades.setSelectedItem(consulta.getEspecialidade());

        dialog.add(new JLabel("Paciente:"));
        dialog.add(selectPacientes);
        dialog.add(new JLabel("Especialidade:"));
        dialog.add(selectEspecialidades);

        JButton btnSalvar = new JButton("Salvar");

        btnSalvar.addActionListener(e -> {
            int selectedIndex = selectPacientes.getSelectedIndex();
            Paciente paciente = (Paciente) pacientes.get(selectedIndex);
            String especialidade = (String) selectEspecialidades.getSelectedItem();

            consulta.setPaciente(paciente);
            consulta.setEspecialidade(especialidade);
            listModel.set(index, consulta.toString());
            JOptionPane.showMessageDialog(dialog, "Consulta alterada com sucesso!");
            dialog.dispose();
        });

        dialog.add(btnSalvar);
        dialog.setVisible(true);
    }
}
