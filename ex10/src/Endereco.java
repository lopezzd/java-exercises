import java.util.Objects;

public class Endereco implements Comparable<Endereco> {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private UF uf;
    private String cep;

    public Endereco(String rua, int numero, String bairro, String cidade, UF uf, String cep) {
        setRua(rua);
        setNumero(numero);
        setBairro(bairro);
        setCidade(cidade);
        setUf(uf);
        setCep(cep);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        if(rua.isBlank())
            throw new IllegalArgumentException("A rua não pode estar em branco!");

        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0)
            throw new IllegalArgumentException("O número deve ser maior que zero!");

        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        if(bairro.isBlank())
            throw new IllegalArgumentException("O bairro não pode estar em branco!");

        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if(cidade.isBlank())
            throw new IllegalArgumentException("A cidade não pode estar em branco!");

        this.cidade = cidade;
    }

    public String getCep() { return cep; }

    public void setCep(String cep) {
        if(cep.isBlank())
            throw new IllegalArgumentException("O CEP não pode estar em branco!");

        this.cep = cep;
    }

    public String getUf() { return uf.getNome(); }

    public void setUf(UF uf) {
        if(uf == null)
            throw new IllegalArgumentException("Estado inválido!");

        this.uf = uf;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return numero == endereco.numero && Objects.equals(rua, endereco.rua) && Objects.equals(bairro, endereco.bairro) && Objects.equals(cidade, endereco.cidade) && Objects.equals(uf, endereco.uf) && Objects.equals(cep, endereco.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rua, numero, bairro, cidade, uf, cep);
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "rua='" + rua + '\'' +
                ", numero=" + numero +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }

    @Override
    public int compareTo(Endereco o){
        int comparacaoCep = this.cep.compareTo(o.cep);

        if (comparacaoCep != 0) {
            return comparacaoCep;
        }

        return Integer.compare(this.numero, o.numero);
    }
}
