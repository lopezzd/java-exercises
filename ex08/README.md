# Mini-Sistema de Eventos

##Exercício 

1. Classe - Organizador

- Atributos: 
   - String nome (com validação simples: não nulo/blank)
   - String email (com validação simples: não nulo/blank e contendo "@")

- Implementar obrigatóriamente 
    - Construtor completo
    - Getters e Setters **com validação**
    - `toString()`, `equals(Object)`, `hashCode()`
    - **Construtor de cópia** para facilitar cópia profunda

2. Classe - Evento

- Atributos:
    - String título (com validação simples: não nulo/blank)
    - Organizador organizador
    - **Atributo estátio**: totalCriados

- Implementar obrigatóriamente
    - Construtor completo
    - Getters e Setters **com validação**
    - `toString()`, `equals(Object)`, `hashCode()`
    - **Construtor de cópia para facilitar cópia profunda
    - `Comparable<Evento>`: `compareTo(Evento o)` deve ordenar por **data (asc)** e, em empate, por **título (asc, case-insensitive)**
    - **EStáticos**: incrementar totalCriados em todos os construtores; implementar um get do atributo estático

3. Classe de Teste - EventoApp

- Utilizar  `BufferReader` + `InputStreamReader(System.in)` para ler entradas do usuário:

- **Quem lança exceções de validação são as classes de domínio** (Organizador e Evento). A EventoApp deve **apenas tratar** as exceções e **pedir novamente** a informação até ficar válida

- **Fluxo obrigatório**:
    1. Pedir ao usuário os dados para **criar 3 eventos** (cada evento com seu Organizador), **validando** cada entrada
       - Se o usuário digitar algo inválido, **tratar** a exceção e solicitar novamente

    2. Adicionar os eventos em um `ArrayList<Evento>` na ordem de criação
    
    3. **Ordenar** a lista usando `Collections.sort()`

    4. Exibir:
       - A lista **antes** e **depois** da ordenação
       - O valor do **atributo estático** via `Evento.getTotalCriados()`

---

# Colaboradores
| [<img style="width:150px; height:150px; object-fit:cover; object-position:center; border-radius:8px;" loading="lazy" src="./assets/Gabriel%20Hemo.jpeg" width=115><br><sub>Gabriel Hemo Gonçalves Santos</sub>](https://github.com/hemogabriel) | [<img style="width:150px; height:150px; object-fit:cover; object-position:center; border-radius:8px;" loading="lazy" src="./assets/Jo%C3%A3o%20Henrique%20Lopes.jpeg" width=115><br><sub>João Henrique Lopes Divino</sub>](https://github.com/lopezzd) | [<img style="width:150px; height:150px; object-fit:cover; object-position:center; border-radius:8px;" loading="lazy" src="./assets/Marcus%20Vinicius%20Lopes.jpeg" width=115><br><sub>Marcus Vinicius Lopes Divino</sub>](https://github.com/marcuslopes06) |
|:--------------------------------------------------------------------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------------------------------------------------------------------------------:|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|