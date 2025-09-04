
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase; // salario base por semana

    // constructor con 5 argumentos sirven para inicializar el objeto EmpleadoBaseMasComision
    // el public es para que pueda ser accedido desde otras clases  
    // el super es para llamar al constructor de la superclase EmpleadoPorComision
    // los if son para validar los datos de entrada y lanzar una excepcion si no son
    
    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase){
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);

// throw new IllegalArgumentException es para lanzar una excepcion si el salario base es menor a 0.0 osea negativo o cero
        if(salarioBase < 0.0){
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        }
        this.salarioBase = salarioBase;
    }

    // establece el salario base del empleado y valida que sea >= 0.0 y marca error si no lo es o es negativo
    public void setSalarioBase(double salarioBase){
        if(salarioBase < 0.0){
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        }
        this.salarioBase = salarioBase;
    }

    // devuelve el salario base del empleado
    public double getSalarioBase(){
        return salarioBase;
    }

    // calcula los ingresos y lo sobreescribe para los distintos empleados
    @Override
    public double obtenerMontoPago(){
        return getSalarioBase() + super.obtenerMontoPago();
    }

    // devuelve representacion String del objeto EmpleadoBaseMasComision
    @Override
    public String toString(){
        return String.format("%s\nsalario base: %.2f", super.toString(), getSalarioBase());
    }       
    
}
