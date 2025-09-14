# Exercicio 02 | Math - Orçamento de Piso para Reforma

Uma empresa de reformas precisa de um sistema que calcule o **orçamento de piso** para cobrir uma sala retangular.
A sala pode conter pilares circulares que **não serão revestidos**. Além disso, é necessário considerar **um percentual de desperdício** de material e calcular quantas caixas de piso serão necessárias.

---

## O que fazer

Implemente **uma função em Java** que:

1. Leia os seguintes dados do usuário (via `BufferedReader` e `InputStreamReader`):

   - Largura da sala (m)

   - Comprimento da sala (m)

   - Quantidade de pilares

   - Raio de cada pilar (m)

   - Cobertura de cada caixa de piso (m<sup>2</sup>)

   - Preço de cada caixa de piso

   - Percentual de desperdício (ex.: 0.10 para 10%)

2. Calcule e exiba:

   - **Área da sala** (`largura * comprimento`)

   - **Área total ocupada pelos pilares** (`π * raio² * quantidade`)

   - **Área líquida a revestir** (`área sala - área pilares`)

   - **Área com desperdício** (`área líquida * (1 + percentualDesperdicio)`)

   - **Quantidade de caixas necessárias** (arredondar **para cima** com `Math.ceil`)

   - **Custo total do piso** (`quantidadeCaixas * preçoCaixa`)

## Regras

- Utilize métodos da classe `Math`, como `Math.PI`, `Math.pow()` e `Math.ceil()`.

- Exibir valores com **duas casas decimais**.

- Validar se a área líquida é positiva (se não, mostrar mensagem de erro).



| Entrada | Saída |
|---------|-------|
|    larguraSala=5.0, comprimentoSala=8.0<br>qtdPilares=2, raioPilar=0.2<br>coberturaCaixaM2=2.2, precoCaixa=89.90<br>alturaRodapeCm=10.0, precoMetroRodape=12.50<br>percentualDesperdicio=0.10     | Área da sala: 40.00 m²<br>Área total dos pilares: 0.25 m²<br>Área líquida: 39.75 m²<br>Área com desperdício (10%): 43.73 m²<br>Caixas necessárias (2.2 m²/caixa): 20<br>Custo do piso: R$ 1,798.00<br>Perímetro útil: 25.19 m<br>Custo do rodapé (10 cm): R$ 314.88<br>CUSTO TOTAL: R$ 2,112.88 | 


