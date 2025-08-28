import java.util.Date;

public class Personas {
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String fechaNacimineto;
    
    public Personas(String Nombre, String ApellidoPaterno, String ApellidoMaterno, String fechaNacimiento){
        this.Nombre = Nombre;
        this.fechaNacimineto = fechaNacimiento;
        this.ApellidoMaterno = ApellidoMaterno;
        this.ApellidoPaterno = ApellidoPaterno;

    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public String getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public void setFechaNacimineto(String fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }
    
    public void cambiarCarrera(String nuevaCarrera) {
        // Método base para ser sobrescrito por las subclases
    }
}
