// Uso de constructores sobrecargados para inicializar objetos Tiempo2
public class PruebaTiempo2
{
    public static void main(String[] args)
    {
        Tiempo2 t1 = new Tiempo2(); // 00:00:00
        Tiempo2 t2 = new Tiempo2(3); // 03:00:00
        Tiempo2 t3 = new Tiempo2(22, 30); // 22:30:00
        Tiempo2 t4 = new Tiempo2(13, 20, 44); // 13:20:44
        Tiempo2 t5 = new Tiempo2(t4); // 12:25:42

        System.out.println("Se construyó con:");
        mostrarTiempo("t1: todos los argumentos predeterminados", t1);
        mostrarTiempo("t2: se especificó hora; minuto y segundo predeterminados", t2);
        mostrarTiempo("t3: se especificaron hora y minuto; segundo predeterminado", t3);
        mostrarTiempo("t4: se especificaron hora, minuto y segundo", t4);
        mostrarTiempo("t5: se especificó el objeto Tiempo2 llamado t4", t5);

        // intento de inicializar t6 con valores inválidos
        try
        {
            Tiempo2 t6 = new Tiempo2(37, 740, 999); // valores inválidos
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("%nExcepción al inicializar t6: %s%n", e.getMessage());
        }
    }

    // muestra un objeto tiempo2 en formatos de 24 y 12 horas
    private static void mostrarTiempo(String encabezado, Tiempo2 t)
    {
        System.out.printf("%s%n %s%n %s%n", encabezado, t.aStringUniversal(), t.toString());
    }
}