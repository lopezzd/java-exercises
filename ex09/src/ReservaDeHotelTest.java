public class ReservaDeHotelTest {
    public static void main(String[] args) {
        Data entrada = new Data((byte)31, (byte)12, (short)2004);
        Data saida = new Data((byte)1, (byte)1, (short)2005);

        Moeda real = new Moeda(2500d, CodMoeda.BRL);

        System.out.println(entrada.toString());

        entrada.avancarUmDia();

        System.out.println(entrada.toString());

        ReservaDeHotel ferias = new ReservaDeHotel(entrada, saida, real);

        Data novaSaida = new Data((byte)1, (byte)12, (short)2005);

        ferias.adiaSaida(novaSaida);

        System.out.println(ferias.toString());
    }
}