import java.util.Objects;

public class MemoriaRAM {
    private int capacidadeGB;
    private String tipo;

    public MemoriaRAM(int capacidadeGB, String tipo) {
        this.capacidadeGB = capacidadeGB;
        this.tipo = tipo;
    }

    public MemoriaRAM(MemoriaRAM memoriaRAM) {
        this.capacidadeGB = memoriaRAM.capacidadeGB;
        this.tipo = memoriaRAM.tipo;
    }

    public int getCapacidadeGB() {
        return capacidadeGB;
    }

    public void setCapacidadeGB(int capacidadeGB) {
        this.capacidadeGB = capacidadeGB;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MemoriaRAM that = (MemoriaRAM) o;
        return capacidadeGB == that.capacidadeGB && Objects.equals(tipo, that.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacidadeGB, tipo);
    }

    @Override
    public String toString() {
        return "MemoriaRAM{" +
                "capacidadeGB=" + capacidadeGB +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
