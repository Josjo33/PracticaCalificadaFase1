package Ejercicio1.Ejercicio12;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de vehículos
        Vehiculo auto1 = new Automovil("Toyota", "Corolla", 2020, 15000, true);
        Vehiculo moto1 = new Motocicleta("Honda", "CBR500", 2021, 600);

        // Mostrar información y comparar los costos de mantenimiento
        System.out.println("Costo de mantenimiento del Automovil: " + auto1.calcularCostoMantenimiento());
        System.out.println("Costo de mantenimiento de la Motocicleta: " + moto1.calcularCostoMantenimiento());

        // Comparar los costos
        compararCostosMantenimiento(auto1, moto1);
    }

    // Método para comparar los costos de mantenimiento de dos vehículos
    public static void compararCostosMantenimiento(Vehiculo v1, Vehiculo v2) {
        double costo1 = v1.calcularCostoMantenimiento();
        double costo2 = v2.calcularCostoMantenimiento();

        if (costo1 > costo2) {
            System.out.println("El " + v1.getClass().getSimpleName() + " tiene un costo de mantenimiento mayor.");
        } else if (costo1 < costo2) {
            System.out.println("El " + v2.getClass().getSimpleName() + " tiene un costo de mantenimiento mayor.");
        } else {
            System.out.println("Ambos vehículos tienen el mismo costo de mantenimiento.");
        }
    }
}
