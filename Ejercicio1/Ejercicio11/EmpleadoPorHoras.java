package Ejercicio1.Ejercicio11;

public class EmpleadoPorHoras extends Empleado {
    // Atributos específicos de EmpleadoPorHoras
    private int horasTrabajadas;
    private double pagoPorHora;

    // Constructor para inicializar los atributos
    public EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajadas, double pagoPorHora) {
        super(nombre, salarioBase); // Llamada al constructor de la clase base
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    // Implementación del método abstracto calcularSalarioFinal
    @Override
    public double calcularSalarioFinal() {
        return horasTrabajadas * pagoPorHora;
    }

    // Implementación del método mostrarInformacion
    @Override
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario Final: " + calcularSalarioFinal());
    }
}
