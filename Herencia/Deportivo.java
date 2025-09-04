package Herencia;

// Subclase de Automovil que representa un automóvil deportivo
public class Deportivo extends Automovil {
    // Nuevos atributos exclusivos de un deportivo
    private String tipoMotor;
    private int velocidadMaxima;

    // Constructor que inicializa todos los atributos, incluyendo los heredados
    public Deportivo(String marca, String modelo, int anio, String color, int numeroPuertas, boolean aireAcondicionado, String tipoMotor, int velocidadMaxima) {
        super(marca, modelo, anio, color, numeroPuertas, aireAcondicionado); // Llama al constructor de Automovil
        this.tipoMotor = tipoMotor;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Métodos getter y setter para los nuevos atributos
    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    // Sobreescritura del método getDetalles para mostrar información de un deportivo
    @Override
    public String getDetalles() {
        return super.getDetalles() + ", Motor: " + tipoMotor + ", Velocidad Máxima: " + velocidadMaxima + " km/h";
    }

    // Método propio de Deportivo para activar el modo deportivo
    public void activarModoDeportivo() {
        System.out.println("¡Modo deportivo activado!");
    }
}