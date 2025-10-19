public enum TipoTerreno {
    Arenoso("Arenoso"),
    Argiloso("Argiloso");

    private final String nome;

    TipoTerreno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
