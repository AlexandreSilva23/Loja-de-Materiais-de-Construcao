package com.minhaempresa.loja; // Eu defino o pacote para organizar a classe dentro de um namespace

import java.util.Date; // Importação da classe Date para manipulação de datas

// Aqui eu defino a classe abstrata Produto, que serve como base para diferentes tipos de produtos
public abstract class Produto {
    private double preco;
    private String lote;
    private String descricao; 
    private Date dataDeRecepcao; 
    private int estoque; 

    // Crio o construtor da classe Produto, que inicializa os atributos quando um objeto é criado
    public Produto(double preco, String lote, Date dataDeRecepcao, String descricao, int estoque) {
        this.preco = preco;
        this.lote = lote; 
        this.dataDeRecepcao = dataDeRecepcao; 
        this.estoque = estoque;
    }

    // Este é o método abstrato mostrarDetalhes, que será implementado pelas subclasses
    public abstract void mostrarDetalhes();

    // Métodos getters e setters que permitem acessar e modificar os atributos do produto
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Date getDataDeRecepcao() {
        return dataDeRecepcao;
    }

    public void setDataDeRecepcao(Date dataDeRecepcao) {
        this.dataDeRecepcao = dataDeRecepcao; 
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    // Aqui eu defino a classe Materiais, que estende Produto
    public static class Materiais extends Produto {
        private double peso;
        private double comprimento; 
        private double largura; 
        private double altura; 

        // Eu crio o construtor da classe Materiais, que chama o construtor da superclasse Produto
        public Materiais(double preco, String lote, Date dataDeRecepcao, int estoque, String descricao, double peso, double comprimento, double largura, double altura) {
            super(preco, lote, dataDeRecepcao, estoque); // Chamo o construtor da superclasse
            this.peso = peso;
            this.comprimento = comprimento;
            this.largura = largura; 
            this.altura = altura; 
        }

        // Implementação do método abstrato mostrarDetalhes
        @Override
        public void mostrarDetalhes() {
            // Aqui eu exibo os detalhes do material, ele 
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
        private double volume; 
        private String aspecto; 

        // Eu crio o construtor da classe Tintas, que chama o construtor da superclasse Produto
        public Tintas(double preco, String lote, Date dataDeRecepcao, int estoque, String descricao, double volume, String aspecto) {
            super(preco, lote, dataDeRecepcao, estoque); // Chamo o construtor da superclasse
            this.volume = volume; 
            this.aspecto = aspecto; 
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
        private String marca; 

        // Eu crio o construtor da classe Ferramentas, que chama o construtor da superclasse Produto
        public Ferramentas(double preco, String lote, Date dataDeRecepcao, int estoque, String descricao, String marca) {
            super(preco, lote, dataDeRecepcao, estoque); // Chamo o construtor da superclasse
            this.marca = marca; 
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

    public static void adicionarProduto(Produto produto) { // Método que adiciona um produto à lista de produtos
        produtos.add(produto); // Adiciona o produto à lista
        System.out.println("Produto adicionado: " + produto.getClass().getSimpleName()); // Informa qual tipo de produto foi adicionado
    }

    public static void removerProduto(Produto produto) { // Método que remove um produto da lista de produtos
        if (produtos.remove(produto)) { // Tenta remover o produto da lista
            System.out.println("Produto removido: " + produto.getClass().getSimpleName()); // Informa qual tipo de produto foi removido
        } else {
            System.out.println("Produto não encontrado."); // Informa se o produto não foi encontrado na lista
        }
    }

    public static void listarProdutos() { // Método que lista todos os produtos da lista
        for (Produto produto : produtos) { // Itera sobre cada produto na lista
            produto.mostrarDetalhes(); // Exibe os detalhes do produto
            System.out.println("---------"); // Separa os produtos com um divisor para melhor legibilidade
        }
    }
    
    public static void gerarRelatorioEstoque() { // Método que gera um relatório de estoque
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("relatorio_estoque.txt"))) { 
            // Tenta abrir um arquivo para escrita e usa BufferedWriter para escrever eficientemente
            for (Produto produto : produtos) { // Itera sobre todos os produtos na lista
                writer.write("Produto: " + produto.getClass().getSimpleName() + "\n"); // Escreve o tipo de produto no arquivo
                writer.write("Estoque: " + produto.getEstoque() + "\n"); // Escreve o estoque do produto no arquivo
                writer.write("---------\n"); // Adiciona um divisor para separar os registros
            }
            System.out.println("Relatório de estoque gerado com sucesso."); // Informa que o relatório foi gerado com sucesso
        } catch (IOException e) { // Captura e trata qualquer exceção de IO que possa ocorrer
            System.out.println("Erro ao gerar relatório: " + e.getMessage()); // Informa se ocorreu um erro ao gerar o relatório
        }
    }
    
    public static void atualizarEstoque(String arquivoCSV) { // Método que atualiza o estoque com base em um arquivo CSV
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoCSV))) { 
            // Tenta abrir o arquivo CSV para leitura
            String linha;
            while ((linha = reader.readLine()) != null) { // Lê cada linha do arquivo CSV
                String[] dados = linha.split(","); // Divide a linha em partes usando a vírgula como separador
                String lote = dados[0]; // Obtém o lote do produto
                int novoEstoque = Integer.parseInt(dados[1]); // Converte o valor de estoque para um inteiro

                for (Produto produto : produtos) { // Itera sobre os produtos para encontrar o produto correspondente ao lote
                    if (produto.getLote().equals(lote)) { // Compara o lote do produto
                        produto.setEstoque(novoEstoque); // Atualiza o estoque do produto
                        break; // Encerra o loop ao encontrar o produto correto
                    }
                }
            }
            System.out.println("Estoque atualizado com sucesso."); // Informa que o estoque foi atualizado com sucesso
        } catch (IOException e) { // Captura e trata qualquer exceção de IO que possa ocorrer
            System.out.println("Erro ao atualizar estoque: " + e.getMessage()); // Informa se ocorreu um erro ao atualizar o estoque
        } catch (NumberFormatException e) {
        System.err.println("Erro ao formatar número no arquivo: " + e.getMessage());        
        }    
    }

    // Método para aplicar mudança de preço com valor fixo
    public void mudancaDePreco(double valor) {
        this.preco += valor;
        System.out.println("Preço atualizado para: " + preco);
    }

    // Método para aplicar mudança de preço com porcentagem
    public void mudancaDePreco(double porcentagem, boolean aumentar) {
        if (aumentar) {
            this.preco += this.preco * (porcentagem / 100);
        } else {
            this.preco -= this.preco * (porcentagem / 100);
        }
        System.out.println("Preço atualizado para: " + preco);
    }   
}
