# LOJA 
Boas Práticas de Programação

## Sobre o Projeto
Trata-se de um sistema que simula uma loja onde orçamentos são feitos para verificar a possibilidade de descontos, bem como calcular o valor do imposto devido sobre o produto adquirido. 

Projeto desenvolvido com base no curso da Alura de Design Patterns, utilizando os principais padrões de projeto:

* Strategy -> Utilizado quando muitas classes relacionadas diferem apenas no seu comportamento; Quando necessita-se de variantes de um algoritmo; Quando uma classe define muitos comportamentos e por sua vez eles aparecem com diversos “IFs”.
* Chain of Responsibility -> é um padrão de projeto comportamental que permite que você passe pedidos por uma corrente de handlers. Ao receber um pedido, cada handler decide se processa o pedido ou o passa adiante para o próximo handler na corrente. Utilizado quando você nao sabe qual regra de negócio será aplicada em cada situação.
* Template Method -> é um padrão de projeto comportamental que define o esqueleto de um algoritmo na superclasse mas deixa as subclasses sobrescreverem etapas específicas do algoritmo sem modificar sua estrutura. Favorece o reaproveitamento de códigos comuns entre classes, evitando assim duplicações de códigos.
* State ->  permite que um objeto altere seu comportamento quando seu estado interno muda. De acordo com estado aplica-se uma nova regra de negócio.
* Command -> separa dados da execução desses mesmos dados. Como se fosse o Controller e o Service. Esse padrão transforma um pedido em um objeto independente que contém toda a informação sobre o pedido.
* Observer -> classes que estão observando, são ouvintes, listeners, estão aguardando serem chamadas. Assim que forem chamadas irão executar o código.

Padrões de projetos são soluções generalistas para problemas recorrentes durante o desenvolvimento de um software.

Como o objetivo do projeto foi apenas demonstrar os design patterns, não houve comunicação com banco de dados, frameworks, criação de APIs, etc. 
Utilizou-se apenas a linguagem Java. 
