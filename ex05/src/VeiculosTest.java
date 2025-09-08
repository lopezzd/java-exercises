import java.time.Year;

public class VeiculosTest {
    public static void main(String[] args) {
        Veiculos civic = new Veiculos("ABC1234", Year.of(2010), "Civic", Cor.PRETO);
        Veiculos jetta = new Veiculos("BRA2E19", Year.of(2020), "Jetta", Cor.BRANCO);
        Veiculos corolla = new Veiculos("XYZ9999", Year.of(2005), "Corolla");

        System.out.println(civic);
        System.out.println(jetta);
        System.out.println(corolla);

        System.out.println(civic.toString());
        System.out.println(jetta.toString());
        System.out.println(corolla.toString());

        Veiculos golf = new Veiculos("ABC1234", Year.of(2015), "Golf", Cor.VERMELHO);

        System.out.println(civic.equals(golf));
        System.out.println("civic=" + civic.hashCode() + " | golf=" + golf.hashCode());

        System.out.println(civic.equals(jetta));
        System.out.println("civic=" + civic.hashCode() + " | jetta=" + jetta.hashCode());

        try {
            Veiculos invalido = new Veiculos("123ABC", Year.of(2010), "Civic", Cor.PRETO);
            System.out.println(invalido);
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}