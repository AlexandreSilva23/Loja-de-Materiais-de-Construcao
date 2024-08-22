package com.minhaempresa.loja; // Eu defino o pacote para organizar a classe dentro de um namespace

import java.util.Date; // Importação da classe Date para manipulação de datas

// Aqui eu defino a classe abstrata Produto, que serve como base para diferentes tipos de produtos
public abstract class Produto {
    private double preco; // Eu armazeno o preço do produto aqui
    private String lote; // Eu armazeno o lote do produto aqui
    private Date dataDeRecepcao; // Eu armazeno a data de recepção do produto aqui
    private int estoque; // Eu armazeno a quantidade de estoque do produto aqui

    // Eu crio o construtor da classe Produto, que inicializa os atributos quando um objeto é criado
    public Produto(double preco, String lote, Date dataDeRecepcao, int estoque) {
        this.preco = preco; // Inicializo o preço do produto
        this.lote = lote; // Inicializo o lote do produto
        this.dataDeRecepcao = dataDeRecepcao; // Inicializo a data de recepção do produto
        this.estoque = estoque; // Inicializo a quantidade de estoque do produto
    }

    // Este é o método abstrato mostrarDetalhes, que será implementado pelas subclasses
    public abstract void mostrarDetalhes();

    // Métodos getters e setters que permitem acessar e modificar os atributos do produto
    public double getPreco() {
        return preco; // Eu retorno o preço do produto
    }

    public void setPreco(double preco) {
        this.preco = preco; // Eu atualizo o preço do produto
    }

    public String getLote() {
        return lote; // Eu retorno o lote do produto
    }

    public void setLote(String lote) {
        this.lote = lote; // Eu atualizo o lote do produto
    }

    public Date getDataDeRecepcao() {
        return dataDeRecepcao; // Eu retorno a data de recepção do produto
    }

    public void setDataDeRecepcao(Date dataDeRecepcao) {
        this.dataDeRecepcao = dataDeRecepcao; // Eu atualizo a data de recepção do produto
    }

    public int getEstoque() {
        return estoque; // Eu retorno a quantidade de estoque do produto
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque; // Eu atualizo a quantidade de estoque do produto
    }

    // Aqui eu defino a classe Materiais, que estende Produto
    public static class Materiais extends Produto {
        private double peso; // Eu armazeno o peso do material aqui
        private double comprimento; // Eu armazeno o comprimento do material aqui
        private double largura; // Eu armazeno a largura do material aqui
        private double altura; // Eu armazeno a altura do material aqui

        // Eu crio o construtor da classe Materiais, que chama o construtor da superclasse Produto
        public Materiais(double preco, String lote, Date dataDeRecepcao, int estoque, String descricao, double peso, double comprimento, double largura, double altura) {
            super(preco, lote, dataDeRecepcao, estoque); // Chamo o construtor da superclasse
            this.peso = peso; // Inicializo o peso do material
            this.comprimento = comprimento; // Inicializo o comprimento do material
            this.largura = largura; // Inicializo a largura do material
            this.altura = altura; // Inicializo a altura do material
        }

        // Implementação do método abstrato mostrarDetalhes
        @Override
        public void mostrarDetalhes() {
            // Aqui eu exibo os detalhes do material
            System.out.println("Material:");
            System.out.println("Preço: R$" + getPreco());
            System.out.println("Lote: " + getLote());
            System.out.println("Data de Recepção: " + getDataDeRecepcao());
            System.out.println("Estoque: " + getEstoque());
            System.out.println("Peso: " + peso);
            System.out.println("Comprimento: " + comprimento);
            System.out.println("Largura: " + largura);
            System.out.println("Altura: " + altura);
        }
    }

    // Aqui eu defino a classe Tintas, que estende Produto
    public static class Tintas extends Produto {
        private double volume; // Eu armazeno o volume da tinta aqui
        private String aspecto; // Eu armazeno o tipo de aspecto da tinta aqui

        // Eu crio o construtor da classe Tintas, que chama o construtor da superclasse Produto
        public Tintas(double preco, String lote, Date dataDeRecepcao, int estoque, String descricao, double volume, String aspecto) {
            super(preco, lote, dataDeRecepcao, estoque); // Chamo o construtor da superclasse
            this.volume = volume; // Inicializo o volume da tinta
            this.aspecto = aspecto; // Inicializo o aspecto da tinta
        }

        // Implementação do método abstrato mostrarDetalhes
        @Override
        public void mostrarDetalhes() {
            // Aqui eu exibo os detalhes da tinta
            System.out.println("Tinta:");
            System.out.println("Preço: R$" + getPreco());
            System.out.println("Lote: " + getLote());
            System.out.println("Data de Recepção: " + getDataDeRecepcao());
            System.out.println("Estoque: " + getEstoque());
            System.out.println("Volume: " + volume + "L");
            System.out.println("Aspecto: " + aspecto);
        }
    }

    // Aqui eu defino a classe Ferramentas, que estende Produto
    public static class Ferramentas extends Produto {
        private String marca; // Eu armazeno a marca da ferramenta aqui

        // Eu crio o construtor da classe Ferramentas, que chama o construtor da superclasse Produto
        public Ferramentas(double preco, String lote, Date dataDeRecepcao, int estoque, String descricao, String marca) {
            super(preco, lote, dataDeRecepcao, estoque); // Chamo o construtor da superclasse
            this.marca = marca; // Inicializo a marca da ferramenta
        }

        // Implementação do método abstrato mostrarDetalhes
        @Override
        public void mostrarDetalhes() {
            // Aqui eu exibo os detalhes da ferramenta
            System.out.println("Ferramenta:");
            System.out.println("Preço: R$" + getPreco());
            System.out.println("Lote: " + getLote());
            System.out.println("Data de Recepção: " + getDataDeRecepcao());
            System.out.println("Estoque: " + getEstoque());
            System.out.println("Marca: " + marca);
        }
    }
}
