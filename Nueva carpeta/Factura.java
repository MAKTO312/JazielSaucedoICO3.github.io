public class Factura implements PorPagar {
    //implementa la interfaz PorPagar debido a que una factura es "pagable" y debe definir el método obtenerMontoPago
    private final String numeroPieza;
    private final String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;
// constructor para inicializar las cuatro variables de instancia y validar cantidad y precioPorArticulo
// usamos throw new IllegalArgumentException si cantidad no es >= 0 o si precioPorArticulo no es >= 0.0
    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        if (cantidad < 0)
            throw new IllegalArgumentException("Cantidad debe ser >= 0");
        if (precioPorArticulo < 0.0)
            throw new IllegalArgumentException("El precio por artículo debe ser >= 0");

        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = cantidad;
        this.precioPorArticulo = precioPorArticulo;
    }
     // métodos get y set 
    public String obtenerNumeroPieza() 
    { return numeroPieza; }

    public String obtenerDescripcionPieza() 
    { return descripcionPieza; }

    public void establecerCantidad(int cantidad) {
        if (cantidad < 0)
            throw new IllegalArgumentException("Cantidad debe ser >= 0");
        this.cantidad = cantidad;
    }

    public int obtenerCantidad() { return cantidad; }

    public void establecerPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo < 0.0)
            throw new IllegalArgumentException("El precio por artículo debe ser >= 0");
        this.precioPorArticulo = precioPorArticulo;
    }

    public double obtenerPrecioPorArticulo() { return precioPorArticulo; }

    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                "factura", "número de pieza", obtenerNumeroPieza(), obtenerDescripcionPieza(),
                "cantidad", obtenerCantidad(), "precio por artículo", obtenerPrecioPorArticulo());
    }

    @Override
    public double obtenerMontoPago() {
        return obtenerCantidad() * obtenerPrecioPorArticulo();
    }
}
