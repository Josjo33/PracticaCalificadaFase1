package Ejercicio2.Ejercicio21;

public class Producto {
    private String nombre;
    private double precio;

    // Constructor para inicializar los atributos
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Mostrar la información del producto
    @Override
    public String toString() {
        return "Producto: " + nombre + ", Precio: " + precio;
    }
}
