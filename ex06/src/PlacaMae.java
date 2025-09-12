import java.util.Objects;

public class PlacaMae {
    private String fabricante;
    private Processador processador;
    private MemoriaRAM memoriaRAM;

    public PlacaMae(String fabricante, Processador processador, MemoriaRAM memoriaRAM) {
        this.fabricante = fabricante;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public MemoriaRAM getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(MemoriaRAM memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PlacaMae placaMae = (PlacaMae) o;
        return Objects.equals(fabricante, placaMae.fabricante) && Objects.equals(processador, placaMae.processador) && Objects.equals(memoriaRAM, placaMae.memoriaRAM);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fabricante, processador, memoriaRAM);
    }

    @Override
    public String toString() {
        return "PlacaMae{" +
                "fabricante='" + fabricante + '\'' +
                ", processador=" + processador +
                ", memoriaRAM=" + memoriaRAM +
                '}';
    }
}
