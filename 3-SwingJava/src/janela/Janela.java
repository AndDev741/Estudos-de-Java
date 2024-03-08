package janela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela {
    private static JFrame frame;
    private static JLabel label;
    private static JPanel panel;
    private static JButton button;
    public static void main(String[] args){
        frame = new JFrame("Exemplo de Swing"); 
        label = new JLabel("A mensagem vai aparecer aqui!");
        panel = new JPanel();
        button = new JButton("Clique aqui");

        //Ação do botão
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                btnClick(evt);
            }
        });

        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static void btnClick(java.awt.event.ActionEvent evt){
        label.setText("Mensagem nova");
    }

}
