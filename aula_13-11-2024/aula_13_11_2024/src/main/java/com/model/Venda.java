package com.model;
import java.time.LocalDate;
import java.util.List;


public class Venda {
    
    private int id;
    private LocalDate data_venda;
    private double valor_total_venda;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<VendaItens> venda_itens;

    public Venda(int id, LocalDate data_venda, double valor_total_venda, Cliente cliente, Vendedor vendedor,
            List<VendaItens> venda_itens) {
        this.id = id;
        this.data_venda = data_venda;
        this.valor_total_venda = valor_total_venda;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.venda_itens = venda_itens;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getData_venda() {
        return data_venda;
    }
    public void setData_venda(LocalDate data_venda) {
        this.data_venda = data_venda;
    }
    public double getValor_total_venda() {
        return valor_total_venda;
    }
    public void setValor_total_venda(double valor_total_venda) {
        this.valor_total_venda = valor_total_venda;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Vendedor getVendedor() {
        return vendedor;
    }
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    public List<VendaItens> getVenda_itens() {
        return venda_itens;
    }
    public void setVenda_itens(List<VendaItens> venda_itens) {
        this.venda_itens = venda_itens;
    }


}
