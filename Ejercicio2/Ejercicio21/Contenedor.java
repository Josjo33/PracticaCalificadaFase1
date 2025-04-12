package Ejercicio2.Ejercicio21;
import java.util.ArrayList;

public class Contenedor<T> {
    // Colección interna de elementos
    private ArrayList<T> elementos;

    // Constructor para inicializar la colección
    public Contenedor() {
        elementos = new ArrayList<>();
    }

    // Método para agregar un elemento
    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    // Método para obtener un elemento por índice
    public T obtener(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            return elementos.get(indice);
        } else {
            return null; // Si el índice es inválido
        }
    }

    // Método para contar los elementos
    public int contar() {
        return elementos.size();
    }

    // Método para verificar si el contenedor está vacío
    public boolean estaVacio() {
        return elementos.isEmpty();
    }
}
