// Clase para resolver el ejercicio de la suma objetivo
package Ejercicio3.Ejercicio31;

import java.util.HashSet;

public class SumaObjetivo {
    
    public boolean existeSumaObjetivo(int[] numeros, int objetivo) {
        // HashSet para almacenar los números que necesitamos para formar la suma objetivo
        HashSet<Integer> complementos = new HashSet<>();
        
        // Iterar sobre el arreglo de números
        for (int num : numeros) {
            int complemento = objetivo - num; // El número que necesitamos para formar la suma objetivo
            
            // Si ya hemos encontrado el complemento en el HashSet, retornamos true
            if (complementos.contains(complemento)) {
                return true;
            }
            
            // Si no, agregamos el número actual al HashSet para comprobar más tarde si encontramos su complemento
            complementos.add(num);
        }
        
        // Si no encontramos ningún par, retornamos false
        return false;
    }
}
