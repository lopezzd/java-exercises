import java.util.Objects;

public class Computador {
    private String marca;
    private String modelo;
    private PlacaMae placaMae;

    public Computador(PlacaMae placaMae, String marca, String modelo) {
        this.placaMae = placaMae;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Computador(Computador computador) {
        this.marca = computador.marca;
        this.modelo = computador.modelo;
        this.placaMae = computador.placaMae;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Computador that = (Computador) o;
        return Objects.equals(marca, that.marca) && Objects.equals(modelo, that.modelo) && Objects.equals(placaMae, that.placaMae);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, placaMae);
    }

    @Override
    public String toString() {
        return "Computador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placaMae=" + placaMae.toString() +
                '}';
    }
}
