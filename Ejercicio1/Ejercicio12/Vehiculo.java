package Ejercicio1.Ejercicio12;

public abstract class Vehiculo {
    // Atributos comunes para todas las clases de vehículos
    protected String marca;
    protected String modelo;
    protected int anio;

    // Constructor para inicializar los atributos
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Métodos getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Método abstracto para calcular el costo de mantenimiento
    public abstract double calcularCostoMantenimiento();
}

