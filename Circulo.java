public class Circulo extends Figura{
    private double radio;
    private double pi=3.1416;

    public Circulo(double radio){
        this.radio = radio;
    }
    
      @Override
    public double calcularArea(){
        return (radio*radio)*pi;
    }

     @Override
    public double calcularPerimetro(){
        return (pi*pi)*radio;
    }
    
}
