# Implementar Reserva de Hotel

## CLASSE DATA

**Implemente uma classe** que representa uma data no calendário. Considere que ela possui as seguintes características:

- **Construtor**:

   - `public Data(byte dia, byte mes, short ano)`

- **Métodos principais (não são os únicos)**:

   - Getters e setters para todos os atributos;

   - `public void avanceUmDia()` – avança um dia.

   - `public void retrocedaUmDia()` – retrocede um dia.

   - Dos métodos `toString`, `equals`, `hashCode`, construtor de cópia e `compareTo`, aqueles que fizerem sentido estarem implementados, dados os métodos que a classe tem.

## CLASSE MOEDA

**Implemente uma classe** que representa um valor monetário em qualquer moeda.
Considere que ela possui as seguintes características:

- **Construtor**:

   - `public Moeda(long centavos, String codigo)` – cria valor a partir de centavos e código da moeda (BRL, reais brasileiros; USD, dólares americanos; EUR, euros da união europeia, etc.).

- **Métodos principais**:

   - `public Moeda converterPara(String novaMoeda, double taxaConversao)` – retorna nova moeda convertida.

   - `public Moeda somar(Moeda outra)` – retorna a soma, se mesma moeda.

   - `public Moeda multiplicar(int fator)` – retorna o produto.

   - Dos métodos `toString`, `equals`, `hashCode`, `clone`, construtor de cópia e `compareTo`, aqueles que fizerem sentido estarem implementados, dados os métodos que a classe tem.

## CLASSE RESERVA DE HOTEL

Use a classe Reserva de Hotel disponível no arquivo: `ReservaDeHotel.java`

Implemente apenas o método `toString()`.

## CLASSE RESERVA DE HOTEL TEST
Crie a classe ReservaDeHotelTest onde de fato será instanciados objetos e crie um código que utilize pelo menos uma vez cada método da classe Reserva de Hotel. Apresente casos de sucesso e de falha. 