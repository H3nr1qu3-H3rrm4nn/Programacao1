import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class TelaCliente {

    public static void main(String[] args) {
        
        JFrame tela = new JFrame("Homepage");
        JPanel panel = new JPanel();

        tela.setSize(800, 400);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.add(panel);
        
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);

        JLabel lblNome = new JLabel("Nome");
        lblNome.setBounds(10,10,150,25);
        panel.add(lblNome);

        JTextField txtNome= new JTextField();
        txtNome.setBounds(10,30,150,25);
        panel.add(txtNome);


        JLabel lblCpf = new JLabel("Cpf");
        lblCpf.setBounds(10,60,150,25);
        panel.add(lblCpf);

        JTextField txtCpf = new JTextField();
        txtCpf.setBounds(10,80,150,25);
        panel.add(txtCpf);


        JLabel lblRg = new JLabel("Rg");
        lblRg.setBounds(10,110,150,25);
        panel.add(lblRg);

        JTextField txtRg= new JTextField();
        txtRg.setBounds(10,130,150,25);
        panel.add(txtRg);


        JLabel lblEndereco = new JLabel("Endereco");
        lblEndereco.setBounds(10,160,150,25);
        panel.add(lblEndereco);

        JTextField txtEndereco= new JTextField();
        txtEndereco.setBounds(10,180,150,25);
        panel.add(txtEndereco);


        JLabel lblTelefone = new JLabel("Telefone");
        lblTelefone.setBounds(10,210,150,25);
        panel.add(lblTelefone);

        JTextField txtTelefone= new JTextField();
        txtTelefone.setBounds(10,230,150,25);
        panel.add(txtTelefone);


        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(10,300,150,25);
        btnSalvar.setToolTipText("Clique para salvar");
        panel.add(btnSalvar);

        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(400,300,150,25);
        btnSalvar.setToolTipText("Clique para exluir");
        panel.add(btnExcluir);

        btnSalvar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){
                Cliente cliente = new Cliente();
                cliente.setNome(txtNome.getText());
                cliente.setEndereco(txtEndereco.getText());
                cliente.setTelefone(txtTelefone.getText());
                geraArquivo(cliente);
            }
        });

        btnExcluir.addActionListener(new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e){
                excluiArquivo();
            }
        });

        


        tela.setVisible(true);

    }

    private static void geraArquivo(Cliente cliente){
        String caminhoArquivo = "prog1.txt";
        File arquivo = new File(caminhoArquivo);

        try  (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo,true)))
        {
                writer.write("Nome: " + cliente.getNome() + "\n");
                writer.write("Endereço: " + cliente.getEndereco() + "\n");
                writer.write("Telefone: " + cliente.getTelefone() + "\n");
                JOptionPane.showMessageDialog(null, "Arquivo criado", "Arquivo",1);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar dados", "Erro", 0);
            e.printStackTrace();
        }



    }
    
    private static void excluiArquivo(){
        String caminhoArquivo = "prog1.txt";

        File arquivo = new File(caminhoArquivo);

        if (arquivo.delete()) {
            JOptionPane.showMessageDialog(null, "Arquivo Excluido", "Arquivo", 1);
        } else{
            JOptionPane.showMessageDialog(null, "Erro ao exluir arquivo.", "Erro", 0);
        }
    }
}


