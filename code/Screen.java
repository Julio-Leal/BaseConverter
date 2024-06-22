import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame {

    private ImageIcon background;
    private JTextField entradaUsuario, saidaConversao;
    private JLabel deLabel, paraLabel;
    private JButton converterButton;
    private String[] itens = {"Decimal", "Binário", "Hexadecimal", "Octal"};
    private JComboBox<String> opcaoConversao1;
    private JComboBox<String> opcaoConversao2;

    public Screen() {
        // Configurações de tela
        setTitle("Conversor de Bases");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        // Carregando a imagem de plano de fundo
        background = new ImageIcon(getClass().getResource("planoFundo2.jpg"));
        BackgroundImage backgroundImage = new BackgroundImage(background);

        // Criando os componentes
        entradaUsuario = new JTextField(20);
        saidaConversao = new JTextField(20);
        saidaConversao.setEditable(false);
        deLabel = new JLabel("De:");
        paraLabel = new JLabel("Para:");
        converterButton = new JButton("Converter");
        opcaoConversao1 = new JComboBox<>(itens);
        opcaoConversao2 = new JComboBox<>(itens);

        // Configurando fonte e cor do botão
        converterButton.setFont(new Font("Arial", Font.BOLD, 15));
        converterButton.setBackground(Color.ORANGE);

        // Configurando posições e tamanhos dos componentes
        deLabel.setBounds(177, 55, 140, 50);
        paraLabel.setBounds(177, 135, 140, 50);
        entradaUsuario.setBounds(177, 100, 300, 40);
        saidaConversao.setBounds(177, 180, 300, 40);
        converterButton.setBounds(177, 240, 120, 40);
        opcaoConversao1.setBounds(482, 100, 120, 40);
        opcaoConversao2.setBounds(482, 180, 120, 40);

        // Adicionando os componentes ao JFrame
        backgroundImage.add(deLabel);
        backgroundImage.add(paraLabel);
        backgroundImage.add(entradaUsuario);
        backgroundImage.add(saidaConversao);
        backgroundImage.add(converterButton);
        backgroundImage.add(opcaoConversao1);
        backgroundImage.add(opcaoConversao2);

        // Adicionando o painel de fundo ao JFrame
        setContentPane(backgroundImage);

        // Configurando layout para null
        setLayout(null);
        setVisible(true);

        // Adiciona ação ao botão Converter
        converterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                converterButtonActionPerformed(evt);
            }
        });
    }

    private void converterButtonActionPerformed(ActionEvent evt) {
        String de = (String) opcaoConversao1.getSelectedItem();
        String para = (String) opcaoConversao2.getSelectedItem();
        String entrada = entradaUsuario.getText();

        if (de.equals("Decimal") && para.equals("Binário")) {
            Binario binario = new Binario();
            binario.converterDecimal(entrada);
            saidaConversao.setText(binario.getResultado());
        } else if(de.equals("Decimal") && para.equals("Hexadecimal")) {
            Hexadecimal hexadecimal = new Hexadecimal();
            hexadecimal.converterDecimal(entrada);
            saidaConversao.setText(hexadecimal.getResultado());
        } else if(de.equals("Decimal") && para.equals("Octal")){
            Octal octal = new Octal();
            octal.converterDecimal(entrada);
            saidaConversao.setText(octal.getResultado());

        } else if (de.equals("Binário") && para.equals("Decimal")) {
            Decimal decimal = new Decimal();
            decimal.converterBinario(entrada);
            saidaConversao.setText(decimal.getResultado());

        } else if (de.equals("Octal") && para.equals("Decimal")) {
            Decimal decimal = new Decimal();
            decimal.converterOctal(entrada);
            saidaConversao.setText(decimal.getResultado());
        } else if(de.equals("Octal") && para.equals("Binário")){
            Binario binario = new Binario();
            binario.converterOctal(entrada);
            saidaConversao.setText(binario.getResultado());
        } else if(de.equals("Octal") && para.equals("Hexadecimal")){
            Hexadecimal hexadecimal = new Hexadecimal();
            hexadecimal.converterOctal(entrada);
            saidaConversao.setText(hexadecimal.getResultado());

        } else if (de.equals("Hexadecimal") && para.equals("Decimal")) {
            Decimal decimal = new Decimal();
            decimal.converterHexadecimal(entrada);
            saidaConversao.setText(decimal.getResultado());
        } else if(de.equals("Hexadecimal") && para.equals("Octal")){
            Octal octal = new Octal();
            octal.converterHexadecimal(entrada);
            saidaConversao.setText(octal.getResultado());

        } else { 
            saidaConversao.setText("Conversão não Programada!.");
        }
    }
}
