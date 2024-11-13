package com;
public class VendaItens {
    
    private int id;
    private int quantidade;
    private double preco_produto;
    private double valor_total;

    

    public VendaItens(int id, int quantidade, double preco_produto, double valor_total) {
        this.id = id;
        this.quantidade = quantidade;
        this.preco_produto = preco_produto;
        this.valor_total = valor_total;
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
    public VendaItens salvarVendaItens(int id, int quantidade, double preco_produto, double valor_total){

        VendaItens vendaItens = new VendaItens(id, quantidade, preco_produto, valor_total);

        vendaItens.setId(id);
        vendaItens.setQuantidade(quantidade);
        vendaItens.setPreco_produto(preco_produto);
        vendaItens.setValor_total(valor_total);

        System.out.println(vendaItens);
        return vendaItens;
    }

    public boolean alterarVendaItens(VendaItens vendaItens, int quantidade, double preco_produto, double valor_total){
        
        vendaItens.setQuantidade(quantidade);
        vendaItens.setPreco_produto(preco_produto);
        vendaItens.setValor_total(valor_total);
        System.out.println(vendaItens);

        return true;
    }

    public boolean excluirVendaItens(VendaItens vendaItens){

        vendaItens = null;
        System.out.println(vendaItens);

        return true;
    }

    public boolean pesquisarVendaItens(VendaItens vendaItens){

        System.out.println(vendaItens.getId());
        System.out.println(vendaItens.getQuantidade());
        System.out.println(vendaItens.getPreco_produto());
        System.out.println(vendaItens.getValor_total());

        return true;
    }
}
