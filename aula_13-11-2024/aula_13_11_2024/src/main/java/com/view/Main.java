package com.view;

import com.model.Cliente;
import com.controller.ClienteController;
import com.model.Cidade;
import com.model.UF;
import com.model.Regiao;
import com.model.Pais;

public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente(0, null, null, null, null, null);
       cliente.setNome("Flávio Vilela");
       cliente.setCpf("123456789");
       cliente.setEndereco("Rua XYZ");
       cliente.setRg("445566");
       cliente.setTelefone("64-9999-8888");

       Pais pais = new Pais(0, null);
       pais.setId(1);
       pais.setNome("Brasil");
       
       Regiao regiao = new Regiao(0, null, null);
       regiao.setId(1);
       regiao.setNome("Centro-Oeste");

       UF uf = new UF(0, null);
       uf.setId(1);
       uf.setNome("Goiás");

       Cidade cidade = new Cidade();
       cidade.setId(0);
       cidade.setCodigoIBGE(5888);   

       ClienteController clienteController = new ClienteController();
       clienteController.salvar(cliente);
    }

    
}