package values;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class operators {
    private static JLabel result;
    private static JLabel rest;
    private static JButton button;
    private static JFrame frame;
    private static JPanel panel;
    private static JTextField textField1;
    private static JTextField textField2;

    public static void main(String[] args) {
        JLabel label = new JLabel("Calculadora de soma, coloque dois números para somar");
        frame = new JFrame("Soma");
        result = new JLabel("");
        rest = new JLabel("");
        panel = new JPanel();
        button = new JButton("=");
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);

        // Ação do botão
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                division(evt);
            }
        });

        //Todo o painel do app
        panel.add(label);
        panel.add(new JLabel("Numerador"));
        panel.add(textField1);
        panel.add(new JLabel("+"));
        panel.add(new JLabel("Denominador"));
        panel.add(textField2);
        panel.add(button);
        panel.add(new JLabel("Divisão: "));
        panel.add(result);
        panel.add(new JLabel("Resto: "));
        panel.add(rest);
        frame.add(panel);
        frame.setSize(410, 410);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    //Método para fazer a divisão e atualizar no painel
    private static void division(java.awt.event.ActionEvent evt) {
        try {
            float n1 = Float.parseFloat(textField1.getText());
            float n2 = Float.parseFloat(textField2.getText());
            float division = n1 / n2;
            float restOf = n1 % n2;
            result.setText("Resultado: " + Float.toString(division));
            rest.setText("O Resto é: " + Float.toString(restOf));
        } catch (NumberFormatException e) {
            result.setText("Erro: Insira apenas números nos campos");
        }
    }
}
