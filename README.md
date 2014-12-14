### Preparação para exame:
# Oracle Certified Professional 7 Programmer 
## 1Z0-805

# Java Class Design

## Objetivos:

Usar modificadores de acesso: private, protected e public
Sobrescrever métodos
Sobrecarregar métodos
Sobrecarregar construtores
Usar o operador intance of e casting
Usar invocação virtual de métodos
Sobrescrever métodos da classe Object e melhorar suas funcionalidades em sua classe
Usar declarações de import e package

## Resumo

### Fundamentos de POO

• Encapsulamento: Combinar dados e funções em uma única unidade

• Abstração: Esconder detalhes de baixo nível e expor somente os detalhes relevantes e essenciais para os usuários

• Herança: Criar relacionamentos hirarquicos entre as classes

• Polimorfismo: Intepretar a mesma chamada de métodos com diferentes significados dependendo do contexto
Fundamentos de Classe

• Uma classe é um template e um objeto é uma instancia de uma classe

• Um construtor não tem um tipo de retorno

• Você não pode acessar métodos privados de uma classe base em uma subclasse

• Você pode acessar métodos protegidos em uma subclasse ou em classe do mesmo pacote.

• Você também pode acessar um método com modificar default se este estiver no mesmo pacote

• Você pode acessar métodos públicos de uma classe de qualquer classe

### Sobrecarga

• Você pode ter contrutores sobrecarregados. Você pode chamar um construtor de uma mesma classe em outro contrutor usando a palavra-chave this

• Sobrecarregar método: é criar métodos com o mesmo nome mas com parametros de tipos ou quantidades diferentes

• Resolução de sobrecarga é o processo em que o compilador procura um método apropriado para os parametros passados nos métodos sobrecarregados disponíveis
Herança

• Herança é também chamada de relacionamento “é um”

• Chamar um método baseado em tipo de objeto dinamicamente é chamado de polimorfismo em tempo de execução

• Ao sobrescrever, o nome de um método, o número de argumentos, tipo de argumentos e tipo de retorno devem ser exatamente os mesmos

• Com retornos com co-variantes, você prove uma subclasse do tipo retornado em um método sobrescrito

• Você pode usar a palavra chave super para chamar métodos da classe base

• Sobrecarga é uma exemplo de polimorfismo estático, enquanto que sobrescrita é um exemplo de polimorfismo dinamico

• Você não precisa de fazer uma cast explícito para supertipos.

• Você precisa de fazer uma cast explícito para subclasses. Como isso pode falhar user o operador instance of para garatir a validade do cast

### Pacotes Java

• Um pacote é um escopo de construção para categorizar suas classes e prover gerenciamento de nome espaço


# Design de Classes Avançado Java
## Objetivos:

* Identificar como e quando usar classes abstratas
* Construir classes abstratas e subclasses
* Usar palavras chaves static e final
* Criar classes aninhadas
* Usar Enumerações

## Resumo

### Abstract Classes

• Uma abstração fornece funcinalidades sem mostrar detalhes da implementação.
• Você não pode criar intancias de uma classe abstrata.
• Classes abstratas permitem polimorfismo em tempo de execução e polimofirmos em tempo de execução diminui o acoplamento entre as classes.

### Usando “final” Keyword

• Uma classe final não pode ser herdada.
• Um método final não pode ser sobrescrito.
• Todos os métodos de uma classe final, são implicitamente final.
• Uma variável final pode ser designada apenas uma vez.

### Usando “static” Keyword

• Existem dois tipos de variáveis membro: variáveis de class e variáveis de instancia. Todas variáveis que necessitam de uma instancia de uma classe para serem acessadas são conhecidas como variáveis de instancia. Todas variáveis que são compartilhadas por todas intancias e associadas a uma classe e não a um objeto são referenciadas com variáveis de class (usam static em sua declaração)
• Todos membros estáticos não necessitam de uma instancia para serem acessados, pode ser acessados pelo no nome da classe.
• Um membro estático pode acessar ou chamar apenas outros membros estáticos sem uma instancia.

### Sabores de Nested Classes

• Java suporta 4 tipos de classes aninhadas: static nested classes, inner classes, local inner
classes, and anonymous inner classes.
• Static nested classes podem ter static members, enquanto que outros tipos de classes aninhadaas não podem.
• Static nested classes e inner classes podem acessar membros da outer class (mesmo que privados). Contudo, static nested classes podem acessar somente static members da outer class.
• Local classes (tanto local inner classes quanto anonymous inner classes) podem acessar qualquer variável do escopo em que foram declaradas (metodos, contrutores ou blocos).
• Enum são uma forma segura de restringir a entrada de dados de usuários.
• You cannot use new with enums, even inside the enum definition.
• Enum classes são default final classes.
• Todas enum classes são implicitamente derivadas de java.lang.Enum.

# Princípios POO
## Objetivos:

• escrever código que declare, implemente ou estenda interfaces
• escolher entre o uso de herança de classes ou implementar interfaces
• desenvolver código que implemente relacionamentos é-um e tem-um
• aplicar princípios de composição
• desenvolver código implementando os Design Patters: Siglenton, Factory, Abstract Factory e DAO

## Resumo

### Interfaces

• É um contrato que define um protocolo do que deve ser feito, mas não como.
• Não pode ser instanciada, mas pode herdar outras interfaces.
• Todos os métodos declarados em uma interface são implicitamente considerados abstratos.
• Uma classe Abstrata e uma interfaces possuem conceitos similares. Contudo cada uma deve ser usada corretamente baseado no contexto.

### Object Composition

• Herança determina relacinamento ‘é-um’, interface determina ‘é-como-um’, e composição determina ‘tem-um’.
• Favoreça composição ao invés da herança sempre que possível.
• Programe para uma interface e não para implementação.

### Design Patterns

• Observer é o padrão de projeto que diminui o acoplamento entre o objeto e seus obeservadores.
• Singleton é o padrão de projeto que assegura que apenas uma intância de um objeto será criada.
• Garantir que um singleton seja mesmo um singleton, especialmente em um ambiente multi-thread, não pe uma tarefa trivial.
• Factory é o padrão de projeto que provê instâncias sob demanda.
• Abstract Factory é o padrão de projeto que deve ser usado quando existe uma família de objetos a ser criado.

Padrões de Projeto são soluções reutilizáveis para problemas recorrentes. O padrão DAO basicamente separa a lógica do negócio da lógica de persistência.
