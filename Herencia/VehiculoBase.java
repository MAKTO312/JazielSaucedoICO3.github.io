package Herencia;

// Clase abstracta base para todos los vehículos
public abstract class VehiculoBase {
    // Atributos generales de cualquier vehículo
    private String marca;
    private String modelo;
    private int anio;
    private String color;

    // Constructor para inicializar los atributos generales
    public VehiculoBase(String marca, String modelo, int anio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    // Métodos getter y setter para los atributos generales
    public abstract String getDetalles();

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método común para encender cualquier vehículo
    public void encender() {
        System.out.println("El vehículo está encendido.");
    }
}
