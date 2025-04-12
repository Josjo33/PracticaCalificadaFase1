package Ejercicio1.Ejercicio1_1;

public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajadas, double pagoPorHora) {
        super(nombre, salarioBase); 
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
