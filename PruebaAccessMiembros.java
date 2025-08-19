public class PruebaAccessMiembros {
    public static void main(String[] args) {
        Tiempo1 tiempo = new Tiempo1();
        tiempo.hora = 7;    // Error: hora tiene acceso privado
        tiempo.minuto = 15; // Error: minuto tiene acceso privado
        tiempo.segundo = 30; // Error: segundo tiene acceso privado
    }
}