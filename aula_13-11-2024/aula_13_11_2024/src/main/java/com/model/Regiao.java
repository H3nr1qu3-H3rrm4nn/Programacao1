package com.model;

public class Regiao {
    private int id;
    private String nome;
    private Pais pais;

    
    public Regiao(int id, String nome, Pais pais) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
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
    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
