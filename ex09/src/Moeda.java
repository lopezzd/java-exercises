import java.util.Objects;

public class Moeda {
    private double centavos;
    private CodMoeda codigo;

    public Moeda(double centavos, CodMoeda codigo){
        setCentavos(centavos);
        setCodigo(codigo);
    }

    public Moeda(Moeda moeda){
        setCentavos(moeda.centavos);
        setCodigo(moeda.codigo);
    }


    public double getCentavos() {
        return centavos;
    }

    public void setCentavos(double centavos) {

        if(centavos < 0)
            throw new IllegalArgumentException("Não pode ser um número negativo!");

        this.centavos = centavos;
    }

    public CodMoeda getCodigo() {
        return codigo;
    }

    public void setCodigo(CodMoeda codigo) {
        if(codigo == null)
            throw new IllegalArgumentException("Código inválido!");

        this.codigo = codigo;
    }

    public Moeda converterPara(CodMoeda novaMoeda, double taxaConversao){
        if (taxaConversao < 0)
            throw new IllegalArgumentException("Taxa de conversão deve ser positiva!");

        if(this.centavos < taxaConversao)
            throw new IllegalArgumentException("Saldo insuficiente!");

        if(codigo == null)
            throw new IllegalArgumentException("Código inválido!");

        this.centavos = this.centavos - taxaConversao;
        setCodigo(novaMoeda);
        return this;
    }

    public Moeda somar(Moeda moeda){
        if (moeda == null)
            throw new IllegalArgumentException("Moeda inválida!");

        if (this.getCodigo() != moeda.getCodigo())
            throw new IllegalArgumentException("As moedas são diferentes!");

        this.centavos += moeda.centavos;

        return this;
    }

    public Moeda multiplicar(int fator){
        if (fator < 1)
            throw new IllegalArgumentException("Deve-se multiplicar por pelo menos 1!");

        this.centavos *= fator;

        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Moeda moeda = (Moeda) o;
        return Double.compare(centavos, moeda.centavos) == 0 && codigo == moeda.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(centavos, codigo);
    }

    @Override
    public String toString() {
        return "Moeda{" +
                "centavos=" + centavos +
                ", codigo=" + codigo +
                '}';
    }
}
