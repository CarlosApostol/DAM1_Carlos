import javax.swing.*;

public class Ejercicio_Swing_2 {
    public static void main(String[] args) {
        JTextArea area = new JTextArea(6, 25);
        JScrollPane scrollPane = new JScrollPane(area);

        StringBuilder sb = new StringBuilder();

        JFrame principal = new JFrame("Captura de Texto");
        principal.setSize(300, 200);
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.add(scrollPane);
        principal.setVisible(true);

        while (true) {
            String texto = JOptionPane.showInputDialog("Introduce un texto (Escribe 'Fin' para salir):");
            if (texto.equals("Fin")) {
                break;
            }
            sb.append(texto).append("\n");
            area.setText(sb.toString());
            }

        principal.dispose();
    }
}


