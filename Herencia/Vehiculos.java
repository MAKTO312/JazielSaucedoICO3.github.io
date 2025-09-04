package Herencia;

// Clase base que representa un vehículo genérico
public class Vehiculos extends VehiculoBase {
    // Nuevos atributos adicionales para un vehículo genérico
    private String tipoCombustible;
    private double peso;
    private String numeroSerie;

    // Constructor que pasa los atributos generales a la clase abstracta y nuevos atributos para esta clase
    public Vehiculos(String marca, String modelo, int anio, String color, String tipoCombustible, double peso, String numeroSerie) {
        super(marca, modelo, anio, color);
        this.tipoCombustible = tipoCombustible;
        this.peso = peso;
        this.numeroSerie = numeroSerie;
    }

    // Constructor original para compatibilidad
    public Vehiculos(String marca, String modelo, int anio, String color) {
        super(marca, modelo, anio, color);
        this.tipoCombustible = "Gasolina";
        this.peso = 1500; // Peso promedio en kg
        this.numeroSerie = "123456789ABCDEF"; // Número de serie ficticio
    }

    // Métodos getter y setter para los nuevos atributos
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    // Implementación del método abstracto para mostrar detalles
    @Override
    public String getDetalles() {
        return "Marca: " + getMarca() +
               ", Modelo: " + getModelo() +
               ", Año: " + getAnio() +
               ", Color: " + getColor() +
               ", Combustible: " + tipoCombustible +
               ", Peso: " + peso + " kg" +
               ", Serie: " + numeroSerie;
    }
}