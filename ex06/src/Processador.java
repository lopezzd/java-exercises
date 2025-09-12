import java.util.Objects;

public class Processador {
    private String marca;
    private double frequenciaGHz;

    public Processador(double frequenciaGHz, String marca) {
        this.frequenciaGHz = frequenciaGHz;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getFrequenciaGHz() {
        return frequenciaGHz;
    }

    public void setFrequenciaGHz(double frequenciaGHz) {
        this.frequenciaGHz = frequenciaGHz;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Processador that = (Processador) o;
        return Double.compare(frequenciaGHz, that.frequenciaGHz) == 0 && Objects.equals(marca, that.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, frequenciaGHz);
    }

    @Override
    public String toString() {
        return "Processador{" +
                "marca='" + marca + '\'' +
                ", frequenciaGHz=" + frequenciaGHz +
                '}';
    }
}
