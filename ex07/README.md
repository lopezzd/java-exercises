## Classe Aluno
### Atributos (mínimos):

- String ra (registro acadêmico, obrigatório)

- String nome (obrigatório)

- double mediaFinal (0.0 a 10.0)

## Ordenação (regra do `compareTo`):

1. Maior mediaFinal vem primeiro (ordem decrescente).

2. Em caso de empate, ordenar por nome em ordem alfabética crescente.

3. Persistindo o empate, ordenar por ra em ordem crescente.

> Observação “**o que é melhor**”: para este exercício, “melhor aluno” = maior mediaFinal; o nome e o RA são critérios de desempate para garantir uma ordenação total e determinística.

## Classe AlunoTest
### Instanciação de objetos

- Crie pelo menos 5 objetos Aluno com combinações que forcem diferentes resultados:

   - Dois com médias diferentes.

   - Dois com mesma média e nomes diferentes (para exercitar o desempate por nome).

   - Dois com mesma média e mesmo nome, mas RA diferente (desempate final por RA).

- Impressão inicial

   - Imprima cada aluno com toString() para registrar os dados que serão comparados.

- Comparações diretas com compareTo

   - Compare **pares específicos** e **imprima o resultado numérico** do compareTo e a interpretação:

   - a1.compareTo(a2) e a2.compareTo(a1) (mostrar **sinal oposto** entre A vs B e B vs A).

   - Caso de **empate parcial**: dois alunos com **mesma média**, nomes diferentes (verificar quem “vence” pelo nome).

   - Caso de **desempate final**: dois alunos com **mesma média e mesmo nome**, mas **RA diferente** (verificar quem “vence” pelo **RA**).

   - Caso de **igualdade total na ordenação**: se você criar dois objetos **idênticos em média, nome e RA**, verifique que compareTo retorna **0**.