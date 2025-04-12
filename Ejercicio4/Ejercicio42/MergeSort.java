package Ejercicio4.Ejercicio42;

import java.util.Arrays;

public class MergeSort {

    /**
     * Método recursivo para ordenar un arreglo utilizando el algoritmo Merge Sort.
     * 
     * Complejidad temporal: O(n log n), ya que el algoritmo divide el arreglo en mitades log(n) veces y fusiona las mitades en O(n).
     * 
     * Complejidad espacial: O(n), ya que en cada paso se crea un arreglo auxiliar para realizar la fusión.
     * 
     * @param array Arreglo de enteros que se desea ordenar.
     */
    public void mergeSort(int[] array) {
        if (array == null || array.length < 2) {
            return; // Caso base: si el arreglo tiene 0 o 1 elementos, ya está ordenado.
        }

        // Dividir el arreglo en dos mitades
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        // Ordenar cada mitad recursivamente
        mergeSort(left);
        mergeSort(right);

        // Fusionar las mitades ordenadas
        merge(array, left, right);
    }

    /**
     * Método para fusionar dos subarreglos ordenados en uno solo ordenado.
     * 
     * @param array Arreglo original donde se almacenará el resultado fusionado.
     * @param left Subarreglo izquierdo.
     * @param right Subarreglo derecho.
     */
    private void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Fusionar los elementos de left y right en el arreglo original
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Si quedan elementos en left, agregarlos
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Si quedan elementos en right, agregarlos
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}
