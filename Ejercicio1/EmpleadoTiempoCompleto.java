package Ejercicio1;

public class EmpleadoTiempoCompleto extends Empleado {
    private double bonoExtra;

    public EmpleadoTiempoCompleto(String nombre, double salarioBase, double bonoExtra) {
        super(nombre, salarioBase); 
        this.bonoExtra = bonoExtra;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + bonoExtra;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario Final: " + calcularSalarioFinal());
    }
}