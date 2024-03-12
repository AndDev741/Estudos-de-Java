package calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class sum {
    private static JLabel result;
    private static JButton button;
    private static JFrame frame;
    private static JPanel panel;
    private static JTextField textField1;
    private static JTextField textField2;

    public static void main(String[] args) {
        JLabel label = new JLabel("Calculadora de soma, coloque dois números para somar");
        JLabel plus = new JLabel("+");
        frame = new JFrame("Soma");
        result = new JLabel("");
        panel = new JPanel();
        button = new JButton("=");
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);

        // Ação do botão
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumOf(evt);
            }
        });

        panel.add(label);
        panel.add(textField1);
        panel.add(plus);
        panel.add(textField2);
        panel.add(button);
        panel.add(result);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static void sumOf(java.awt.event.ActionEvent evt) {
        try {
            int n1 = Integer.parseInt(textField1.getText());
            int n2 = Integer.parseInt(textField2.getText());
            int sum = n1 + n2;
            result.setText("Resultado: " + Integer.toString(sum));
        } catch (NumberFormatException e) {
            result.setText("Erro: Insira apenas números nos campos");
        }
    }
}
