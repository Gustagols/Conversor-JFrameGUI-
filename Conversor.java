package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class Conversor extends JFrame {

    private JPanel mainPanel;
    private JTextField textFieldDolar;
    private JButton buttonConverter;
    private JLabel labelDolares;
    private JLabel labelReais;

    public Conversor(String title){

        //chama o construtor de JFrame
        super(title);

        //programa encerra ao fechar a janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Adiciona o Panel criado para a janela
        this.setContentPane(mainPanel);

        //Ajusta os tamanhos minimos dos componentes
        this.pack();

        //Criou o listener do botão
        buttonConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double dolaresDigitados = Double.parseDouble(textFieldDolar.getText());
                System.out.println(dolaresDigitados);
                double valorEmReais = dolaresDigitados * 5.77;
                System.out.println("Valor em R$" + valorEmReais);
                DecimalFormat df = new DecimalFormat("0.00");
                labelReais.setText("R$" + df.format(valorEmReais));

            }
        });
    }

    public static void main(String[] args){
      // System.out.println("Hellooooo");

        JFrame frame = new Conversor("Titulo");
        frame.setVisible(true);
    }
}
