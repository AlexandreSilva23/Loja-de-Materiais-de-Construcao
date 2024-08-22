package com.minhaempresa.loja; // Definição do pacote que organiza a classe dentro de um namespace

import java.io.BufferedReader; // Importação necessária para leitura eficiente de arquivos
import java.io.BufferedWriter; // Importação necessária para escrita eficiente de arquivos
import java.io.FileReader; // Importação necessária para ler dados de arquivos
import java.io.FileWriter; // Importação necessária para escrever dados em arquivos
import java.io.IOException; // Importação necessária para tratar exceções de IO
import java.util.ArrayList; // Importação da classe para criar listas dinâmicas
import java.util.Date; // Importação da classe para manipulação de datas
import java.util.List; // Importação da interface que define listas

public class Main { // Classe principal que contém o método main, ponto de entrada do programa
    private static List<Produto> produtos = new ArrayList<>(); // Lista estática que armazena os produtos da loja
    
    public static void main(String[] args) { // Método principal onde a execução do programa começa
        List<Cliente> clientes = new ArrayList<>();

        // Aqui criei uma pequena base de dados apenas para testes e debugs, coloquei 20 produtos em cada setor (Materiais, Tintas & Ferramentas)       
        adicionarProduto(new Produto.Materiais(25.50, "58V25LB", new Date(), 100, "Cimento CP II", 50.0, 25.0, 10.0, 10.0));
        adicionarProduto(new Produto.Materiais(12.99, "58V26LB", new Date(), 200, "Areia Fina", 100.0, 0.0, 0.0, 0.0));
        adicionarProduto(new Produto.Materiais(17.90, "58V27LB", new Date(), 150, "Brita 1", 100.0, 0.0, 0.0, 0.0));
        adicionarProduto(new Produto.Materiais(45.00, "58V28LB", new Date(), 75, "Cal Hidratada", 40.0, 25.0, 15.0, 10.0));
        adicionarProduto(new Produto.Materiais(30.50, "58V29LB", new Date(), 50, "Tijolo 8 Furos", 20.0, 20.0, 20.0, 10.0));
        adicionarProduto(new Produto.Materiais(28.00, "58V30LB", new Date(), 120, "Bloco de Concreto", 40.0, 20.0, 20.0, 20.0));
        adicionarProduto(new Produto.Materiais(15.00, "58V31LB", new Date(), 300, "Tábua de Pinus", 200.0, 2.5, 30.0, 2.0));
        adicionarProduto(new Produto.Materiais(60.00, "58V32LB", new Date(), 60, "Viga de Aço", 600.0, 5.0, 15.0, 15.0));
        adicionarProduto(new Produto.Materiais(50.00, "58V33LB", new Date(), 80, "Tubo de PVC 100mm", 600.0, 10.0, 10.0, 2.0));
        adicionarProduto(new Produto.Materiais(70.00, "58V34LB", new Date(), 50, "Chapa de MDF", 244.0, 122.0, 15.0, 1.8));
        adicionarProduto(new Produto.Materiais(95.00, "58V35LB", new Date(), 40, "Telha de Fibrocimento", 110.0, 55.0, 0.0, 2.44));
        adicionarProduto(new Produto.Materiais(80.00, "58V36LB", new Date(), 35, "Porta de Madeira", 210.0, 90.0, 4.0, 1.5));
        adicionarProduto(new Produto.Materiais(120.00, "58V37LB", new Date(), 25, "Janela de Alumínio", 100.0, 120.0, 0.0, 2.0));
        adicionarProduto(new Produto.Materiais(180.00, "58V38LB", new Date(), 30, "Portão de Ferro", 300.0, 200.0, 0.0, 1.5));
        adicionarProduto(new Produto.Materiais(250.00, "58V39LB", new Date(), 15, "Escada de Alumínio", 400.0, 50.0, 10.0, 2.0));
        adicionarProduto(new Produto.Materiais(220.00, "58V40LB", new Date(), 10, "Caixa d'Água 1000L", 150.0, 50.0, 50.0, 1.5));
        adicionarProduto(new Produto.Materiais(15.00, "58V41LB", new Date(), 300, "Barra de Ferro 12mm", 6000.0, 12.0, 12.0, 12.0));
        adicionarProduto(new Produto.Materiais(17.00, "58V42LB", new Date(), 200, "Barra de Ferro 10mm", 6000.0, 10.0, 10.0, 10.0));
        adicionarProduto(new Produto.Materiais(10.00, "58V43LB", new Date(), 250, "Arame Recozido", 500.0, 0.0, 0.0, 0.0));
        adicionarProduto(new Produto.Materiais(5.00, "58V44LB", new Date(), 500, "Prego 15x15", 15.0, 0.0, 0.0, 0.0));

        // Aqui adiciono as tintas:        
        adicionarProduto(new Produto.Tintas(150.00, "59A01LB", new Date(), 30, "Branca", 18.0, "Fosco"));
        adicionarProduto(new Produto.Tintas(160.00, "59A02LB", new Date(), 25, "Azul", 18.0, "Brilhante"));
        adicionarProduto(new Produto.Tintas(155.00, "59A03LB", new Date(), 20, "Verde", 18.0, "Acetinado"));
        adicionarProduto(new Produto.Tintas(145.00, "59A04LB", new Date(), 35, "Amarela", 18.0, "Fosco"));
        adicionarProduto(new Produto.Tintas(170.00, "59A05LB", new Date(), 15, "Vermelha", 18.0, "Brilhante"));
        adicionarProduto(new Produto.Tintas(165.00, "59A06LB", new Date(), 18, "Cinza", 18.0, "Acetinado"));
        adicionarProduto(new Produto.Tintas(180.00, "59A07LB", new Date(), 12, "Preta", 18.0, "Fosco"));
        adicionarProduto(new Produto.Tintas(175.00, "59A08LB", new Date(), 10, "Branca", 18.0, "Brilhante"));
        adicionarProduto(new Produto.Tintas(190.00, "59A09LB", new Date(), 8, "Bege", 18.0, "Acetinado"));
        adicionarProduto(new Produto.Tintas(185.00, "59A10LB", new Date(), 7, "Marrom", 18.0, "Fosco"));
        adicionarProduto(new Produto.Tintas(200.00, "59A11LB", new Date(), 6, "Laranja", 18.0, "Brilhante"));
        adicionarProduto(new Produto.Tintas(195.00, "59A12LB", new Date(), 5, "Roxo", 18.0, "Acetinado"));
        adicionarProduto(new Produto.Tintas(210.00, "59A13LB", new Date(), 4, "Azul", 18.0, "Fosco"));
        adicionarProduto(new Produto.Tintas(205.00, "59A14LB", new Date(), 3, "Verde", 18.0, "Brilhante"));
        adicionarProduto(new Produto.Tintas(220.00, "59A15LB", new Date(), 2, "Amarela", 18.0, "Acetinado"));
        adicionarProduto(new Produto.Tintas(215.00, "59A16LB", new Date(), 1, "Vermelha", 18.0, "Fosco"));
        adicionarProduto(new Produto.Tintas(230.00, "59A17LB", new Date(), 2, "Cinza", 18.0, "Brilhante"));
        adicionarProduto(new Produto.Tintas(225.00, "59A18LB", new Date(), 3, "Preta", 18.0, "Acetinado"));
        adicionarProduto(new Produto.Tintas(240.00, "59A19LB", new Date(), 4, "Branca", 18.0, "Fosco"));
        adicionarProduto(new Produto.Tintas(235.00, "59A20LB", new Date(), 5, "Bege", 18.0, "Brilhante"));

        // E por fim as ferramentas: 
        adicionarProduto(new Produto.Ferramentas(250.00, "60B01LB", new Date(), 15, "Martelete", "Bosch"));
        adicionarProduto(new Produto.Ferramentas(300.00, "60B02LB", new Date(), 10, "Serra Circular", "DeWalt"));
        adicionarProduto(new Produto.Ferramentas(350.00, "60B03LB", new Date(), 8, "Parafusadeira", "Makita"));
        adicionarProduto(new Produto.Ferramentas(400.00, "60B04LB", new Date(), 12, "Furadeira", "Bosch"));
        adicionarProduto(new Produto.Ferramentas(450.00, "60B05LB", new Date(), 5, "Esmerilhadeira", "DeWalt"));
        adicionarProduto(new Produto.Ferramentas(500.00, "60B06LB", new Date(), 3, "Serra Tico-Tico", "Makita"));
        adicionarProduto(new Produto.Ferramentas(550.00, "60B07LB", new Date(), 7, "Lixadeira", "Bosch"));
        adicionarProduto(new Produto.Ferramentas(600.00, "60B08LB", new Date(), 6, "Pistola de Pintura", "DeWalt"));
        adicionarProduto(new Produto.Ferramentas(650.00, "60B09LB", new Date(), 2, "Cortadora de Piso", "Makita"));
        adicionarProduto(new Produto.Ferramentas(700.00, "60B10LB", new Date(), 4, "Soprador Térmico", "Bosch"));
        adicionarProduto(new Produto.Ferramentas(750.00, "60B11LB", new Date(), 1, "Serra Sabre", "DeWalt"));
        adicionarProduto(new Produto.Ferramentas(800.00, "60B12LB", new Date(), 3, "Chave de Impacto", "Makita"));
        adicionarProduto(new Produto.Ferramentas(850.00, "60B13LB", new Date(), 4, "Multiferramenta", "Bosch"));
        adicionarProduto(new Produto.Ferramentas(900.00, "60B14LB", new Date(), 2, "Plaina Elétrica", "DeWalt"));
        adicionarProduto(new Produto.Ferramentas(950.00, "60B15LB", new Date(), 3, "Serra de Mesa", "Makita"));
        adicionarProduto(new Produto.Ferramentas(1000.00, "60B16LB", new Date(), 1, "Aparador de Grama", "Bosch"));
        adicionarProduto(new Produto.Ferramentas(1050.00, "60B17LB", new Date(), 2, "Lavadora de Alta Pressão", "DeWalt"));
        adicionarProduto(new Produto.Ferramentas(1100.00, "60B18LB", new Date(), 1, "Gerador de Energia", "Makita"));
        adicionarProduto(new Produto.Ferramentas(1150.00, "60B19LB", new Date(), 1, "Compressor de Ar", "Bosch"));
        adicionarProduto(new Produto.Ferramentas(1200.00, "60B20LB", new Date(), 1, "Soldador Inversor", "DeWalt"));

        listarProdutos();

        removerProduto(produtos.get(0));
        System.out.println("\nApós a remoção do primeiro produto:");
        listarProdutos(); // Mostra a lista atualizada
    }
}
