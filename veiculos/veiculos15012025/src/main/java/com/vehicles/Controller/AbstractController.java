package com.vehicles.Controller;

import com.vehicles.DAO.AbstractDAO;

public class AbstractController {

    AbstractDAO abstractDAO = new AbstractDAO();

    public boolean salvar() {

        System.out.println("Executou o método Salvar do Controller do Abstract");
        abstractDAO.salvar();
        return true;

    }

    public boolean alterar() {

        System.out.println("Executou o método Alterar do Controller do Abstract");
        abstractDAO.alterar();
        return true;

    }

    public boolean excluir() {
        System.out.println("Executou o método Excluir do Controller do Abstract");
        abstractDAO.excluir();
        return true;

    }

    public boolean pesquisar() {
        System.out.println("Executou o método Pesquisar do Controller do Abstract");
        abstractDAO.pesquisar();
        return true;

    }
}
