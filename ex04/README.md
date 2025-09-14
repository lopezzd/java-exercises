# Exercício 04 | Classe Produto

Crie uma classe Produto com os seguintes atributos **privados**:

- nome (String)
- preco (float)
- estoque (int)

Implemente **getters** e **setters** para cada atributo, aplicando as seguintes **validações**:

- O preço deve ser **maior que zero**.
- O estoque não pode ser **negativo**.
- Obs: Em caso de erro, apenas apresentar uma mensagem usando `System.err.println();`

Depois, crie uma classe ProdutoTest (com o método main) que:

1. Crie três instâncias de Produto com valores válidos.
2. Tente atribuir valores inválidos (ex.: preço negativo, estoque negativo) e observe o que acontece.
3. Mostre os dados de cada produto utilizando os getters.

# Exercício 2 - Classe IngressoEvento

Crie a classe IngressoEvento para representar a venda de ingressos de um evento.

## Requisitos

1. **Atributos privados**:

   - String setor – exemplo: "Pista", "Camarote".

   - double preco – deve ser maior que 0.

   - int cadeira – se for 0, significa “sem assento marcado”.

   - boolean meiaEntrada – true para meia, false para inteira.

2. **Atributos estáticos e constantes**:

   - private static int vendidos – contador global de ingressos vendidos.

   - public static final String NOME_EVENTO – nome fixo do evento.

   - public static final int CAPACIDADE_MAXIMA – capacidade máxima.

3. **Construtores**:

   - **Principal**: recebe todos os parâmetros tipados.

   - **Alternativo (com Strings)**: recebe String setor, String preco, String cadeira, String meiaEntrada, converte para os tipos primitivos e chama o construtor principal com this(...).

   - Importante: vendidos **não pode ultrapassar** CAPACIDADE_MAXIMA.

4. **Getters e Setters (com validações)**:

   - setSetor: não pode ser vazio/nulo.

   - setPreco: deve ser > 0.

   - setCadeira: deve ser >= 0.

   - setMeiaEntrada: aceita true ou false.

5. **Métodos estáticos**:

   - getVendidos() – retorna quantos ingressos foram vendidos.

   - getTaxaOcupacao() – percentual de ocupação (0–100) com base em CAPACIDADE_MAXIMA.

6. toString() sobrescrito:

   - Retornar informações <u>amigáveis</u>: evento, setor, preço (duas casas; pesquise sobre *String.format*), cadeira (ou “sem assento”), tipo (meia/inteira).

7. Validações:
   - Em todos os casos em que as validações encontrarem um parâmetro inconsistente, a classe deve lançar uma exceção do tipo `IllegalArgumentException`.

8. Classe de teste:

   - A seguinte classe de teste deve funcionar com o código da classe gerada por você