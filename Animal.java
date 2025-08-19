public class Animal {
    private String Nombre;
    private String Raza;
    private String Color;

    public Animal(String N, String R, String C){
    this.Nombre = N;
    this.Raza = R;
    this.Color = C;

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

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }
    

}
