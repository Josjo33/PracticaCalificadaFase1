// Clase con Algoritmo de Kadane
package Ejercicio3.Ejercicio32;

public class MaxSubarraySum {

    /**
     * Método que encuentra la suma máxima de un subarreglo contiguo dentro de un arreglo de enteros.
     * Utiliza el algoritmo de Kadane, que tiene una complejidad temporal O(n).
     * 
     * Complejidad temporal: O(n), donde n es el tamaño del arreglo. 
     * - El algoritmo recorre el arreglo una sola vez y realiza operaciones constantes en cada iteración.
     * 
     * Complejidad espacial: O(1), ya que solo utilizamos un número fijo de variables adicionales.
     * 
     * @param numeros Arreglo de números enteros.
     * @return La suma máxima de un subarreglo contiguo.
     */
    public int maxSubarraySum(int[] numeros) {
        // Inicializar las variables
        int maxSoFar = numeros[0];  // La suma máxima global
        int maxEndingHere = numeros[0]; // La suma máxima hasta el momento

        // Recorrer el arreglo a partir del segundo elemento
        for (int i = 1; i < numeros.length; i++) {
            // Actualizar la suma máxima hasta el momento (maxEndingHere)
            maxEndingHere = Math.max(numeros[i], maxEndingHere + numeros[i]);

            // Actualizar la suma máxima global (maxSoFar)
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
