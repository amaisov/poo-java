/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.controlnotas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.Vector;

/**
 *
 * @author amairani
 */
public class ControlNotas extends JFrame {

    private JTabbedPane tabbedPane;
    private JTable estudianteTable, materiasTable, gruposTable, notasTable;
    private DefaultTableModel estudianteModel, materiasMobel, gruposModel, notasModel;
    private JTextField estudianteField, materiasField, grupoField;
    private JButton addEstudianteButton, addMateriasButton, addGrupoButton, addNotasButton;
    private JComboBox<String> estudianteCombo, grupoCombo;
    private DefaultTableModel estudiantesModel;
    private JTable estudiantesTable;
    private PopupMenu addMateriaButton;
    private DefaultTableModel materiasModel;
    private PopupMenu addNotaButton;

    public ControlNotas() {
        setTitle("sistema de control notas");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Estudiantes", createEstudiantesPanel());
        tabbedPane.addTab("Materias", createMateriasPanel());
        tabbedPane.addTab(" Grupos ", createGruposPanel());
        tabbedPane.addTab(" Control de Notas", createNotasPanel());

        add(tabbedPane);

    }

    private JPanel createEstudiantesPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(1, 2, 5, 5));
        estudianteField = new JTextField();
        addEstudianteButton = new JButton(" Agregar Estudiante ");
        inputPanel.add(new JLabel(" Nombre "));
        inputPanel.add(estudianteField);
        inputPanel.add(addEstudianteButton);

        String[] columnNames = {" Nombre", "Eliminar "};
        estudiantesModel = new DefaultTableModel(columnNames, 0);
        estudiantesTable = new JTable(estudianteModel);

        addEstudianteButton.addActionListener(e -> {
            agregarElemento(estudianteField, estudiantesModel);
            actualizarComboBox(estudiantesModel, estudianteCombo);
        });

        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(estudiantesTable), BorderLayout.CENTER);
        return panel;

    }

    private JPanel createMateriasPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(1, 3, 5, 5));
        JTextField materiaField = new JTextField();
        inputPanel.add(new JLabel(" Materia: "));
        inputPanel.add(materiaField);
        inputPanel.add(addMateriaButton);

        String[] columnNames = {" Materia ", " Eliminar "};
        materiasModel = new DefaultTableModel(columnNames, 0);
        materiasTable = new JTable(materiasModel);

        addMateriaButton.addActionListener(e -> agregarElemento(materiaField, materiasModel));
        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(materiasTable), BorderLayout.CENTER);
        return panel;

    }

    private JPanel createGruposPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(1, 2, 5, 5));
        grupoField = new JTextField();
        addGrupoButton = new JButton(" Agregar Grupo ");
        inputPanel.add(new JLabel(" Grupo: "));
        inputPanel.add(grupoField);
        inputPanel.add(addGrupoButton);

        String[] columnNames = {" Grupo ", " Eliminar "};
        gruposModel = new DefaultTableModel(columnNames, 0);
        gruposTable = new JTable(gruposModel);

        addGrupoButton.addActionListener(e -> {
            agregarElemento(grupoField, gruposModel);
            actualizarComboBox(gruposModel, grupoCombo);

        });

        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(gruposTable), BorderLayout.CENTER);
        return panel;

    }

    private JPanel createNotasPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(1, 3, 5, 5));
        estudianteCombo = new JComboBox<>();
        grupoCombo = new JComboBox<>();
        JTextField notaField = new JTextField();
        addNotasButton = new JButton(" Agregar Nota ");
        inputPanel.add(new JLabel(" Estudiante:"));
        inputPanel.add(estudianteCombo);
        inputPanel.add(new JLabel(" Grupo "));
        inputPanel.add(grupoCombo);
        inputPanel.add(new JLabel("Notas."));
        inputPanel.add(notaField);
        inputPanel.add(addNotaButton);

        String[] columnNames = {" Eestudiante", " Grupo", " Nota ", " Elimilar"};
        notasModel = new DefaultTableModel(columnNames, 0);
        notasTable = new JTable(notasModel);

        addNotaButton.addActionListener(e -> agregarNota(estudianteCombo, grupoCombo, notaField));
        return panel;

    }

    private void agregarElemento(JTextField field, DefaultTableModel model) {
        String text = field.getText().trim();
        if (!text.isEmpty()) {
            model.addRow(new Object[]{text, " Eliminar "});
            field.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Dede ingresar un valor.", " Error ", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void actualizarComboBox(DefaultTableModel model, JComboBox<String> comboBox) {
        comboBox.removeAllItems();
        for (int i = 0; i < model.getRowCount(); i++) {
            comboBox.addItem((String) model.getValueAt(i, 0));
        }
    }

    private void agregarNota(JComboBox<String> estudianteCombo, JComboBox<String> grupoCombo, JTextField notaField) {
        String estudiante = (String) estudianteCombo.getSelectedItem();
        String grupo = (String) grupoCombo.getSelectedItem();
        String nota = notaField.getText().trim();
        if (estudiante != null && grupo != null && !nota.isEmpty()) {
            notasModel.addRow(new Object[]{estudiante, grupo, nota, " Eliminar "});
            notaField.setText("");

        } else {
            JOptionPane.showMessageDialog(this, " Debe seleccionar estudiante,grupo y asignaturauna un nota");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ControlNotas().setVisible(true));

    }

}
