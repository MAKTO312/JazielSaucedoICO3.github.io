package Herencia;

// Clase principal que ejecuta el programa y muestra el uso de la jerarquía
public class Main {
    public static void main(String[] args) {
        // Se crea un arreglo de VehiculoBase, demostrando polimorfismo
        VehiculoBase[] vehiculos = new VehiculoBase[3];
        // Se agregan objetos de diferentes clases a ese arreglo
        vehiculos[0] = new Vehiculos("Nissan", "Versa", 2019, "Blanco");
        vehiculos[1] = new Automovil("Toyota", "Corolla", 2020, "Rojo", 4, true);
        vehiculos[2] = new Deportivo("Ferrari", "488", 2021, "Amarillo", 2, true, "V8", 330);

        // Se recorre el arreglo y se usan los métodos de cada objeto
        for (VehiculoBase v : vehiculos) {
            // Se llama al método getDetalles, que puede estar sobreescrito debido al polimorfismo
            System.out.println(v.getDetalles());
            // Se llama al método encender de la superclase para todos los vehículos
            v.encender();
            // Se usa downcasting para acceder a métodos específicos de las subclases
            // usamos instanceof para verificar el tipo antes de hacer el cast y 
            if (v instanceof Deportivo) {
                ((Deportivo) v).activarModoDeportivo();
            } else if (v instanceof Automovil) {
                ((Automovil) v).abrirCajuela();
            }
            System.out.println();
        }
    }
}