package Ejercicio2.Ejercicio22;

public class Empleado {
    private String nombre;
    private double salario;

    // Constructor para inicializar los atributos
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Sobrescribir el método toString() para representar el empleado
    @Override
    public String toString() {
        return "Empleado: " + nombre + ", Salario: " + salario;
    }
}
