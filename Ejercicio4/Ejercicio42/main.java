// Clase principal para probar el algoritmo Merge Sort
package Ejercicio4.Ejercicio42;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        // Crear instancia de MergeSort
        MergeSort mergeSort = new MergeSort();
        
        // Ejemplo 1: Arreglo de enteros desordenados
        int[] array1 = {3, 5, 1, 4, 9, 2};
        System.out.println("Arreglo original: " + Arrays.toString(array1));
        mergeSort.mergeSort(array1);
        System.out.println("Arreglo ordenado: " + Arrays.toString(array1)); // Resultado esperado: [1, 2, 3, 4, 5, 9]
        
        // Ejemplo 2: Arreglo con números negativos
        int[] array2 = {-3, -5, -1, -4, -9, -2};
        System.out.println("\nArreglo original: " + Arrays.toString(array2));
        mergeSort.mergeSort(array2);
        System.out.println("Arreglo ordenado: " + Arrays.toString(array2)); // Resultado esperado: [-9, -5, -4, -3, -2, -1]
        
        // Ejemplo 3: Arreglo vacío
        int[] array3 = {};
        System.out.println("\nArreglo original: " + Arrays.toString(array3));
        mergeSort.mergeSort(array3);
        System.out.println("Arreglo ordenado: " + Arrays.toString(array3)); // Resultado esperado: []
    }
}
