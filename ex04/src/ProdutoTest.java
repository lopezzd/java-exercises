// Exercício presente em www.github.com/lopezzd/java-exercises

public class ProdutoTest {
    public static void main(String[] args) {
        Produto tenis   = new Produto("Tênis", 299.99f, 150);
        Produto celular = new Produto("Celular", 2_999.99f, 50);
        Produto cadeira = new Produto("Vassoura", 29.99f, 10);

        System.out.println(tenis.toString());
        System.out.println(celular.toString());
        System.out.println(cadeira.toString());

        tenis.setPreco(0f);
        celular.setEstoque(-10);
        cadeira.setNome("Cadeira");

        System.out.println(tenis.getPreco());
        System.out.println(celular.getEstoque());
        System.out.println(cadeira.getNome());

        System.out.println(tenis.toString());
        System.out.println(celular.toString());
        System.out.println(cadeira.toString());
    }
}