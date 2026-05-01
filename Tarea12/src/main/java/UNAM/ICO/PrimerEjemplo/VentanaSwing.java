package UNAM.ICO.PrimerEjemplo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaSwing extends JFrame {
    private JLabel etiqueta;
    private JTextField entrada;
    private JButton boton;


    public VentanaSwing() {
        super("Mi primer ventana Swing");
        this.getContentPane().setLayout(new GridLayout(3,3));
        etiqueta = new JLabel("Dame un numero");
        entrada = new JTextField(10);
        entrada.setBackground(new Color(245,235,215));
        entrada.setOpaque(true);
        boton = new JButton("Enviar");
        boton.setForeground(new Color(0,0,0));
        boton.setBackground(new Color(222,184,135));

        boton.setOpaque(true);         //Background on
        boton.setBorderPainted(false);

        boton.setSize(100,100);

        etiqueta.setForeground(new Color(0,0,0));
        etiqueta.setBackground(new Color(222,184,135));

        etiqueta.setOpaque(true);

        this.getContentPane().repaint();

        getContentPane().add(etiqueta,0);
        getContentPane().add(entrada,1);
        getContentPane().add(boton,2);
        getContentPane().repaint();
        this.pack();
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double entradaCelcius = Double.parseDouble(entrada.getText());
                double gradosFarenheit = (entradaCelcius * 9 / 5) + 32;
                JOptionPane.showMessageDialog(null,"En Farenheit es: "+ gradosFarenheit);
            }

        });

        entrada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Hola desde el click al cuadro dialogo");
            }
        });

        entrada.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Hola desde el keytype al cuadro entrada");
                System.out.println(e.getKeyChar());
                System.out.println("codigo de teclado : "+ e.getKeyCode());
            }
        });




    }
}
