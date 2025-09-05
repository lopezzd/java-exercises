// Exercício presente em www.github.com/lopezzd/java-exercises

public class IngressoEventoTest {
    public static void main(String[] args) {
        System.out.println("Evento: " + IngressoEvento.NOME_EVENTO);
        System.out.println("Capacidade: " + IngressoEvento.CAPACIDADE_MAXIMA);
        System.out.println("Vendidos (início): " + IngressoEvento.getVendidos());
        System.out.printf("Ocupação: %.2f%%%n", IngressoEvento.getTaxaOcupacao());

        // Instâncias válidas
        IngressoEvento i1 = new IngressoEvento("Camarote", 750.0d, 12, false);
        IngressoEvento i2 = new IngressoEvento("Pista", "350.00", "0", "true"); // construtor alternativo
        IngressoEvento i3 = new IngressoEvento("Pista Premium", 500.0, 0, true);
        IngressoEvento i4 = new IngressoEvento("VIP", 1200.0, 101, false);

        System.out.println("Vendidos (depois): " + IngressoEvento.getVendidos());
        System.out.printf("Ocupação: %.2f%%%n", IngressoEvento.getTaxaOcupacao());

        // toString implícito/explicito
        System.out.println(i1);
        System.out.println(i2.toString());
        System.out.println(i3);
        System.out.println(i4);

        // Testes de validação (devem lançar IllegalArgumentException)
        try {
            i1.setPreco(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado (preço): " + e.getMessage());
        }

        try {
            i2.setSetor("  ");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado (setor): " + e.getMessage());
        }

        try {
            i3.setCadeira(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado (cadeira): " + e.getMessage());
        }

        try {
            for (int k = IngressoEvento.getVendidos(); k <= IngressoEvento.CAPACIDADE_MAXIMA; k++) {
                new IngressoEvento("Pista", 100.0, 0, false);
            }
        } catch (IllegalStateException e) {
            System.out.println("Erro esperado (capacidade): " + e.getMessage());
        }
    }
}
