import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class Calculadora {
    int boardWidth = 360;
    int boardHeight = 540;

    Color customLightGray = new Color(212, 212, 210);
    Color customDarkGray = new Color(80, 80, 80);
    Color customBlack = new Color (28, 28, 28);
    Color customOrange = new Color (255, 149, 0);

    String[] buttonValues = {
        "AC", "+/-", "%", "/",
        "7", "8", "9", "x",
        "4", "5", "6", "-",
        "1", "2", "3", "+",
        "0", ".", "√", "=", 
    };
    String[] rightSymbols = {"/", "x", "-", "+", "="};
    String[] topSymbols = {"AC", "+/-", "%"};

    JFrame frame = new JFrame("Calculadora"); // cria a tela
    JLabel displayLabel = new JLabel(); // cria a caixa de texto
    JPanel displayPanel = new JPanel(); // cria o painel (container)
    JPanel buttonsPanel = new JPanel(); // cria os botões dentro do painel

    Calculadora() {
        frame.setVisible(true); // mostrar na tela
        frame.setSize(boardWidth, boardHeight); // define quais as variáveis que guardam os tamanhos à serem mostrados
        frame.setLocationRelativeTo(null); // pra acompanhar o mouse sem dar diferença
        frame.setResizable(false); // não permitir mudar o tamanho da tela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout()); // define qual o tipo do layout a ser utilizado

        displayLabel.setBackground(customBlack); // cor do fundo
        displayLabel.setForeground(Color.white); // cor do texto
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 80)); // tipo da fonte, sem personalização e o tamanho
        displayLabel.setHorizontalAlignment(JLabel.RIGHT); // à direita
        displayLabel.setText("0"); // texto padrão
        displayLabel.setOpaque(true); 

        displayPanel.setLayout(new BorderLayout()); // mostra o layout que já foi definido no começo
        displayPanel.add(displayLabel); // add o label no painel
        frame.add(displayPanel, BorderLayout.NORTH); // add o painel na janela

        buttonsPanel.setLayout(new GridLayout(5, 4));
        buttonsPanel.setBackground(customBlack);
        frame.add(buttonsPanel); 

        for (int i = 0; i < buttonValues.length; i++){ // adiciona os valores aos botões
            JButton button = new JButton(); 
            String buttonValue = buttonValues[i];
            button.setFont(new Font("Arial", Font.PLAIN, 30));
            button.setText(buttonValue);
            button.setFocusable(false); // tira o contorno retângular ao clicar em um botão
            button.setBorder(new LineBorder(customBlack));
            if (Arrays.asList(topSymbols).contains(buttonValue)){ // se a lista dos símbolos contem os valores dos botões, adicione as cores cinza e preto
                button.setBackground(customLightGray);
                button.setForeground(customBlack);;
            } 
            else if (Arrays.asList(rightSymbols).contains(buttonValue)){ // se a lista dos símbolos contem os valores dos botões, adicione as cores laranja e branco
                button.setBackground(customOrange);
                button.setForeground(Color.white);
            }
            else { // se a lista dos símbolos contem os valores dos botões, adicione as cores laranja e branco
                button.setBackground(customDarkGray); 
                button.setForeground(Color.white);
            }

            buttonsPanel.add(button); // adiciona os botões ao painel

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    String buttonValue = button.getText();
                    if (Arrays.asList(rightSymbols).contains(buttonValue)) {

                    }
                    else if (Arrays.asList(topSymbols).contains(buttonValue)) {

                    }
                    else {
                        if (buttonValue == ".") {

                        }
                        else if ("0123456789".contains(buttonValue)) {
                            if (displayLabel.getText() == "0") {
                                displayLabel.setText(buttonValue);
                            }
                            else {
                                displayLabel.setText(displayLabel.getText() + buttonValue);
                            }
                        }
                    }
                }
            });
        }
    }
}