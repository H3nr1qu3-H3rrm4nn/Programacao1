package com.DAO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.model.Cliente;

public class ClienteDAO {

    public boolean salvar(Cliente cliente){

        System.out.println("Eu salvei o cliente "+ cliente.getNome()); 
        geraArquivo(cliente);
        return true;
    }
    public void alterar(){
        System.out.println("Executei o método alterar do DAO");
    }
    public void excluir(){
        System.out.println("Executei o método excluir do DAO");    
    }
    

    private static void geraArquivo(Cliente cliente){
        String caminhoArquivo = "prog1.txt";

        File arquivo = new File(caminhoArquivo);

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(arquivo, true))){
            writer.write("Nome: "+ cliente.getNome()+"\n");
            writer.write("Endereço: "+ cliente.getEndereco() +"\n");
            writer.write("CPF: "+ cliente.getCpf() + "\n");
            writer.write("RG: "+ cliente.getRg()+ "\n");
            JOptionPane.showMessageDialog(null,
                    "Dados do cliente "+ cliente.getNome() + " gravando com sucesso","Arquivo",1);
            } catch (IOException e){
                JOptionPane.showMessageDialog(null,
                    "Erro ao gravar dados.",
                    "Erro",
                    0);
                e.printStackTrace();
            }
        
    }
}
