import java.util.Objects;

public class Data implements Comparable<Data> {

    private byte dia;
    private byte mes;
    private short ano;

    // Construtor principal
    public Data(byte dia, byte mes, short ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    // Construtor de cópia
    public Data(Data data) {
        this.dia = data.getDia();
        this.mes = data.getMes();
        this.ano = data.getAno();
    }

    // Getters
    public byte getDia() {
        return this.dia;
    }

    public byte getMes() {
        return this.mes;
    }

    public short getAno() {
        return this.ano;
    }

    // Setters

    public void setAno(short ano) {
        if (ano == 0)
            throw new IllegalArgumentException("O ano não pode ser zero!");

        this.ano = ano;
    }

    public void setMes(byte mes) {
        if (mes < 1 || mes > 12)
            throw new IllegalArgumentException("O mês deve estar entre 1 e 12!");

        this.mes = mes;
    }

    public void setDia(byte dia) {
        if (dia < 1)
            throw new IllegalArgumentException("O dia não pode ser menor que um!");

        int maxDiasNoMes = getMaxDiasNoMes();

        if (dia > maxDiasNoMes) {
            throw new IllegalArgumentException(
                    "Dia inválido! O mês " + this.mes + " de " + this.ano + " tem no máximo " + maxDiasNoMes + " dias."
            );
        }

        this.dia = dia;
    }

    private boolean ehAnoBissexto() {
        return (this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0);
    }

    private int getMaxDiasNoMes() {
        if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
            return 30;
        }

        if (this.mes == 2) {
            return ehAnoBissexto() ? 29 : 28;
        }

        return 31;
    }
    public void avancarUmDia(){

        if (this.dia < getMaxDiasNoMes()) {
            this.dia++;
            return;
        }

        this.dia = 1;

        if (this.mes < 12) {
            this.mes++;
            return;
        }

        this.mes = 1;
        this.ano++;
        if (this.ano == 0) {
            this.ano = 1;
        }
    }

    public void retrocederUmDia() {
        if (this.dia > 1) {
            this.dia--;
            return;
        }


        if (this.mes == 1) {
            this.mes = 12;
            this.ano--;
            if (this.ano == 0) {
                this.ano = -1;
            }
        } else {
            this.mes--;
        }
        this.dia = (byte) getMaxDiasNoMes();
    }

    @Override
    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return dia == data.dia && mes == data.mes && ano == data.ano;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, mes, ano);
    }

    @Override
    public int compareTo(Data data) {
        int comparacaoAno = Short.compare(this.ano, data.ano);
        if (comparacaoAno != 0) {
            return comparacaoAno;
        }

        int comparacaoMes = Byte.compare(this.mes, data.mes);
        if (comparacaoMes != 0) {
            return comparacaoMes;
        }

        return Byte.compare(this.dia, data.dia);
    }
}