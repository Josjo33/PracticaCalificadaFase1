package Ejercicio2.Ejercicio21;

public class Main {
    public static void main(String[] args) {
        // Crear un contenedor para almacenar Strings
        Contenedor<String> contenedorStrings = new Contenedor<>();
        contenedorStrings.agregar("Elemento 1");
        contenedorStrings.agregar("Elemento 2");
        contenedorStrings.agregar("Elemento 3");

        // Imprimir los elementos en el contenedor de Strings
        System.out.println("Contenedor de Strings:");
        for (int i = 0; i < contenedorStrings.contar(); i++) {
            System.out.println(contenedorStrings.obtener(i));
        }

        // Crear un contenedor para almacenar Productos
        Contenedor<Producto> contenedorProductos = new Contenedor<>();
        contenedorProductos.agregar(new Producto("Producto A", 25.50));
        contenedorProductos.agregar(new Producto("Producto B", 30.00));

        // Imprimir los elementos en el contenedor de Productos
        System.out.println("\nContenedor de Productos:");
        for (int i = 0; i < contenedorProductos.contar(); i++) {
            System.out.println(contenedorProductos.obtener(i));
        }

        // Verificar si los contenedores están vacíos
        System.out.println("\n¿El contenedor de Strings está vacío? " + contenedorStrings.estaVacio());
        System.out.println("¿El contenedor de Productos está vacío? " + contenedorProductos.estaVacio());
    }
}
