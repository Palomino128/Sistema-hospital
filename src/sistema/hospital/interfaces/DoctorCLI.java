
package sistema.hospital.interfaces;


import sistema.hospital.modelo.Paciente;
import sistema.hospital.servicios.ServicioColas;
import java.util.Scanner;

public class DoctorCLI {
    private final ServicioColas servicio;
    private final Scanner scanner;
    
    public DoctorCLI(ServicioColas servicio) {
        this.servicio = servicio;
        this.scanner = new Scanner(System.in);
    }
    
    public void iniciar() {
        System.out.println("Sistema de Atención Médica - Modo Doctor");
        
        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Atender siguiente paciente");
            System.out.println("2. Prescribir medicación");
            System.out.println("3. Ver lista de espera");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un número válido");
                continue;
            }
            
            switch (opcion) {
                case 1:
                    atenderPaciente();
                    break;
                case 2:
                    prescribirMedicacion();
                    break;
                case 3:
                    mostrarListaEspera();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
    
    private void atenderPaciente() {
        try {
            Paciente paciente = servicio.llamarSiguientePaciente();
            System.out.println("\nAtendiendo a: " + paciente);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private void prescribirMedicacion() {
        System.out.print("Ingrese ID del paciente: ");
        String id = scanner.nextLine();
        System.out.print("Ingrese medicación: ");
        String medicacion = scanner.nextLine();
        
        // Lógica simplificada
        System.out.println("Medicación prescrita para paciente " + id);
    }
    
    private void mostrarListaEspera() {
        System.out.println("\nPacientes en espera:");
        servicio.obtenerPacientesEnEspera().forEach(System.out::println);
    }
}
