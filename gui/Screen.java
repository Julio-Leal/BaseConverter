package gui;

import java.awt.*;
import javax.swing.*;

public class Screen extends JFrame {
    
    private JTextField entradaUsuario, saidaConversao;
    private JLabel deLabel, paraLabel;
    private JButton converterButton;
    private String[] itens = {"Decimal", "Binário", "Hexadecimal", "Octal"};
    private JComboBox <String>opcaoConversao1;
    private JComboBox <String>opcaoConversao2;

    public Screen() {
        //Configuralções de tela
        setTitle("Conversor de Bases");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        // Criando os componentes
        entradaUsuario = new JTextField(20);
        saidaConversao = new JTextField(20);
        saidaConversao.setEditable(false);
        deLabel = new JLabel("De:");
        paraLabel = new JLabel("Para:");
        converterButton = new JButton("Converter");
        opcaoConversao1 = new JComboBox(itens);
        opcaoConversao2 = new JComboBox(itens);
        
        // Configurando fonte e cor do botão
        converterButton.setFont(new Font("Arial", Font.BOLD, 15));
        converterButton.setBackground(Color.ORANGE);
        
        // Configurando posições e tamanhos dos componentes
        deLabel.setBounds(165, 55, 140, 50);
        paraLabel.setBounds(165, 135, 140, 50);
        entradaUsuario.setBounds(165, 100, 300, 40);
        saidaConversao.setBounds(165, 180, 300, 40);
        converterButton.setBounds(165, 240, 120, 40);
        opcaoConversao1.setBounds(470, 100, 120, 40);
        opcaoConversao2.setBounds(470, 180, 120, 40);
        
        // Adicionando os componentes ao JFrame
        add(deLabel);
        add(paraLabel);
        add(entradaUsuario);
        add(saidaConversao);
        add(converterButton);
        add(opcaoConversao1);
        add(opcaoConversao2);

        // Configurando layout para null apenas se realmente necessário
        setLayout(null);
        
        setVisible(true);
    }
}