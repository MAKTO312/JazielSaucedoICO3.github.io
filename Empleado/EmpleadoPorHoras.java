public class EmpleadoPorHoras extends Empleado {
    private double sueldo; // sueldo por hora
    private double horas;  // horas trabajadas por semana

    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno,
                            String numeroSeguroSocial, double sueldo, double horas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        if (sueldo < 0.0)
            throw new IllegalArgumentException("El sueldo por horas debe ser >= 0.0");

        if ((horas < 0.0) || (horas > 168.0))
            throw new IllegalArgumentException("Las horas trabajadas deben ser >= 0.0 y <= 168.0");

        this.sueldo = sueldo;
        this.horas = horas;
    }

    public void establecerSueldo(double sueldo) {
        if (sueldo < 0.0)
            throw new IllegalArgumentException("El sueldo por horas debe ser >= 0.0");
        this.sueldo = sueldo;
    }

    public double obtenerSueldo() { return sueldo; }

    public void establecerHoras(double horas) {
        if ((horas < 0.0) || (horas > 168.0))
            throw new IllegalArgumentException("Las horas trabajadas deben ser >= 0.0 y <= 168.0");
        this.horas = horas;
    }

    public double obtenerHoras() { return horas; }

    @Override
    public double ingresos() {
        if (obtenerHoras() <= 40)
            return obtenerSueldo() * obtenerHoras();
        else
            return 40 * obtenerSueldo() + (obtenerHoras() - 40) * obtenerSueldo() * 1.5;
    }

    @Override
    public String toString() {
        return String.format("Empleado por horas: %s%nSueldo por hora: $%,.2f; Horas trabajadas: %,.2f",
                super.toString(), obtenerSueldo(), obtenerHoras());
    }
}
