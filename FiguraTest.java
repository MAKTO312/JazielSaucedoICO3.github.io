import javax.sql.rowset.spi.SyncResolver;

public class FiguraTest {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5);
        Triangulo triangulo = new Triangulo(5, 8, 3, 3, 3);
        Circulo circulo = new Circulo(5);

        System.out.println("Cuadrado Area:"+cuadrado.calcularArea() + "   Cuadrado Perimetro:"+ cuadrado.calcularPerimetro());

    System.out.println("Triangulo Area:"+triangulo.calcularArea() + "   Triangulo Perimetro:"+ triangulo.calcularPerimetro());
    


    System.out.println("Circulo Area:"+circulo.calcularArea() + "   Circulo Perimetro:"+ circulo.calcularPerimetro());
    

    }

    

    
    
}
