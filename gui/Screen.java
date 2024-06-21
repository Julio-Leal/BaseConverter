package gui;

import java.awt.*;
import javax.swing.*;

public class Screen extends JFrame {
    
    private JTextField jTextField;
    private JLabel jLabel;
    private JButton jButton;

    public Screen() {
        setTitle("Conversor de Bases");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        // Criando os componentes
        jTextField = new JTextField(20);
        jLabel = new JLabel("Digite um valor");
        jButton = new JButton("Converter");
        
        // Configurando fonte e cor do botão
        jButton.setFont(new Font("Arial", Font.BOLD, 15));
        jButton.setBackground(Color.ORANGE);
        
        // Configurando posições e tamanhos dos componentes
        jLabel.setBounds(165, 55, 140, 50);
        jTextField.setBounds(165, 100, 300, 40);
        jButton.setBounds(495, 100, 120, 40);
        
        // Adicionando os componentes ao JFrame
        add(jLabel);
        add(jTextField);
        add(jButton);
        
        // Configurando layout para null apenas se realmente necessário
        setLayout(null);
        
        setVisible(true);
    }
}