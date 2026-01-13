
package sistema.hospital.modelo;

import java.util.LinkedList;
import java.util.List;

public class Cola<T> {
    protected LinkedList<T> elementos = new LinkedList<>();
    
    public void encolar(T item) {
        elementos.addLast(item);
    }
    
    public T desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return elementos.removeFirst();
    }
    
    public T verPrimero() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return elementos.getFirst();
    }
    
    public boolean estaVacia() {
        return elementos.isEmpty();
    }
    
    public int tamano() {
        return elementos.size();
    }
    
    public List<T> obtenerTodos() {
        return new LinkedList<>(elementos);
    }
    
    @Override
    public String toString() {
        return elementos.toString();
    }
}