package com.controller;

import com.DAO.ClienteDAO;
import com.model.Cliente;

public class ClienteController {

    ClienteDAO clienteDAO = new ClienteDAO();

    public boolean salvar(Cliente cliente){
        System.out.println("Entrei no método salvar do cliente");
        return clienteDAO.salvar(cliente);
    }

    public boolean alterar(){
        System.out.println("Entrei no método alterar do cliente");
        return true;
    }

    public boolean excluir(){
        System.out.println("Entrei no método excluir do cliente");
        return true;
    }
}



