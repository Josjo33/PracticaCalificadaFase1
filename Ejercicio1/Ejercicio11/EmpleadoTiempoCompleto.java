package Ejercicio1.Ejercicio11;

public class EmpleadoTiempoCompleto extends Empleado {
    // Atributo específico de EmpleadoTiempoCompleto
    private double bonoExtra;

    // Constructor para inicializar los atributos
    public EmpleadoTiempoCompleto(String nombre, double salarioBase, double bonoExtra) {
        super(nombre, salarioBase); // Llamada al constructor de la clase base
        this.bonoExtra = bonoExtra;
    }

    // Implementación del método abstracto calcularSalarioFinal
    @Override
    public double calcularSalarioFinal() {
        return salarioBase + bonoExtra;
    }

    // Implementación del método mostrarInformacion
    @Override
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario Final: " + calcularSalarioFinal());
    }
}
