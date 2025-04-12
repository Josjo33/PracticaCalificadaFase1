package Ejercicio3.Ejercicio32;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de MaxSubarraySum
        MaxSubarraySum maxSubarraySum = new MaxSubarraySum();
        
        // Ejemplo 1: Arreglo [−2, 1, −3, 4, −1, 2, 1, −5, 4]
        int[] numeros1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Suma máxima del subarreglo: " + maxSubarraySum.maxSubarraySum(numeros1)); // Debe retornar 6
    }
}
