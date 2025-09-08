import java.time.Year;
import java.util.Objects;
import java.util.regex.Pattern;

public class Veiculos {
    private String placa;
    private Year ano;
    private String modelo;
    private Cor cor;
    private boolean ehPlacaNova;

    // REGEX das placas

    private static final Pattern PADRAO_ANTIGO = Pattern.compile("^[A-Z]{3}[0-9]{4}$");
    private static final Pattern PADRAO_NOVO   = Pattern.compile("^[A-Z]{3}[0-9][A-Z][0-9]{2}$");


    public Veiculos(String placa, Year ano, String modelo, Cor cor) {
        setPlaca(placa);
        setAno(ano);
        setModelo(modelo);
        setCor(cor);
    }

    public Veiculos(String placa, Year ano, String modelo) {
        setPlaca(placa);
        setAno(ano);
        setModelo(modelo);
        setCor(Cor.PRATA);
    }

    public String getPlaca() { return this.placa; }

    public void setPlaca(String placa) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("Placa não pode ser nula ou vazia");
        }

        String upperPlaca = placa.toUpperCase();


        if (PADRAO_ANTIGO.matcher(upperPlaca).matches()) {
            this.placa = upperPlaca;
            this.ehPlacaNova = false;
        } else if (PADRAO_NOVO.matcher(upperPlaca).matches()) {
            this.placa = upperPlaca;
            this.ehPlacaNova = true;
        } else {
            throw new IllegalArgumentException("Placa inválida: " + placa);
        }

    }

    public Year getAno() { return ano; }

    public void setAno(Year ano) {
        this.ano = ano;
    }

    public String getModelo() { return modelo; }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Cor getCor() { return cor; }

    public void setCor(Cor cor) {
        if (cor == null) {
            throw new IllegalArgumentException("Cor não pode ser nula");
        }
        this.cor = cor;
    }

    public boolean getehPlacaNova() { return ehPlacaNova; }

    @Override
    public String toString() {
        return "Placa: " + this.placa + ", Ano: " + this.ano +
                ", Modelo: " + this.modelo + ", Cor: " + this.cor +
                ", Mercosul: " + (this.ehPlacaNova ? "Placa nova" : "Placa antiga");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Veiculos veiculos = (Veiculos) o;
        return Objects.equals(placa, veiculos.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(placa);
    }
}
