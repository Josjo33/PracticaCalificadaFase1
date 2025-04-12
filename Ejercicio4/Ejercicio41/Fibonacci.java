package Ejercicio4.Ejercicio41;

import java.util.Map;
import java.util.HashMap;

public class Fibonacci {

    // Método recursivo simple para calcular Fibonacci (ineficiente para valores altos)
    public int fibonacciRecursivo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n debe ser mayor o igual a 0");
        }
        
        // Caso base
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        // Llamada recursiva
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    /**
     * Método optimizado para calcular Fibonacci con memorización (utilizando un Map).
     * 
     * Complejidad temporal: O(n), ya que calculamos cada valor de Fibonacci solo una vez y lo almacenamos en el mapa.
     * Complejidad espacial: O(n), ya que almacenamos los resultados de Fibonacci en un mapa.
     * 
     * @param n El índice de Fibonacci que queremos calcular.
     * @param memo Mapa que almacena los valores de Fibonacci ya calculados.
     * @return El n-ésimo número de Fibonacci.
     */
    public int fibonacciMemorizado(int n, Map<Integer, Integer> memo) {
        if (n < 0) {
            throw new IllegalArgumentException("n debe ser mayor o igual a 0");
        }
        
        // Comprobar si el valor ya está memorizado
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        
        // Caso base
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        // Recursión con memorización
        int resultado = fibonacciMemorizado(n - 1, memo) + fibonacciMemorizado(n - 2, memo);

        // Memorizar el resultado
        memo.put(n, resultado);

        return resultado;
    }

}
