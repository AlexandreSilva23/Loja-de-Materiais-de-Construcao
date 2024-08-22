package com.minhaempresa.loja; // Eu declaro o pacote para organizar a classe dentro de um 'namespace'

// Aqui eu defino a classe abstrata Pessoa, que serve como base para outras classes como Cliente, Funcionário, etc.
public abstract class Pessoa {
    private String cpf; // Este é o atributo que armazena o CPF da pessoa
    private String nome; // Aqui eu guardo o nome da pessoa
    private Date dataDeNascimento; // A data de nascimento da pessoa é armazenada neste atributo
    private String telefone; // O telefone da pessoa é mantido neste atributo

    // Este é o construtor da classe Pessoa, onde eu inicializo os atributos quando um objeto é criado
    public Pessoa(String cpf, String nome, Date dataDeNascimento, String telefone) {
        this.cpf = cpf; // Inicializo o CPF da pessoa
        this.nome = nome; // Inicializo o nome da pessoa
        this.dataDeNascimento = dataDeNascimento; // Inicializo a data de nascimento da pessoa
        this.telefone = telefone; // Inicializo o telefone da pessoa
    }

    // Aqui eu defino um método abstrato que será implementado pelas subclasses
    public abstract void mostrarDetalhes();

    // Métodos getters e setters, que permitem acessar e modificar os atributos da pessoa
    public String getCpf() {
        return cpf; // Eu retorno o CPF da pessoa
    }

    public void setCpf(String cpf) {
        this.cpf = cpf; // Eu atualizo o CPF da pessoa
    }

    public String getNome() {
        return nome; // Eu retorno o nome da pessoa
    }

    public void setNome(String nome) {
        this.nome = nome; // Eu atualizo o nome da pessoa
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento; // Eu retorno a data de nascimento da pessoa
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento; // Eu atualizo a data de nascimento da pessoa
    }

    public String getTelefone() {
        return telefone; // Eu retorno o telefone da pessoa
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone; // Eu atualizo o telefone da pessoa
    }
}

// Abaixo, eu defino as subclasses Cliente, Funcionario, Atendente, e Gerente, cada uma estendendo a classe Pessoa

// Classe Cliente estende Pessoa
class Cliente extends Pessoa {
    private String endereco; // Eu armazeno o endereço do cliente aqui
    private String email; // Aqui eu guardo o email do cliente

    // Eu crio o construtor da classe Cliente, que chama o construtor da superclasse Pessoa
    public Cliente(String cpf, String nome, Date dataDeNascimento, String telefone, String endereco, String email) {
        super(cpf, nome, dataDeNascimento, telefone); // Chamo o construtor da superclasse
        this.endereco = endereco; // Inicializo o endereço do cliente
        this.email = email; // Inicializo o email do cliente
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
        return endereco; // Eu retorno o endereço do cliente
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco; // Eu atualizo o endereço do cliente
    }

    public String getEmail() {
        return email; // Eu retorno o email do cliente
    }

    public void setEmail(String email) {
        this.email = email; // Eu atualizo o email do cliente
    }
}

// Classe Funcionario estende Pessoa
class Funcionario extends Pessoa {
    private String email; // Eu armazeno o email do funcionário aqui
    private Date dataDeContratacao; // Aqui eu guardo a data de contratação do funcionário
    private double salario; // Eu armazeno o salário do funcionário aqui

    // Eu crio o construtor da classe Funcionario, que chama o construtor da superclasse Pessoa
    public Funcionario(String cpf, String nome, Date dataDeNascimento, String telefone, String email, Date dataDeContratacao, double salario) {
        super(cpf, nome, dataDeNascimento, telefone); // Chamo o construtor da superclasse
        this.email = email; // Inicializo o email do funcionário
        this.dataDeContratacao = dataDeContratacao; // Inicializo a data de contratação do funcionário
        this.salario = salario; // Inicializo o salário do funcionário
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
        return email; // Eu retorno o email do funcionário
    }

    public void setEmail(String email) {
        this.email = email; // Eu atualizo o email do funcionário
    }

    public Date getDataDeContratacao() {
        return dataDeContratacao; // Eu retorno a data de contratação do funcionário
    }

    public void setDataDeContratacao(Date dataDeContratacao) {
        this.dataDeContratacao = dataDeContratacao; // Eu atualizo a data de contratação do funcionário
    }

    public double getSalario() {
        return salario; // Eu retorno o salário do funcionário
    }

    public void setSalario(double salario) {
        this.salario = salario; // Eu atualizo o salário do funcionário
    }
}

// Classe Atendente estende Funcionario
class Atendente extends Funcionario {
    private int numeroDeVendas; // Eu armazeno o número de vendas do atendente aqui

    // Eu crio o construtor da classe Atendente, que chama o construtor da superclasse Funcionario
    public Atendente(String cpf, String nome, Date dataDeNascimento, String telefone, String email, Date dataDeContratacao, double salario, int numeroDeVendas) {
        super(cpf, nome, dataDeNascimento, telefone, email, dataDeContratacao, salario); // Chamo o construtor da superclasse
        this.numeroDeVendas = numeroDeVendas; // Inicializo o número de vendas do atendente
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
        return numeroDeVendas; // Eu retorno o número de vendas do atendente
    }

    public void setNumeroDeVendas(int numeroDeVendas) {
        this.numeroDeVendas = numeroDeVendas; // Eu atualizo o número de vendas do atendente
    }
}

// Classe Gerente estende Funcionario
class Gerente extends Funcionario {
    private String setor; // Eu armazeno o setor do gerente aqui

    // Eu crio o construtor da classe Gerente, que chama o construtor da superclasse Funcionario
    public Gerente(String cpf, String nome, Date dataDeNascimento, String telefone, String email, Date dataDeContratacao, double salario, String setor) {
        super(cpf, nome, dataDeNascimento, telefone, email, dataDeContratacao, salario); // Chamo o construtor da superclasse
        this.setor = setor; // Inicializo o setor do gerente
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
        return setor; // Eu retorno o setor do gerente
    }

    public void setSetor(String setor) {
        this.setor = setor; // Eu atualizo o setor do gerente
    }
}
