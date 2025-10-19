public class Terreno extends Imovel{
    private TipoTerreno tipoTerreno;
    private Zoneamento zoneamento;

    public Terreno(String codigo, double valor, double areaM2, Endereco endereco, TipoTerreno tipoTerreno, Zoneamento zoneamento) {
        super(codigo, valor, areaM2, endereco);
        this.tipoTerreno = tipoTerreno;
        this.zoneamento = zoneamento;
    }

    public TipoTerreno getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(TipoTerreno tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    public Zoneamento getZoneamento() {
        return zoneamento;
    }

    public void setZoneamento(Zoneamento zoneamento) {
        this.zoneamento = zoneamento;
    }

    @Override
    public double calcularIPTU() {
        return getValor() * 0.005;
    }

    @Override
    public String toString() {
        String imovel = super.toString();

        return imovel + "Terreno{" +
                "tipoTerreno=" + tipoTerreno +
                ", zoneamento=" + zoneamento +
                '}';
    }
}
