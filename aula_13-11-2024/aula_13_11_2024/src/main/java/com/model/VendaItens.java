package com.model;
public class VendaItens {
    
    private int id;
    private int quantidade;
    private double preco_produto;
    private double valor_total;
    private Venda venda;
    private Produto produto;
    
    public VendaItens(int id, int quantidade, double preco_produto, double valor_total, Venda venda, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.preco_produto = preco_produto;
        this.valor_total = valor_total;
        this.venda = venda;
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Venda getVenda() {
        return venda;
    }
    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getPreco_produto() {
        return preco_produto;
    }
    public void setPreco_produto(double preco_produto) {
        this.preco_produto = preco_produto;
    }
    public double getValor_total() {
        return valor_total;
    }
    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

}
