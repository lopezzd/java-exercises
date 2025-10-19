public enum Zoneamento {
    Residencial("Residencial"),
    Comercial("Comercial"),
    INDUSTRIAL("Industrial"),
    MISTO("Misto"),
    RURAL("Rural"),
    INSTITUCIONAL("Institucional");

    private final String nome;

    Zoneamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
