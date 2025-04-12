package Ejercicio4.Ejercicio41;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        
        // Prueba de la versión recursiva simple
        int n = 10;
        System.out.println("Fibonacci (Recursivo) para n = " + n + ": " + fibonacci.fibonacciRecursivo(n)); // Resultado esperado: 55
        
        // Prueba de la versión con memorización
        Map<Integer, Integer> memo = new HashMap<>();
        System.out.println("Fibonacci (Memorizado) para n = " + n + ": " + fibonacci.fibonacciMemorizado(n, memo)); // Resultado esperado: 55
    }
}
