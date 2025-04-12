package Ejercicio1.Ejercicio12;

public class Automovil extends Vehiculo {
    private double kilometraje;
    private boolean tieneAireAcondicionado;

    // Constructor para inicializar los atributos
    public Automovil(String marca, String modelo, int anio, double kilometraje, boolean tieneAireAcondicionado) {
        super(marca, modelo, anio); // Llamada al constructor de la clase base
        this.kilometraje = kilometraje;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    // Métodos getters y setters
    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    // Implementación del método calcularCostoMantenimiento
    @Override
    public double calcularCostoMantenimiento() {
        double costo = 100; // Costo base
        if (kilometraje > 10000) {
            costo += 50; // Aumenta el costo si el kilometraje es mayor a 10,000 km
        }
        if (tieneAireAcondicionado) {
            costo += 30; // Aumenta el costo si el vehículo tiene aire acondicionado
        }
        return costo;
    }
}
