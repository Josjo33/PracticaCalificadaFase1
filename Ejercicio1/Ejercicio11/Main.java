// Clase principal para probar las clases anteriores
package Ejercicio1.Ejercicio11;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de los empleados
        Empleado emp1 = new EmpleadoTiempoCompleto("Carlos", 2500, 500);
        Empleado emp2 = new EmpleadoPorHoras("Ana", 0, 160, 15);

        // Mostrar información de los empleados
        emp1.mostrarInformacion();
        emp2.mostrarInformacion();
    }
}
