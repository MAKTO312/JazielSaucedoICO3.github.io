public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;

    // constructor con 4 argumentos para inicializar el objeto EmpleadoAsalariado
    // el public es para que pueda ser accedido desde otras clases 
    // el super es para llamar al constructor de la superclase Empleado
    // los if son para validar los datos de entrada y lanzar una excepcion si no son validos
// throw new IllegalArgumentException es para lanzar una excepcion si el salario semanal es menor a 0.0 osea negativo o cero
    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double salarioSemanal){
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        if(salarioSemanal < 0.0){
            throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");
        }
        this.salarioSemanal = salarioSemanal;
    }

    // establece el salario semanal del empleado y valida que sea >= 0.0
    public void setSalarioSemanal(double salarioSemanal){
        if(salarioSemanal < 0.0){
            throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");
        }
        this.salarioSemanal = salarioSemanal;
    }

    // devuelve el salario semanal del empleado
    public double getSalarioSemanal(){
        return salarioSemanal;
    }

    // calcula los ingresos y lo sobreescribe para los distintos empleados
    @Override
    public double ingresos(){
        return getSalarioSemanal();
    }

    // devuelve representacion String del objeto EmpleadoAsalariado
    @Override
    public String toString(){
        return String.format("empleado asalariado: %s\nsalario semanal: %.2f", super.toString(), getSalarioSemanal());
    }
    
}
//explicacion del codigo
// La clase EmpleadoAsalariado extiende la clase abstracta Empleado, lo que significa que hereda sus atributos y métodos.
// Tiene un atributo adicional salarioSemanal que representa el salario semanal del empleado.
// El constructor de la clase inicializa los atributos heredados y el salario semanal, validando que este último sea mayor o igual a 0.0.
// Hay métodos para establecer y obtener el salario semanal, con validación en el método set.
// El método ingresos() se sobrescribe para devolver el salario semanal.
// El método toString() se sobrescribe para proporcionar una representación en cadena del objeto EmpleadoAsalariado, incluyendo el salario semanal.
