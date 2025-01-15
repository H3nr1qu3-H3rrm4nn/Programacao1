package com.vehicles.Model;

public class Veiculo {
    private String nome;
    private int ano;
    private int modelo;
    private String cor;
    private String placa;
    private boolean unico_dono;
    private Categoria categoria;
    private Garagem garagem;
    
    public Veiculo() {
    }

    public Veiculo(String nome, int ano, int modelo, String cor, String placa, boolean unico_dono) {
        this.nome = nome;
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.unico_dono = unico_dono;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public boolean isUnico_dono() {
        return unico_dono;
    }
    public void setUnico_dono(boolean unico_dono) {
        this.unico_dono = unico_dono;
    }
}
