# Exercicio 01 | String
Você está desenvolvendo um sistema para um editor de livros. 
Uma das funções do sistema é gerar a referência bibliográfica dos autores no formato "SOBRENOME, Nome" a partir do nome completo digitado pelo usuário.


### Por exemplo:

- Entrada: `"Maria Clara de Souza"` → Saída: `"SOUZA, Maria"`

- Entrada: `"João da Silva"` → Saída: `"SILVA, João"`

## O que fazer

Implemente uma **função em Java** que:

1. Leia do usuário um nome completo usando `BufferedReader` e `InputStreamReader`.

2. Considere sempre **o primeiro nome** e **o último nome da string** (ignore os nomes do meio).

Exiba o resultado no formato:

CopyEdit

`ÚLTIMO_NOME_EM_MAIÚSCULAS, PrimeiroNomeComInicialMaiúscula`

4. Garanta que não haja espaços extras no início ou final do texto digitado.

## Regras

- Utilize métodos da classe String, como:

   - trim() para remover espaços extras nas bordas

  - split(" ") para separar as palavras

  - toUpperCase() para transformar em maiúsculas

  - substring() e toLowerCase() para ajustar a capitalização do primeiro nome

- Não se preocupe com nomes compostos no primeiro ou último nome — pegue apenas a primeira e a última palavra digitadas.