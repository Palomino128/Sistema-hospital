package sistema.hospital.modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Paciente {
    private String id;
    private String nombre;
    private int edad;
    private String sintomas;
    private LocalDateTime horaEntrada;
    private Prioridad prioridad;
    
    public enum Prioridad {
        EMERGENCIA(1), URGENTE(2), NORMAL(3), LEVE(4);
        
        private final int valor;
        
        Prioridad(int valor) {
            this.valor = valor;
        }
        
        public int getValor() {
            return valor;
        }
    }
    
    public Paciente(String id, String nombre, int edad, String sintomas, Prioridad prioridad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.sintomas = sintomas;
        this.prioridad = prioridad;
        this.horaEntrada = LocalDateTime.now();
    }
    
    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getSintomas() { return sintomas; }
    public LocalDateTime getHoraEntrada() { return horaEntrada; }
    public Prioridad getPrioridad() { return prioridad; }
    
    @Override
    public String toString() {
        return String.format("%s - %s (%d años) [%s] - Prioridad: %s - Hora: %s",
                id, nombre, edad, sintomas, prioridad, 
                horaEntrada.format(DateTimeFormatter.ofPattern("HH:mm")));
    }
}