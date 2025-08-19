public class AnimalTest {
    public static void main(String[] args) {
        // Crear instancias de Perro usando diferentes constructores
        Pez pez1 = new Pez("Nemo", "Payaso", "Naranja", "Salada");
        Perro perro2 = new Perro("Milo", "Golden","Guaf", 30.2);

        // Mostrar información de los perros
        System.out.println("\" Información de los Animales \"");
        mostrarInfoPez(pez1);
        mostrarInfoPerro(perro2);
    }

    // Método auxiliar para mostrar información de un perro
    public static void mostrarInfoPez(Pez pez) {
        System.out.println("Nombre: " + pez.getNombre());
        System.out.println("Raza: " + pez.getRaza());
        System.out.println("Color: " + pez.getColor());
        System.out.println("Tipo de agua: " + pez.getTipoAgua());
        System.out.println("---");

    }
    public static void mostrarInfoPerro(Perro perro) {
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Ladrido: " + perro.getLadrido());
        System.out.println("Raza: " + perro.getRaza());
        System.out.println("Peso: " + perro.getPeso() + "kg");
        System.out.println("---");

    }
}