// Clase abstracta Empleado (publica)
package Ejercicio1;

public abstract class Empleado {
    // Atributos comunes para todas las clases de empleados
    protected String nombre;
    protected double salarioBase;

    // Constructor para inicializar el nombre y salarioBase
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método abstracto que debe ser implementado en las subclases
    public abstract double calcularSalarioFinal();

    // Método para mostrar la información del empleado
    public abstract void mostrarInformacion();
}
