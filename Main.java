package com.minhaempresa.loja; // Definição do pacote que organiza a classe dentro de um namespace

import java.io.BufferedReader; // Importação necessária para leitura eficiente de arquivos
import java.io.BufferedWriter; // Importação necessária para escrita eficiente de arquivos
import java.io.FileReader; // Importação necessária para ler dados de arquivos
import java.io.FileWriter; // Importação necessária para escrever dados em arquivos
import java.io.IOException; // Importação necessária para tratar exceções de IO
import java.util.ArrayList; // Importação da classe para criar listas dinâmicas
import java.util.Date; // Importação da classe para manipulação de datas
import java.util.List; // Importação da interface que define listas

public class Main { 
    private static List<Produto> produtos = new ArrayList<>(); // Lista estática que armazena os produtos da loja
    
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        // Aqui apenas criei uma pequena base de dados para testes e debugs...      
        adicionarProduto(new Produto.Materiais(25.50, "58V25LB", new Date(), 100, "Cimento CP II", 50.0, 25.0, 10.0, 10.0));
        adicionarProduto(new Produto.Materiais(12.99, "58V26LB", new Date(), 200, "Areia Fina", 100.0, 0.0, 0.0, 0.0));
        adicionarProduto(new Produto.Materiais(17.90, "58V27LB", new Date(), 150, "Brita 1", 100.0, 0.0, 0.0, 0.0));
        adicionarProduto(new Produto.Materiais(45.00, "58V28LB", new Date(), 75, "Cal Hidratada", 40.0, 25.0, 15.0, 10.0));
        adicionarProduto(new Produto.Materiais(30.50, "58V29LB", new Date(), 50, "Tijolo 8 Furos", 20.0, 20.0, 20.0, 10.0));

        // Aqui adiciono as tintas:        
        adicionarProduto(new Produto.Tintas(150.00, "59A01LB", new Date(), 30, "Branca", 18.0, "Fosco"));
        adicionarProduto(new Produto.Tintas(160.00, "59A02LB", new Date(), 25, "Azul", 18.0, "Brilhante"));
        adicionarProduto(new Produto.Tintas(155.00, "59A03LB", new Date(), 20, "Verde", 18.0, "Acetinado"));
        adicionarProduto(new Produto.Tintas(145.00, "59A04LB", new Date(), 35, "Amarela", 18.0, "Fosco"));
        adicionarProduto(new Produto.Tintas(170.00, "59A05LB", new Date(), 15, "Vermelha", 18.0, "Brilhante"));

        // E por fim as ferramentas: 
        adicionarProduto(new Produto.Ferramentas(250.00, "60B01LB", new Date(), 15, "Martelete", "Bosch"));
        adicionarProduto(new Produto.Ferramentas(300.00, "60B02LB", new Date(), 10, "Serra Circular", "DeWalt"));
        adicionarProduto(new Produto.Ferramentas(350.00, "60B03LB", new Date(), 8, "Parafusadeira", "Makita"));
        adicionarProduto(new Produto.Ferramentas(400.00, "60B04LB", new Date(), 12, "Furadeira", "Bosch"));
        adicionarProduto(new Produto.Ferramentas(450.00, "60B05LB", new Date(), 5, "Esmerilhadeira", "DeWalt"));

        listarProdutos();

        removerProduto(produtos.get(0));
        System.out.println("\nApós a remoção do primeiro produto:");
        listarProdutos(); // Mostra a lista atualizada

        mostrarDetalhes(Tintas);
        mostrarDetalhes(Ferramentas);
        mostrarDetalhes(Cliente);
        mostrarDetalhes(Atendente);
        
    }
}
