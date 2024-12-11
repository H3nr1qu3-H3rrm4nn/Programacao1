package com.model;

public class Cidade {
    private int id;
    private String nome;
    private int codigoIBGE;
    private String uf;
    private String regiao;


    public Cidade(int id, String nome, int codigoIBGE, String uf, String regiao) {
        this.id = id;
        this.nome = nome;
        this.codigoIBGE = codigoIBGE;
        this.uf = uf;
        this.regiao = regiao;
    }
    public Cidade() {
        //TODO Auto-generated constructor stub
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
    public int getCodigoIBGE() {
        return codigoIBGE;
    }
    public void setCodigoIBGE(int codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getRegiao() {
        return regiao;
    }
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}
