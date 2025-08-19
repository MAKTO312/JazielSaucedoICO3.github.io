public class Perro {
    //declaracion de atributos, variables, campos de instancia
    private String Nombre;
    private String Ladrido = "woof";
    private String Raza;
    private double Peso;


    public Perro(String N, String R, Double Peso){
        this.Nombre = N;
        this.Raza = R;
        this.Peso = Peso;
    }
    public Perro(String N, String R, String Ladrido, Double Peso){
        this.Nombre = N;
        this.Raza = R;
        this.Ladrido = Ladrido;
        this.Peso = Peso;

    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public String getRaza() {
        return Raza;
    }
    public void setRaza(String raza) {
        this.Raza = raza;
    }
    public double getPeso() {
        return Peso;
    }
    public void setPeso(double peso) {
        this.Peso = peso;
    }
    public String getLadrido() {
        return Ladrido;
    }
    public void setLadrido(String ladrido) {
        this.Ladrido = ladrido;
    }

}