package sistema.hospital.modelo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ColaPrioridad<T> extends Cola<T> {
    private final PriorityQueue<T> colaPrioridad;
    private final Comparator<T> comparador;
    
    public ColaPrioridad(Comparator<T> comparador) {
        if (comparador == null) {
            throw new IllegalArgumentException("El comparador no puede ser nulo");
        }
        this.comparador = comparador;
        this.colaPrioridad = new PriorityQueue<>(comparador);
    }
    
    @Override
    public void encolar(T item) {
        if (item == null) {
            throw new IllegalArgumentException("No se puede encolar un elemento nulo");
        }
        colaPrioridad.add(item);
    }
    
    @Override
    public T desencolar() {
        return colaPrioridad.poll();
    }
    
    @Override
    public boolean estaVacia() {
        return colaPrioridad.isEmpty();
    }
    
    @Override
    public int tamano() {
        return colaPrioridad.size();
    }
    
    // Método específico para pacientes
    public static ColaPrioridad<Paciente> crearColaPacientes() {
        return new ColaPrioridad<>((p1, p2) -> {
            int comparacionPrioridad = Integer.compare(p1.getPrioridad().getValor(), p2.getPrioridad().getValor());
            if (comparacionPrioridad != 0) {
                return comparacionPrioridad;
            }
            return p1.getHoraEntrada().compareTo(p2.getHoraEntrada());
        });
    }
    
    // Método adicional para ver el siguiente elemento sin desencolar
    public T siguiente() {
        return colaPrioridad.peek();
    }
}