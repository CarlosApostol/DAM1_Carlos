package InterfacesGraficas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class El_Destructor {

    private static ArrayList<JFrame> galletas = new ArrayList<>();
    private static int contadorGalletas = 1;

    public static void main(String[] args) {
        JFrame principal = crearDestructor();
        principal.setVisible(true);
    }

    private static JFrame crearDestructor() {
        JFrame principal = new JFrame();
        principal.setTitle("El Destructor");
        principal.setSize(300, 200);
        principal.setLayout(null);
        principal.setResizable(true);
        principal.setLocationRelativeTo(null);

        JLabel imagen = crearImagenDeFondo();
        principal.add(imagen);

        JButton boton1 = botonCrearCaos();
        principal.add(boton1);

        JButton boton2 = botonEliminarUna();
        principal.add(boton2);

        principal.revalidate();
        principal.repaint();

        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearGalleta();
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarUltimaGalleta();
            }
        });

        return principal;
    }

    private static JLabel crearImagenDeFondo() {
        JLabel imagen = new JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(new ImageIcon("/home/carapo2/IdeaProjects/java/src/InterfacesGraficas/ApostolCarlos-El_Destructor/images.jpeg").getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        imagen.setOpaque(true);
        imagen.setSize(300, 100);
        return imagen;
    }

    private static JButton botonCrearCaos() {
        JButton boton1 = new JButton("Crear caos");
        boton1.setLocation(20, 100);
        boton1.setSize(100, 50);
        boton1.setBackground(Color.darkGray);
        boton1.setForeground(Color.green);
        boton1.setFont(new Font("Arial", Font.BOLD, 11));
        return boton1;
    }

    private static JButton botonEliminarUna() {
        JButton boton2 = new JButton("Eliminar una");
        boton2.setLocation(170, 100);
        boton2.setSize(100, 50);
        boton2.setBackground(Color.darkGray);
        boton2.setForeground(Color.red);
        boton2.setFont(new Font("Arial", Font.BOLD, 10));
        return boton2;
    }

    private static void crearGalleta() {
        JFrame secundaria = new JFrame();
        secundaria.setTitle("galleta " + contadorGalletas);
        secundaria.setSize(300, 200);
        secundaria.setLocationRelativeTo(null);
        JButton boton3 = botonAutodestruir();
        boton3.setBackground(Color.red);
        boton3.setForeground(Color.orange);
        boton3.setFont(new Font("Ubuntu", Font.BOLD, 12));
        secundaria.add(boton3);
        secundaria.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel imageLabel = crearImagenParaGalleta();
        secundaria.add(imageLabel);

        secundaria.setVisible(true);
        galletas.add(secundaria);
        contadorGalletas++;
    }

    private static JButton botonAutodestruir() {
        JButton boton3 = new JButton("Autodestruir todo.");
        boton3.setLocation(70, 100);
        boton3.setSize(150, 50);
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarTodasLasGalletas();
            }
        });
        return boton3;
    }

    private static void cerrarTodasLasGalletas() {
        for (JFrame galleta : galletas) {
            galleta.dispose();
        }
        galletas.clear();
    }

    private static JLabel crearImagenParaGalleta() {
        JLabel imageLabel = new JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(new ImageIcon("/home/carapo2/IdeaProjects/java/src/InterfacesGraficas/ApostolCarlos-El_Destructor/gokumex.jpeg").getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        imageLabel.setOpaque(true);
        imageLabel.setSize(300, 100);
        return imageLabel;
    }

    private static void eliminarUltimaGalleta() {
        if (!galletas.isEmpty()) {
            JFrame ultimaVentana = galletas.remove(galletas.size() - 1);
            ultimaVentana.dispose();
        }
    }
}




