public class Perro2 extends Animal {
    private String ladrido;
    private double peso;
    
    
    public Perro2(String N, String R, String C, String ladrido, double peso) {
        super(N, R, C);
        this.ladrido = ladrido;
        this.peso = peso;
    }


    public String getLadrido() {
        return ladrido;
    }


    public void setLadrido(String ladrido) {
        this.ladrido = ladrido;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }

    
}
