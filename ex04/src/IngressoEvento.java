// Exercício presente em www.github.com/lopezzd/java-exercises

public class IngressoEvento {
    private String setor;
    private double preco;
    private int cadeira;
    private boolean meiaEntrada;

    private static int vendidos = 0;
    public static final String NOME_EVENTO = "FLAMENGO 1 (6) X (5) 1 CORINTHIANS | FINAL COPA DO BRASIL 2022";
    public static final int CAPACIDADE_MAXIMA = 50;

    public IngressoEvento(String setor, double preco, int cadeira, Boolean meiaEntrada) {
        if(vendidos >= CAPACIDADE_MAXIMA){
            System.err.println("Todos os ingressos foram vendidos!");
            return;
        }

        this.setor = setor;
        this.preco = preco;
        this.cadeira = cadeira;
        this.meiaEntrada = meiaEntrada;

        vendidos++;
    }

    public IngressoEvento(String setor, String preco, String cadeira, String meiaEntrada) {
        if(vendidos >= CAPACIDADE_MAXIMA){
            System.err.println("Todos os ingressos foram vendidos!");
            return;
        }

        this.setor = setor;
        this.preco = Double.parseDouble(preco);
        this.cadeira = Integer.parseInt(cadeira);
        this.meiaEntrada = Boolean.parseBoolean(meiaEntrada);

        vendidos++;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        if (setor == null || setor.isBlank()) {
            System.err.println("Setor inválido!");
            return;
        }
        this.setor = setor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco <= 0) {
            System.err.println("Preço inválido: deve ser maior que zero.");
            return;
        }
        this.preco = preco;
    }


    public int getCadeira() {
        return cadeira;
    }

    public void setCadeira(int cadeira) {
        if (cadeira < 0) {
            System.err.println("Cadeira inválida, deve ser maior que zero.");
            return;
        }
        this.cadeira = cadeira;
    }


    public boolean isMeiaEntrada() {
        return meiaEntrada;
    }

    public void setMeiaEntrada(boolean meiaEntrada) {
        this.meiaEntrada = meiaEntrada;
    }

    public static int getVendidos() {
        return vendidos;
    }

    public static double getTaxaOcupacao() {
        return 100.0 * vendidos / CAPACIDADE_MAXIMA;
    }

    @Override
    public String toString() {
        return  "Nome do evento: " + NOME_EVENTO + "\n" +
                "Setor: " + this.setor + "\n" +
                "Preço: " + (this.preco == 0 ? "Gratis" : this.preco) + "\n" +
                "Cadeira: " + (this.cadeira == 0 ? "Cadeira inválida" : this.cadeira) + "\n" +
                "Meia entrada: " + (this.meiaEntrada ? "Sim" : "Não") + "\n" +
                "Total de ingrassos vendidos: " + (this.vendidos == 0 ? "Nenhum ingresso vendido" : vendidos) + "\n" +
                "Capacidade máxima: " + CAPACIDADE_MAXIMA + "\n" +
                "Total de ingressos vendidos: " + getTaxaOcupacao() + "\n";
    }
}