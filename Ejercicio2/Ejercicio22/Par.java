package Ejercicio2.Ejercicio22;

public class Par<A, B> {
    // Atributos para almacenar los dos objetos de tipos A y B
    private A primero;
    private B segundo;

    // Constructor para inicializar ambos atributos
    public Par(A primero, B segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    // Métodos getters y setters
    public A getPrimero() {
        return primero;
    }

    public void setPrimero(A primero) {
        this.primero = primero;
    }

    public B getSegundo() {
        return segundo;
    }

    public void setSegundo(B segundo) {
        this.segundo = segundo;
    }

    // Sobrescribir el método toString() para representar el par en formato "(A, B)"
    @Override
    public String toString() {
        return "(" + primero + ", " + segundo + ")";
    }
}
