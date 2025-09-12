1. **Classe Computador**
- Atributos:
  - marca (`String`)
  - modelo (`String`)
  - placaMae (`PlacaMae`)
  
2. **Classe PlacaMae**
- Atributos:
   - fabricante (`String`)
   - processador (`Processador`)
   - memoriaRAM (`MemoriaRAM`)
  
3. **Classe Processador**
- Atributos:
   - marca (`String`)
   - frequenciaGHz (`double`)
  
4. **Classe MemoriaRAM**
- Atributos:
   - capacidadeGB (`int`)
   - tipo (`String`)

Todas as classes devem possuir:

- Construtor padrão (recebendo todos os atributos nos tipos corretos e inicializando-os, sem validações).
- Construtor de cópia, que cria uma nova instância a partir de outro objeto do mesmo tipo (garantindo cópia profunda dos objetos internos).
- Métodos getters e setters para todos os atributos.
   - Não é necessário implementar validações nos atributos (aceite qualquer valor).
- Sobrescrita dos métodos:
   - toString() (retornar uma representação textual simples dos atributos).
   - equals() e hashCode() (baseados em todos os atributos da classe).
- Crie uma classe de teste (ComputadorTeste) que:
   - Instancie objetos das classes Processador e MemoriaRAM.
   - Instancie uma PlacaMae utilizando esses objetos.
   - Instancie um Computador com uma PlacaMae.
   - Mostre o resultado do toString() de cada objeto.
   - Teste a comparação de igualdade (equals) entre dois computadores.
   - Crie uma cópia de um computador utilizando o construtor de cópia.
   - Altere algum atributo da cópia (por exemplo, aumentar a memória RAM ou trocar a marca do processador) e verifique que o computador original não foi alterado.