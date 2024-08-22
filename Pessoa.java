package com.minhaempresa.loja; // Eu declaro o pacote para organizar a classe dentro de um 'namespace'

// Aqui eu defino a classe abstrata Pessoa, que serve como base para outras classes como Cliente, Funcionário, etc.
public abstract class Pessoa {
    private String cpf;
    private String nome; 
    private Date dataDeNascimento; 
    private String telefone; 

    // Este é o construtor da classe Pessoa, onde eu inicializo os atributos quando um objeto é criado
    public Pessoa(String cpf, String nome, Date dataDeNascimento, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
    }

    // Aqui eu defino um método abstrato que será implementado pelas subclasses
    public abstract void mostrarDetalhes();

    // Métodos getters e setters, que permitem acessar e modificar os atributos da pessoa
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

// Abaixo, eu defino as subclasses Cliente, Funcionario, Atendente, e Gerente, cada uma estendendo a classe Pessoa

// Classe Cliente estende Pessoa
class Cliente extends Pessoa {
    private String endereco; // Eu armazeno o endereço do cliente aqui
    private String email; // Aqui eu guardo o email do cliente
    private List<Produto> compras; // Coleção de produtos comprados
    
    // Eu crio o construtor da classe Cliente, que chama o construtor da superclasse Pessoa
    public Cliente(String cpf, String nome, Date dataDeNascimento, String telefone, String endereco, String email) {
        super(cpf, nome, dataDeNascimento, telefone); // Chamo o construtor da superclasse
        this.endereco = endereco; 
        this.email = email; 
        this.compras = new ArrayList<>(); // Inicializa a lista de compras
    }

    // Métodos para manipular a coleção de compras
        public void adicionarCompra(Produto produto) {
            compras.add(produto);
        }

        public void removerCompra(Produto produto) {
            compras.remove(produto);
        }

        public List<Produto> getCompras() {
            return compras;
        }
    
    // Implementação do método abstrato mostrarDetalhes
    @Override
    public void mostrarDetalhes() {
        // Aqui eu exibo os detalhes do cliente
        System.out.println("Cliente: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataDeNascimento());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Endereço: " + endereco);
        System.out.println("Email: " + email);
    }

    // Getters e setters para endereço e email
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

// Classe Funcionario estende Pessoa
class Funcionario extends Pessoa {
    private String email; 
    private Date dataDeContratacao; 
    private double salario; 

    // Eu crio o construtor da classe Funcionario, que chama o construtor da superclasse Pessoa
    public Funcionario(String cpf, String nome, Date dataDeNascimento, String telefone, String email, Date dataDeContratacao, double salario) {
        super(cpf, nome, dataDeNascimento, telefone); // Chamo o construtor da superclasse
        this.email = email; 
        this.dataDeContratacao = dataDeContratacao; 
        this.salario = salario; 
    }

    // Implementação do método abstrato mostrarDetalhes
    @Override
    public void mostrarDetalhes() {
        // Aqui eu exibo os detalhes do funcionário
        System.out.println("Funcionário: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataDeNascimento());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + email);
        System.out.println("Data de Contratação: " + dataDeContratacao);
        System.out.println("Salário: " + salario);
    }

    // Getters e setters para email, dataDeContratacao e salario
    public String getEmail() {
        return email; 
    }

    public void setEmail(String email) {
        this.email = email; 
    }

    public Date getDataDeContratacao() {
        return dataDeContratacao; 
    }

    public void setDataDeContratacao(Date dataDeContratacao) {
        this.dataDeContratacao = dataDeContratacao; 
    }

    public double getSalario() {
        return salario; 
    }

    public void setSalario(double salario) {
        this.salario = salario; 
    }
}

// Classe Atendente estende Funcionario
class Atendente extends Funcionario {
    private int numeroDeVendas; 

    // Eu crio o construtor da classe Atendente, que chama o construtor da superclasse Funcionario
    public Atendente(String cpf, String nome, Date dataDeNascimento, String telefone, String email, Date dataDeContratacao, double salario, int numeroDeVendas) {
        super(cpf, nome, dataDeNascimento, telefone, email, dataDeContratacao, salario); // Chamo o construtor da superclasse
        this.numeroDeVendas = numeroDeVendas;
    }

    // Implementação do método abstrato mostrarDetalhes
    @Override
    public void mostrarDetalhes() {
        // Aqui eu exibo os detalhes do atendente
        System.out.println("Atendente: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataDeNascimento());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());
        System.out.println("Data de Contratação: " + getDataDeContratacao());
        System.out.println("Salário: " + getSalario());
        System.out.println("Número de Vendas: " + numeroDeVendas);
    }

    // Getters e setters para numeroDeVendas
    public int getNumeroDeVendas() {
        return numeroDeVendas; 
    }

    public void setNumeroDeVendas(int numeroDeVendas) {
        this.numeroDeVendas = numeroDeVendas;
    }
}

// Classe Gerente estende Funcionario
class Gerente extends Funcionario {
    private String setor;

    // Eu crio o construtor da classe Gerente, que chama o construtor da superclasse Funcionario
    public Gerente(String cpf, String nome, Date dataDeNascimento, String telefone, String email, Date dataDeContratacao, double salario, String setor) {
        super(cpf, nome, dataDeNascimento, telefone, email, dataDeContratacao, salario); // Chamo o construtor da superclasse
        this.setor = setor;
    }

    // Implementação do método abstrato mostrarDetalhes
    @Override
    public void mostrarDetalhes() {
        // Aqui eu exibo os detalhes do gerente
        System.out.println("Gerente: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataDeNascimento());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());
        System.out.println("Data de Contratação: " + getDataDeContratacao());
        System.out.println("Salário: " + getSalario());
        System.out.println("Setor: " + setor);
    }

    // Getters e setters para setor
    public String getSetor() {
        return setor; 
    }

    public void setSetor(String setor) {
        this.setor = setor; 
    }
}
