/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplopoo;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class Main {
        public static void main (String[] args)  {  // a main é necessária para executar o código e para que os dados possam corresponder aos seus devidos atributos.
      
 
        String marca = JOptionPane.showInputDialog("Entre com a marca do carro"); // Entrada de dados 
        String modelo = JOptionPane.showInputDialog("Entre com o modelo do carro");
        String cor = JOptionPane.showInputDialog("Entre com a cor do carro");
        String volante = JOptionPane.showInputDialog("Entre com o volante do carro");
        String carburador = JOptionPane.showInputDialog("Entre com o carburador do carro");
        String lanterna = JOptionPane.showInputDialog("Entre com a lanterna do carro");
        
        JOptionPane.showMessageDialog(null, "Carro " + marca + ""); // exibe na tela
        JOptionPane.showMessageDialog(null, "Modelo " + modelo + "" );
        JOptionPane.showMessageDialog(null, "Cor " + cor + "" );
        JOptionPane.showMessageDialog(null, "Volante " + volante + "" );
        JOptionPane.showMessageDialog(null, "Carburador " + carburador + "" );
        JOptionPane.showMessageDialog(null, "Lanterna " + lanterna + "" );
        
        int escolha = JOptionPane.showConfirmDialog(null,"O carro acelerou? ", "Confirmado ", JOptionPane.YES_NO_OPTION);
        
        if (escolha == JOptionPane.YES_OPTION) { // condições 
            JOptionPane.showMessageDialog(null, "O carro acelerou");
        } else {
            JOptionPane.showMessageDialog(null, "O carro não acelerou");
        }
        
        int escolha_dois = JOptionPane.showConfirmDialog(null,"O carro freiou? ", "Confirmado ", JOptionPane.YES_NO_OPTION);
        
        if (escolha_dois == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "O carro freiou");
        } else {
            JOptionPane.showMessageDialog(null, "O carro não freiou");
        }
        
               
    }        
        
}

