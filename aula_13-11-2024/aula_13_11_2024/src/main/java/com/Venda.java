package com;
import java.util.Date;

public class Venda {
    private int id;
    private Date data_venda;
    private double valor_total_venda;

    
    public Venda(int id, Date data_venda, double valor_total_venda) {
        this.id = id;
        this.data_venda = data_venda;
        this.valor_total_venda = valor_total_venda;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getData_venda() {
        return data_venda;
    }
    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }
    public double getValor_total_venda() {
        return valor_total_venda;
    }
    public void setValor_total_venda(double valor_total_venda) {
        this.valor_total_venda = valor_total_venda;
    }
    public Venda salvarVenda(int id,Date data_venda, Double valor_total_venda){

        Venda venda = new Venda(id, data_venda, valor_total_venda);

        venda.setId(id);
        venda.setData_venda(data_venda);
        venda.setValor_total_venda(valor_total_venda);
    ;
        System.out.println(venda);
        return venda;
    }

    public boolean alterarVenda(Venda venda){
        
        venda.setId(id);
        venda.setData_venda(data_venda);
        venda.setValor_total_venda(valor_total_venda);
        System.out.println(venda);

        return true;
    }

    public boolean excluirVenda(Venda venda){

        venda = null;
        System.out.println(venda);

        return true;
    }

    public boolean pesquisarVenda(Venda venda){

        System.out.println(venda.getId());
        System.out.println(venda.getData_venda());
        System.out.println(venda.getValor_total_venda());

        return true;
    }
}
