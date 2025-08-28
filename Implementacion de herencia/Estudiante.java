
import java.util.Scanner;

public class Estudiante extends Personas{

    private int Id;
    private String Calificaciones;
    private String Carrera;


    public Estudiante(String Nombre, String ApellidoPaterno, String ApellidoMaterno, String fechaNacimiento, int Id, String Calificaciones, String Carrera) {
        super(Nombre, ApellidoPaterno, ApellidoMaterno, fechaNacimiento);
        this.Id = Id;
        this.Calificaciones = Calificaciones;
        this.Carrera = Carrera;
    }


    public int getId() {
        return Id;
    }
    public String getCalificaciones() {
        return Calificaciones;
    }

    public void setCalificaciones(String Calificaciones) {
        this.Calificaciones = Calificaciones;
    }

    public String getCarrera() {
        return Carrera;
    }

    public String CalcularCalificaciones(){
    return (getCalificaciones());
    }
    
    public void ingresarCalificacionConScanner() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Ingreso de Calificaciones ===");
        System.out.print("¿Cuántas calificaciones desea ingresar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        
        
         //StringBuilder utilizado para construir una representación en cadena de las calificaciones del estudiante.
         
        StringBuilder calificacionesBuilder = new StringBuilder();
        
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese la calificación " + i + " (A, B+, B, B-, C+, C, C-, D, F): ");
            String calificacion = scanner.nextLine().toUpperCase();
            
            if (!convertirCalificacionANumero(calificacion).equals("Invalida")) {
                calificacionesBuilder.append(calificacion);
                if (i < cantidad) {
                    calificacionesBuilder.append(", ");
                }
            } else {
                System.out.println("Calificación inválida, intente de nuevo.");
                i--; // Repetir esta iteración
            }
        }
        
        this.Calificaciones = calificacionesBuilder.toString();
        
        double promedio = calcularPromedioCalificaciones();
        System.out.println("Calificaciones registradas: " + this.Calificaciones);
        System.out.println("Promedio de calificaciones: " + String.format("%.2f", promedio));
        
        scanner.close();
    }
    
    public String convertirCalificacionANumero(String calificacionLetra) {
        String[] calificacionesLetras = {"A", "B+", "B", "B-", "C+", "C", "C-", "D", "F"};
        String[] calificacionesNumeros = {"4", "3.67", "3.33", "3", "2.67", "2.33", "2", "1", "0"};
        
        for (int i = 0; i < calificacionesLetras.length; i++) {
            if (calificacionLetra.equals(calificacionesLetras[i])) {
                return calificacionesNumeros[i];
            }
        }
        return "Invalida";
    }

   
    
    public double calcularPromedioCalificaciones() {
        if (Calificaciones == null || Calificaciones.isEmpty()) {
            return 0.0;
        }
        
        String[] calificacionesArray = Calificaciones.split(",");
        double suma = 0.0;
        int contador = 0;
        
        for (String cal : calificacionesArray) {
            cal = cal.trim();
            double valor = Double.parseDouble(convertirCalificacionANumero(cal));
            suma += valor;
            contador++;
        }
        
        return contador > 0 ? suma / contador : 0.0;
    }
    
    public void ingresarMultiplesCalificaciones() {
        ingresarCalificacionConScanner();
    }
    
    public void mostrarMenuOpciones() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n=== Menú de Opciones ===");
            System.out.println("1. Ingresar calificaciones");
            System.out.println("2. Ver promedio de calificaciones");
            System.out.println("3. Cambiar carrera");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            switch (opcion) {
                case 1:
                    ingresarMultiplesCalificaciones();
                    break;
                case 2:
                    double promedio = calcularPromedioCalificaciones();
                    System.out.println("Promedio actual: " + String.format("%.2f", promedio));
                    break;
                case 3:
                    System.out.print("Ingrese la nueva carrera: ");
                    String nuevaCarrera = scanner.nextLine();
                    cambiarCarrera(nuevaCarrera);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);
        
        scanner.close();
    }
    
    @Override
    public void cambiarCarrera(String nuevaCarrera) {
        this.Carrera = nuevaCarrera;
        System.out.println("Carrera cambiada exitosamente a: " + nuevaCarrera);
    }
    
}
