import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame implements ActionListener {
    public Screen() {

        setVisible(true); //mostra na tela
        setSize(800,500); //tamanho da tela
        setTitle("Teste"); //título da tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ao fechar a tela o código para automaticamente 
        setResizable(false); //impossibilita a modificação do tamanho da tela
        setLocationRelativeTo(null);
        setLayout(null); // anula todos os valores 

        JButton jButton = new JButton("If want yes"); 
        jButton.setBounds(100,200,250,70); // tamanho
        jButton.setFont(new Font("Arial", Font.PLAIN, 40)); 
        jButton.setForeground(new Color(10,10,10)); // letra
        jButton.setBackground(new Color(33, 82, 234)); //fundo

        add(jButton);

        jButton.addActionListener(this);


    }

    @Override // a lista de execuções 
    public void actionPerformed(ActionEvent e) {

        String marca = JOptionPane.showInputDialog("Entre com a marca do carro:");
        String modelo = JOptionPane.showInputDialog("Entre com o modelo do carro:");
        String cor = JOptionPane.showInputDialog("Entre com a cor do carro:");
        String volante = JOptionPane.showInputDialog("Entre com o volante do carro:");
        String carburador = JOptionPane.showInputDialog("Entre com o carburador do carro:");
        String lanterna = JOptionPane.showInputDialog("Entre com a lanterna do carro:");

        JOptionPane.showMessageDialog(null, "Carro = " + marca);
        JOptionPane.showMessageDialog(null, "Modelo = " + modelo);
        JOptionPane.showMessageDialog(null, "Cor = " + cor);
        JOptionPane.showMessageDialog(null, "Volante = " + volante);
        JOptionPane.showMessageDialog(null, "Carburador = " + carburador);
        JOptionPane.showMessageDialog(null, "Lanterna = " + lanterna);

        int escolha = JOptionPane.showConfirmDialog(null, "O carro acelerou?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (escolha == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "O carro acelerou!");
        } else {
            JOptionPane.showMessageDialog(null, "O carro não acelerou!");
        }

        int escolha_freio = JOptionPane.showConfirmDialog(null, "O carro freou?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (escolha_freio == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "O carro freou!");
        } else {
            JOptionPane.showMessageDialog(null, "O carro não freou!");
        }
    }
}
