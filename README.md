# Loja-de-Materiais-de-Constru-o

Encapsulamento: Os atributos são privados e acessíveis apenas por meio de métodos públicos (getters e setters).

Herança: Classes como Cliente, Funcionario, Atendente, Gerente, Materiais, Tintas, e Ferramentas são subclasses e herdam atributos das suas respectivas superclasses (Pessoa e Produto).

Polimorfismo: Métodos como mostrarDetalhes() são sobrescritos em subclasses para fornecer implementações específicas,  utilizam a mesma assinatura mas são implementadas de maneira diferente para cada classe.

Sobrescrita e Sobrecarga de Métodos: o método mudancaDePreco() é sobrecarregado para aceitar tanto um valor fixo quanto uma porcentagem e um booleano para determinar o tipo de ajuste dentro da superclasse Produto. Cada uma dessas subclasses (Materiais, Tintas, e Ferramentas) está sobrescrevendo o método mostrarDetalhes da superclasse Produto. Isso significa que, quando o método mostrarDetalhes() é chamado em um objeto de uma dessas subclasses, a versão sobrescrita específica daquela subclasse será executada, ao invés da versão da superclasse.

Coleções: Uma lista (List<Produto> produtos) é usada para gerenciar as compras de forma dinâmica dentro da classe Cliente.

Manipulação de Arquivos: 

Exceções: `IOException`: Esta exceção é lançada se houver algum problema durante a leitura ou escrita de um arquivo (por exemplo, se o arquivo não existir, ou não puder ser aberto). `NumberFormatException:` No método atualizarEstoqueDeArquivo, essa exceção é tratada especificamente para capturar erros de formatação de números, que podem ocorrer ao tentar converter uma string em um número.
