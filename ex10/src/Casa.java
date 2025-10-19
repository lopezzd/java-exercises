public class Casa extends Imovel{

    private int qtdQuartos;
    private boolean possuiGaragem;

    public Casa(String codigo, double valor, double areaM2, Endereco endereco, int qtdQuartos, boolean possuiGaragem) {
        super(codigo, valor, areaM2, endereco);
        setQtdQuartos(qtdQuartos);
        setPossuiGaragem(possuiGaragem);
    }

    public int getQtdQuartos() {
        return qtdQuartos;
    }

    public void setQtdQuartos(int qtdQuartos) {
        if(qtdQuartos < 1)
            throw new IllegalArgumentException("A quantidade de quartos deve ser pelo menos de 1!");

        this.qtdQuartos = qtdQuartos;
    }

    public boolean isPossuiGaragem() {
        return possuiGaragem;
    }

    public void setPossuiGaragem(boolean possuiGaragem) {
        this.possuiGaragem = possuiGaragem;
    }

    @Override
    public double calcularIPTU(){
        return getValor() * 0.001;
    }

    @Override
    public String toString() {
        String imovel = super.toString();

        return imovel + "Casa{" +
                "qtdQuartos=" + qtdQuartos +
                ", possuiGaragem=" + possuiGaragem +
                '}';
    }
}
