package InterfacesGraficas;
import javax.swing.*;
import java.awt.event.*;


public class Ejercicio_Swing {
    public static void main(String[] args) {
        JFrame principal = new JFrame();
        principal.setTitle("PRINCIPAL");
        principal.setSize(300, 200);

        principal.setResizable(true);
        principal.setLocationRelativeTo(null);

        JButton boton1 = new JButton("Abrir ventana secundaria");
        principal.add(boton1);

        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setVisible(true);

        JFrame secundaria = new JFrame();
        secundaria.setTitle("SECUNDARIA");
        secundaria.setSize(300, 200);

        secundaria.setResizable(true);
        secundaria.setLocationRelativeTo(null);

        JLabel textosecundaria = new JLabel("Esta es la ventana secundaria", JLabel.CENTER);
        secundaria.add(textosecundaria);

        secundaria.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        secundaria.setVisible(false);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secundaria.setVisible(true);
            }
        });
    }
}
