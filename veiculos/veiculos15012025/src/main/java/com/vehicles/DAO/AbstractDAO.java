package com.vehicles.DAO;

public class AbstractDAO {

    public boolean salvar() {

        System.out.println("Executou o método Salvar do DAO do Abstract");

        return true;
    }

    public boolean alterar() {
        System.out.println("Executou o método Alterar do DAO do Abstract");

        return true;
    }

    public boolean excluir() {
        System.out.println("Executou o método Excluir do DAO do Abstract");

        return true;
    }

    public boolean pesquisar() {
        System.out.println("Executou o método Pesquisar do DAO do Abstract");

        return true;
    }
}
