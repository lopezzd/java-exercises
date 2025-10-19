import java.util.Objects;

public class Imovel implements Comparable<Imovel> {
    private String codigo;
    private double valor;
    private double areaM2;
    private Endereco endereco;

    public Imovel(String codigo, double valor, double areaM2, Endereco endereco) {
        setCodigo(codigo);
        setValor(valor);
        setAreaM2(areaM2);
        setEndereco(endereco);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo.isBlank())
            throw new IllegalArgumentException("O código deve ser preenchido!");

        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor < 0)
            throw new IllegalArgumentException("O valor deve ser positivo!");

        this.valor = valor;
    }

    public double getAreaM2() {
        return areaM2;
    }

    public void setAreaM2(double areaM2) {
        if(areaM2 < 0)
            throw new IllegalArgumentException("A área deve ser positiva!");

        this.areaM2 = areaM2;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        if(endereco == null)
            throw new IllegalArgumentException("Endereço faltante!");

        this.endereco = endereco;
    }

    public double calcularIPTU(){
        return this.valor * 0.0008;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Imovel imovel = (Imovel) o;
        return Double.compare(valor, imovel.valor) == 0 && Double.compare(areaM2, imovel.areaM2) == 0 && Objects.equals(codigo, imovel.codigo) && Objects.equals(endereco, imovel.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, valor, areaM2, endereco);
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "codigo='" + codigo + '\'' +
                ", valor=" + valor +
                ", areaM2=" + areaM2 +
                ", endereco=" + endereco +
                '}';
    }

    @Override
    public int compareTo(Imovel o) {
        int comparacaoValor = Double.compare(this.valor, o.valor);

        if (comparacaoValor != 0) {
            return comparacaoValor;
        }

        return Double.compare(this.areaM2, o.areaM2);
    }
}
