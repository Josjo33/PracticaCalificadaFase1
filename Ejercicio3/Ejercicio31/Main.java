package Ejercicio3.Ejercicio31;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de la clase SumaObjetivo
        SumaObjetivo sumaObjetivo = new SumaObjetivo();
        
        // Ejemplo 1: Arreglo [3, 5, 1, 7, 9] con objetivo 10
        int[] numeros1 = {3, 5, 1, 7, 9};
        int objetivo1 = 10;
        System.out.println("Ejemplo 1: " + sumaObjetivo.existeSumaObjetivo(numeros1, objetivo1)); // Debe retornar true
        
        // Ejemplo 2: Arreglo [2, 4, 6] con objetivo 11
        int[] numeros2 = {2, 4, 6};
        int objetivo2 = 11;
        System.out.println("Ejemplo 2: " + sumaObjetivo.existeSumaObjetivo(numeros2, objetivo2)); // Debe retornar false
    }
}
