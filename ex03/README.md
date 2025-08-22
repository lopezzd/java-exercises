# Exercicio 2 - Tratamento de Exceções

Implemente um programa em Java que faça o seguinte:

1. **Leia um número inteiro** do usuário.

   - Se o usuário digitar algo que não seja um número → trate `NumberFormatException` e peça novamente.

2. **Peça outro número** e calcule a divisão entre eles.

   - Se o divisor for zero → trate `ArithmeticException` e peça outro valor.

3. **Peça uma palavra (String) e um índice** para acessar um caractere dentro dela.

   - Se o índice for inválido → trate `StringIndexOutOfBoundsException` e peça outro índice.

   - Se o usuário digitar algo que não seja um número → trate `NumberFormatException` e peça novamente.
4. Crie uma variável String inicializada com `null` e tente imprimir seu comprimento (`length`).

   - Trate `NullPointerException` com uma mensagem amigável.