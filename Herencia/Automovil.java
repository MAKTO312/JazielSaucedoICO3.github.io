package Herencia;

// Subclase que hereda de Vehiculos y representa un automóvil
public class Automovil extends Vehiculos {
    // Nuevos atributos propios de un automóvil
    private int numeroPuertas;
    private boolean aireAcondicionado;

    // Constructor que inicializa los atributos heredados y los nuevos
    public Automovil(String marca, String modelo, int anio, String color, int numeroPuertas, boolean aireAcondicionado) {
        super(marca, modelo, anio, color); // Llama al constructor de la superclase
        this.numeroPuertas = numeroPuertas;
        this.aireAcondicionado = aireAcondicionado;
    }

    // Métodos getter y setter para los nuevos atributos
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean tieneAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    // Sobreescritura del método getDetalles para agregar información extra
    @Override
    public String getDetalles() {
        return super.getDetalles() + ", Puertas: " + numeroPuertas + ", Aire Acondicionado: " + (aireAcondicionado ? "Sí" : "No");
    }

    // Método propio de Automovil para abrir la cajuela
    public void abrirCajuela() {
        System.out.println("La cajuela del automóvil está abierta.");
    }
}