package com.DAO;

import com.model.Cliente;

public class ClienteDAO {

    public boolean salvar(Cliente cliente){

        System.out.println("Eu salvei o cliente "+ cliente.getNome()); 
        return true;
    }
    public void alterar(){
        System.out.println("Executei o método alterar do DAO");
    }
    public void excluir(){
        System.out.println("Executei o método excluir do DAO");    
    }
}
