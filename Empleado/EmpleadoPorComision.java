public class EmpleadoPorComision extends Empleado{ //usamos extends para heredar de la clase Empleado
    private double ventasBrutas; // ventas totales por semana
    private double tarifaComision; // porcentaje de comision

    // el constructor es para inicializar las variables de de la clase y validar los datos de entrada de la clase super
    // el public es para que pueda ser accedido desde otras clases
    // el super es para llamar al constructor de la superclase Empleado
    // los if son para validar los datos de entrada y lanzar una excepcion si no son validos
    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision){
        
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        if(ventasBrutas < 0.0){
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        }
        if(tarifaComision <= 0.0 || tarifaComision >= 1.0){
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");
        }
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    // establece las ventas brutas de los empleados y valida que sean >= 0.0
    public void setVentasBrutas(double ventasBrutas){
        if(ventasBrutas < 0.0){
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        }
        this.ventasBrutas = ventasBrutas;
    }

    // devuelve las ventas brutas de los empleados
    public double getVentasBrutas(){
        return ventasBrutas;
    }

    // establece la tarifa de comision por cada venta realizada
    public void setTarifaComision(double tarifaComision){
        if(tarifaComision <= 0.0 || tarifaComision >= 1.0){
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");
        }
        this.tarifaComision = tarifaComision;
    }

    // devuelve la tarifa de comision
    public double getTarifaComision(){
        return tarifaComision;
    }

    // calcula los ingresos, usamos el override para poder sobreescibir en los demas empleados
    @Override
    public double ingresos(){
        return getTarifaComision() * getVentasBrutas();
    }

    // devuelve el string del empleado por comision para mostrarlo en pantalla
    //Permite la sobreescritura del metodo tostring de la superclase Empleado porque no es final sin embargo si es un abstract
    //por lo que es obligatorio sobreescribirlo porque ya esta declarado en la clase Empleado

    @Override
    public String toString(){
        return String.format("empleado por comision: %s\nventas brutas: %.2f\ntarifa de comision: %.2f",
         super.toString(), getVentasBrutas(), getTarifaComision());
    }
    
}
