import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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

        btnSalvar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){

                
               
               JOptionPane.showMessageDialog(btnSalvar, "Informações Salvas!", "Teste de clique do botão", 1);
        }

        });


        tela.setVisible(true);

    }

}
