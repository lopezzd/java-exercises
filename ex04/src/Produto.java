// Exercício presente em www.github.com/lopezzd/java-exercises

public class Produto {
	private String nome;
	private float preco;
	private int estoque;

	public Produto(String nome, float preco, int estoque) {
		if (preco <= 0)
			throw new IllegalArgumentException("Preço inválido: deve ser maior que zero.");

		if (estoque < 0)
			throw new IllegalArgumentException("Estoque inválido: não pode ser negativo.");

		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}

	public Produto(String nome, String preco, String estoque) {
		this.nome = nome;
		this.preco = Float.parseFloat(preco);
		this.estoque = Integer.parseInt(estoque);
	}

	public String getNome() {
		return this.nome;
	}

	public float getPreco() {
		return this.preco;
	}

	public int getEstoque() {
		return this.estoque;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(float preco) {
		if (preco <= 0) {
			System.err.println("Preço inválido: deve ser maior que zero.");
			return;
		}
		this.preco = preco;
	}

	public void setEstoque(int estoque) {
		if (estoque < 0) {
			System.err.println("Estoque inválido: não pode ser negativo.");
			return;
		}
		this.estoque = estoque;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + "\n" +
		       "Preço: " + (this.preco == 0 ? "Gratis" : this.preco) + "\n" +
		       "Estoque: " + (this.estoque == 0 ? "Zerado" : this.estoque) + "\n";
	}

}