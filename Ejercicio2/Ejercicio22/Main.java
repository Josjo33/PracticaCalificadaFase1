package Ejercicio2.Ejercicio22;

public class Main {
    public static void main(String[] args) {
        // Crear objetos Par con diferentes combinaciones de tipos

        // Par<String, Integer>
        Par<String, Integer> par1 = new Par<>("Edad", 30);
        System.out.println("Par1: " + par1);

        // Par<Empleado, String>
        Empleado empleado = new Empleado("Carlos", 2500);
        Par<Empleado, String> par2 = new Par<>(empleado, "Activo");
        System.out.println("Par2: " + par2);

        // Par<Double, Boolean>
        Par<Double, Boolean> par3 = new Par<>(12.5, true);
        System.out.println("Par3: " + par3);
    }
}
