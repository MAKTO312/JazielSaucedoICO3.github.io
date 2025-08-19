public class Pez extends Animal {
    private String TipoAgua;

    public Pez(String N, String R, String C, String tipoAgua) {
        super(N, R, C);
        this.TipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return TipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        TipoAgua = tipoAgua;
    }

    
}
