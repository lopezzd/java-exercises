# Exercício 05 | Classe Veículos

Crie uma classe em Java chamada **Veiculo**. Essa classe deverá possuir os seguintes requisitos:

1. **Atributos**:

   - placa (String) → deve passar por **validação**.

   - modelo (String) → validação: não pode ser nulo ou em branco.

   - ano (int)

   - cor (enum com principais cores: BRANCO, PRETO, PRATA, VERMELHO, AZUL).

   - ehPlacaNova (boolean) → indica se a placa segue o modelo novo do Brasil.

2. **Construtores**:

    - Um construtor completo, recebendo todos os atributos.

    - Um construtor com todos os atributos, exceto "ehPlacaNova", definindo:
      - ehPlacaNova como true (valor default).
    
    - Um terceiro construtor que receba apenas placa, modelo e ano, definindo:
      - cor como PRATA (valor default);
      - ehPlacaNova como true (valor default).

3. **Validação da placa**:

    - Se for **placa antiga**: padrão LLLNNNN (3 letras + 4 números).

    - Se for **placa nova** (**Mercosul**): padrão LLLNLNN (ex.: BRA2E19).

    - Caso a placa não siga nenhum padrão, lançar exceção IllegalArgumentException.

4. **Métodos obrigatórios**:

    - Getters e setters com validação.

    - toString() → exibir em uma única linha os dados do veículo.

    - equals(Object obj) → considerar apenas a **placa**.

    - hashCode() → reimplementar utilizando Objects.hash(...), consistente com o equals().

5. **Classe de teste** (**VeiculoTest**):

    - Criar diferentes veículos utilizando os três construtores.

    - Testar a impressão com toString().

    - Comparar veículos com equals() e verificar os hashCode().

    - Demonstrar o tratamento de exceção ao criar um veículo com placa inválida.

---

# Colaboradores
| [<img style="width:150px; height:150px; object-fit:cover; object-position:center; border-radius:8px;" loading="lazy" src="./assets/Gabriel%20Hemo.jpeg" width=115><br><sub>Gabriel Hemo Gonçalves Santos</sub>](https://github.com/hemogabriel) | [<img style="width:150px; height:150px; object-fit:cover; object-position:center; border-radius:8px;" loading="lazy" src="./assets/Jo%C3%A3o%20Henrique%20Lopes.jpeg" width=115><br><sub>João Henrique Lopes Divino</sub>](https://github.com/lopezzd) | [<img style="width:150px; height:150px; object-fit:cover; object-position:center; border-radius:8px;" loading="lazy" src="./assets/Marcus%20Vinicius%20Lopes.jpeg" width=115><br><sub>Marcus Vinicius Lopes Divino</sub>](https://github.com/marcuslopes06) |
|:--------------------------------------------------------------------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------------------------------------------------------------------------------:|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|