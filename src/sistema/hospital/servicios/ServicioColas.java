package sistema.hospital.servicios;

import sistema.hospital.modelo.*;
import java.util.List;

public class ServicioColas {
    private final ColaPrioridad<Paciente> colaPacientes;
    private final Cola<Paciente> colaMedicacion;
    private final Cola<Paciente> colaAlta;
    
    public ServicioColas() {
        this.colaPacientes = ColaPrioridad.crearColaPacientes();
        this.colaMedicacion = new Cola<>();
        this.colaAlta = new Cola<>();
    }
    
    public void admitirPaciente(Paciente paciente) {
        colaPacientes.encolar(paciente);
        System.out.println("Paciente admitido: " + paciente.getNombre());
    }
    
    public Paciente llamarSiguientePaciente() {
        Paciente siguiente = colaPacientes.desencolar();
        colaMedicacion.encolar(siguiente);
        return siguiente;
    }
    
    public void prescribirMedicacion(Paciente paciente, String medicacion) {
        // Lógica para prescribir medicación
        colaAlta.encolar(paciente);
    }
    
    public Paciente darAltaPaciente() {
        return colaAlta.desencolar();
    }
    
    public List<Paciente> obtenerPacientesEnEspera() {
        return colaPacientes.obtenerTodos();
    }
}