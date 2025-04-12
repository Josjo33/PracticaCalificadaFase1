+public abstract class Empleado {
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
