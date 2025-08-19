public class PerroTest {
    public static void main(String[] args) {
        // Crear instancias de Perro usando diferentes constructores
        Perro perro1 = new Perro("Milo", "Golden", 25.5);
        Perro perro2 = new Perro("Papatin", "Chikitin","Guaf", 30.2);

        // Mostrar información de los perros
        System.out.println("\" Información de los Perros \"");
        mostrarInfoPerro(perro1);
        mostrarInfoPerro(perro2);
    }

    // Método auxiliar para mostrar información de un perro
    public static void mostrarInfoPerro(Perro perro) {
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Ladrido: " + perro.getLadrido());
        System.out.println("Raza: " + perro.getRaza());
        System.out.println("Peso: " + perro.getPeso() + "kg");
        System.out.println("---");

    }
}