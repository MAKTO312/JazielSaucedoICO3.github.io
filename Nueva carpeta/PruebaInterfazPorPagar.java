public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        PorPagar[] objetosPorPagar = new PorPagar[6];
        
        objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
        objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        objetosPorPagar[3] = new EmpleadoBaseMasComision("Jaziel", "Gonzalez", "111-11-1111", 500, 0.9, 400);
        objetosPorPagar[4] = new EmpleadoPorComision("Sue", "Jones", "222-22-2222", 10000, 0.1);
        objetosPorPagar[5] = new EmpleadoPorHoras("Bob", "Lewis", "333-33-3333", 20.00, 40);


        System.out.println("Facturas y Empleados procesados en forma polimórfica:");

        for (PorPagar porPagarActual : objetosPorPagar) {
            System.out.printf("%n%s %n%s: $%,.2f%n", 
                porPagarActual.toString(), 
                "pago vencido", 
                porPagarActual.obtenerMontoPago());
        }
    }
}
