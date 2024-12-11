package com.model;
public class Vendedor {
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private int matricula;

    

    public Vendedor(int id, String nome, String cpf, String rg, String telefone, int matricula) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.matricula = matricula;
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
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Vendedor salvarVendedor(int id,String nome, String cpf, String rg, String telefone, int matricula){

        Vendedor vendedor = new Vendedor(id, nome, cpf, rg, telefone, matricula);

        vendedor.setId(id);
        vendedor.setCpf(cpf);
        vendedor.setNome(nome);
        vendedor.setRg(rg);
        vendedor.setTelefone(telefone);
        vendedor.setMatricula(matricula);
        System.out.println(vendedor);
        return vendedor;
    }

    public boolean alterarVendedor(Vendedor vendedor, String cpf, String nome, String rg, String telefone, int matricula){
        
        vendedor.setId(id);
        vendedor.setCpf(cpf);
        vendedor.setNome(nome);
        vendedor.setRg(rg);
        vendedor.setTelefone(telefone);
        vendedor.setMatricula(matricula);
        System.out.println(vendedor);

        return true;
    }

    public boolean excluirVendedor(Vendedor vendedor){

        vendedor = null;
        System.out.println(vendedor);

        return true;
    }

    public boolean pesquisarVendedor(Vendedor vendedor){

        System.out.println(vendedor.getId());
        System.out.println(vendedor.getCpf());
        System.out.println(vendedor.getNome());
        System.out.println(vendedor.getRg());
        System.out.println(vendedor.getTelefone());
        System.out.println(vendedor.getMatricula());

        return true;
    }
}
