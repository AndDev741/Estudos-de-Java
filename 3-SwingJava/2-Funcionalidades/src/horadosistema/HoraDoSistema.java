package horadosistema;
import java.util.*;

import java.awt.Dimension;
import java.awt.Toolkit;

public class HoraDoSistema {
    public static void main(String[] args){
        Date relogio = new Date();
        Locale location = Locale.getDefault();
        Dimension tk = Toolkit.getDefaultToolkit().getScreenSize();

        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());
        System.out.println("O idioma do usuário é: ");
        System.out.println(location.toString());
        System.out.println("A resolução da sua tela é: ");
        System.out.println("Largura: " + tk.getWidth() + 'x' + "Altura: " + tk.getHeight());

    }
}
