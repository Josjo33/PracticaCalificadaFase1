package Ejercicio1.Ejercicio12;

public class Motocicleta extends Vehiculo {
    private int cilindrada;

    // Constructor para inicializar los atributos
    public Motocicleta(String marca, String modelo, int anio, int cilindrada) {
        super(marca, modelo, anio); // Llamada al constructor de la clase base
        this.cilindrada = cilindrada;
    }

    // Métodos getters y setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    // Implementación del método calcularCostoMantenimiento
    @Override
    public double calcularCostoMantenimiento() {
        double costo = 50; // Costo base
        if (cilindrada > 500) {
            costo += 20; // Aumenta el costo si la cilindrada es mayor a 500 cc
        }
        return costo;
    }
}
