public class PruebaSistemaNomina {// clase principal
    public static void main(String[] args) {// método main para ejecutar la aplicación y probar las clases
        EmpleadoAsalariado empleadoAsalariado =
            new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        EmpleadoPorHoras empleadoPorHoras =
            new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 16.75, 40);
        EmpleadoPorComision empleadoPorComision =
            new EmpleadoPorComision("Sue", "Jones", "333-33-3333", 10000, .06);
        EmpleadoBaseMasComision empleadoBaseMasComision =
            new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

            //usamos system.out.println para imprimir en pantalla y los datos de los empleados
        System.out.println("Empleados procesados por separado:\n");

        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoAsalariado,
                "ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoPorHoras,
                "ingresos", empleadoPorHoras.ingresos());
        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoPorComision,
                "ingresos", empleadoPorComision.ingresos());
        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoBaseMasComision,
                "ingresos", empleadoBaseMasComision.ingresos());
// creamos un arreglo de empleados para indicar que todos son empleados y que tipo de empleado son
        Empleado[] empleados = new Empleado[4];
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;

        System.out.println("Empleados procesados en forma polimórfica:\n");
// for para recorrer el arreglo de empleados y mostrar su información
        for (Empleado empleadoActual : empleados) {
            System.out.println(empleadoActual);

            if (empleadoActual instanceof EmpleadoBaseMasComision) {
                EmpleadoBaseMasComision empleado =
                        (EmpleadoBaseMasComision) empleadoActual;
                // Corrección: usar los nombres estándar de métodos Java
                empleado.setSalarioBase(
                        1.10 * empleado.getSalarioBase());
                System.out.printf("nuevo salario base con 10%% de aumento es: $%,.2f%n",
                        empleado.getSalarioBase());
            }

            System.out.printf("ingresos $%,.2f%n%n", empleadoActual.ingresos());
        }

        for (int j = 0; j < empleados.length; j++)
            System.out.printf("El empleado %d es un %s%n", j,
                    empleados[j].getClass().getName());
    }
}
