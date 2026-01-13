package sistema.hospital.interfaces;

import sistema.hospital.modelo.*;
import sistema.hospital.servicios.ServicioColas;
import javax.swing.*;
import java.awt.*;

public class RecepcionGUI extends JFrame {
    private final ServicioColas servicio;
    private JTextArea areaPacientes;
    
    public RecepcionGUI(ServicioColas servicio) {
        this.servicio = servicio;
        configurarInterfaz();
    }
    
    private void configurarInterfaz() {
        setTitle("Sistema de Admisión Hospitalaria");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        
        // Panel de entrada de datos
        JPanel panelEntrada = new JPanel(new GridLayout(5, 2));
        JTextField campoId = new JTextField();
        JTextField campoNombre = new JTextField();
        JSpinner spinnerEdad = new JSpinner(new SpinnerNumberModel(30, 1, 120, 1));
        JTextField campoSintomas = new JTextField();
        JComboBox<Paciente.Prioridad> comboPrioridad = new JComboBox<>(Paciente.Prioridad.values());
        
        panelEntrada.add(new JLabel("ID:"));
        panelEntrada.add(campoId);
        panelEntrada.add(new JLabel("Nombre:"));
        panelEntrada.add(campoNombre);
        panelEntrada.add(new JLabel("Edad:"));
        panelEntrada.add(spinnerEdad);
        panelEntrada.add(new JLabel("Síntomas:"));
        panelEntrada.add(campoSintomas);
        panelEntrada.add(new JLabel("Prioridad:"));
        panelEntrada.add(comboPrioridad);
        
        // Panel de botones
        JPanel panelBotones = new JPanel();
        JButton botonAdmitir = new JButton("Admitir Paciente");
        JButton botonActualizar = new JButton("Actualizar Lista");
        
        botonAdmitir.addActionListener(e -> {
            Paciente paciente = new Paciente(
                campoId.getText(),
                campoNombre.getText(),
                (Integer)spinnerEdad.getValue(),
                campoSintomas.getText(),
                (Paciente.Prioridad)comboPrioridad.getSelectedItem()
            );
            servicio.admitirPaciente(paciente);
            actualizarListaPacientes();
        });
        
        botonActualizar.addActionListener(e -> actualizarListaPacientes());
        
        panelBotones.add(botonAdmitir);
        panelBotones.add(botonActualizar);
        
        // Área de visualización
        areaPacientes = new JTextArea();
        areaPacientes.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaPacientes);
        
        // Ensamblar interfaz
        panelPrincipal.add(panelEntrada, BorderLayout.NORTH);
        panelPrincipal.add(scroll, BorderLayout.CENTER);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);
        
        add(panelPrincipal);
        actualizarListaPacientes();
    }
    
    private void actualizarListaPacientes() {
        StringBuilder sb = new StringBuilder("Pacientes en espera:\n");
        servicio.obtenerPacientesEnEspera().forEach(p -> sb.append(p).append("\n"));
        areaPacientes.setText(sb.toString());
    }
}
