# Loja-de-Materiais-de-Constru-o

Encapsulamento: Os atributos são privados e acessíveis apenas por meio de métodos públicos (getters e setters).

Herança: Classes como Cliente, Funcionario, Atendente, Gerente, Materiais, Tintas, e Ferramentas são subclasses e herdam atributos das suas respectivas superclasses (Pessoa e Produto).

Polimorfismo: Métodos como mostrarDetalhes() são sobrescritos em subclasses para fornecer implementações específicas,  utilizam a mesma assinatura mas são implementadas de maneira diferente para cada classe.

Coleções: Uma lista (List<Produto> produtos) é usada para gerenciar as compras de forma dinâmica dentro da classe Cliente.
