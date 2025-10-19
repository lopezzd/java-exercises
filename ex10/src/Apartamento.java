public class Apartamento extends Imovel{
    private int andar;
    private boolean possuiElevador;
    private boolean possuiEstacionamento;

    public Apartamento(String codigo, double valor, double areaM2, Endereco endereco, int andar, boolean possuiElevador, boolean possuiEstacionamento) {
        super(codigo, valor, areaM2, endereco);
        this.andar = andar;
        this.possuiElevador = possuiElevador;
        this.possuiEstacionamento = possuiEstacionamento;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        if(andar < 1)
            throw new IllegalArgumentException("O andar deve ser maior que 0!");

        this.andar = andar;
    }

    public boolean isPossuiElevador() {
        return possuiElevador;
    }

    public void setPossuiElevador(boolean possuiElevador) {
        this.possuiElevador = possuiElevador;
    }

    public boolean isPossuiEstacionamento() {
        return possuiEstacionamento;
    }

    public void setPossuiEstacionamento(boolean possuiEstacionamento) {
        this.possuiEstacionamento = possuiEstacionamento;
    }

    @Override
    public double calcularIPTU() {
        if(!(possuiElevador) && (andar <= 3))
            return getValor() * 0.012;

        return getValor() * 0.009;
    }

    @Override
    public String toString() {
        String imovel = super.toString();

        return imovel + "Apartamento{" +
                "andar=" + andar +
                ", possuiElevador=" + possuiElevador +
                ", possuiEstacionamento=" + possuiEstacionamento +
                '}';
    }
}
