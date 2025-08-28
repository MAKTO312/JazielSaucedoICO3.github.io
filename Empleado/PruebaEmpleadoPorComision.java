public class PruebaEmpleadoPorComision {
    public static void main(String[] args) {
        EmpleadoPorComision empleado = 
            new EmpleadoPorComision("Carlos", "Gómez", "555-55-5555", 8000, .08);

        System.out.printf("%s%n%s: $%,.2f%n",
                empleado, "ingresos", empleado.ingresos());
    }
}
