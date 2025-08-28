import java.util.Date;
import java.util.Scanner;

public class TestEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Registro de Estudiantes ===");

        // Ingresar datos del estudiante

        System.out.print("Ingrese el ID del estudiante: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

         System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el apellido paterno: ");
        String apellidoPaterno = scanner.nextLine();

        System.out.print("Ingrese el apellido materno: ");
        String apellidoMaterno = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento (dd/MM/yyyy): ");
        String fechaNacimientoStr = scanner.nextLine();
        Date fechaNacimiento = new Date(); // Aquí deberías parsear la fecha correctamente


        System.out.print("Ingrese la carrera: ");
        String carrera = scanner.nextLine();

        // Crear estudiante con los datos ingresados
        Estudiante estudiante = new Estudiante(
            nombre,
            apellidoPaterno,
            apellidoMaterno,
            fechaNacimientoStr,
            id,
            "",
            carrera
        );

        // Opción de cambio de carrera
        System.out.print("¿Desea cambiar la carrera? (si/no): ");
        String opcion = scanner.nextLine().trim().toLowerCase();
        if (opcion.equals("si")) {
            System.out.print("Ingrese la nueva carrera: ");
            String nuevaCarrera = scanner.nextLine();
            estudiante.cambiarCarrera(nuevaCarrera);
            System.out.println("¡Cambio de carrera exitoso!");
        }

        // Usar el método Scanner para ingresar calificación
        estudiante.ingresarCalificacionConScanner();

        // Mostrar datos del estudiante
        System.out.println("\n=== Datos del Estudiante Registrado ===");
        System.out.println("ID: " + estudiante.getId());
        System.out.println("Nombre: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno);
        System.out.println("Fecha de Nacimiento: " + estudiante.getFechaNacimineto());
        System.out.println("Carrera: " + estudiante.getCarrera());
      System.out.println("Calificación: " + estudiante.calcularPromedioCalificaciones());

        scanner.close();
    }
}
