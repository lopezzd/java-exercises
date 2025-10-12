import java.util.Objects;

public class ReservaDeHotel {
    private Data entrada;
    private Data saida;
    private Moeda diaria;
    
    public ReservaDeHotel(Data entrada, Data saida, Moeda diaria) {
        if (saida.compareTo(entrada) < 0) { 
            throw new IllegalArgumentException("Data de saida menor que entrda");
        }
        
        this.entrada = new Data(entrada);
        this.saida = new Data(saida);
        this.diaria = new Moeda(diaria); 
    }
    
    public Moeda getValorTotal() {
        int dias  = diasEntre(entrada,saida);
        return diaria.multiplicar(dias);
    }
    
    private int diasEntre(Data entrada, Data saida) {
        int qtdeDias = 0; 
        Data aux = new Data(entrada);
        while (aux.compareTo(saida) < 0) {
            qtdeDias++;
            aux.avancarUmDia();
        }
        return qtdeDias;
    }
    
    public Moeda converterValorTotal(CodMoeda moeda, double taxa) {
        return getValorTotal().converterPara(moeda, taxa);
    }
    
    public void adiaSaida(Data novaSaida) {
        if(novaSaida.compareTo(saida) <= 0) {
            if(novaSaida.compareTo(entrada) <= 0) {
                throw new IllegalArgumentException("Nova data menor que entrada");
            }
            throw new IllegalArgumentException ("Nova data menor que saida atual");
        }
        this.saida = new Data(novaSaida);
    }

    @Override
    public String toString() {
        return "ReservaDeHotel{" +
                "entrada=" + entrada +
                ", saida=" + saida +
                ", diaria=" + diaria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ReservaDeHotel that = (ReservaDeHotel) o;
        return Objects.equals(entrada, that.entrada) && Objects.equals(saida, that.saida) && Objects.equals(diaria, that.diaria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entrada, saida, diaria);
    }
}
