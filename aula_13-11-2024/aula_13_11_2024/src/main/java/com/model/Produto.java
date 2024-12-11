package com.model;
public class Produto {
    
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    
    public Produto(int id, String nome, double preco, int quantidadeEstoque, String fornecedor) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Produto salvarProduto(int id,String nome, String cpf, String rg, String telefone, int matricula){

        Produto produto = new Produto(id, nome, preco, quantidadeEstoque, telefone);

        produto.setId(id);
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidadeEstoque(quantidadeEstoque);
        System.out.println(produto);
        return produto;
    }

    public boolean alterarProduto(Produto produto, String cpf, String nome, String rg, String telefone, int matricula){
        
        produto.setId(id);
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidadeEstoque(quantidadeEstoque);

        System.out.println(produto);

        return true;
    }

    public boolean excluirProduto(Produto produto){

        produto = null;
        System.out.println(produto);

        return true;
    }

    public boolean pesquisarProduto(Produto produto){

        System.out.println(produto.getId());
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.getQuantidadeEstoque());

        return true;
    }
}