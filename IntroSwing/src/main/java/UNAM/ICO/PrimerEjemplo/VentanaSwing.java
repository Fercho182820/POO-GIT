package UNAM.ICO.PrimerEjemplo;

import javax.swing.*;
import java.awt.*;

public class VentanaSwing extends JFrame {
    private JLabel etiqueta;
    private JTextField entrada;
    private JButton boton;


    public VentanaSwing() {
        super("Mi primer ventana Swing");
        etiqueta = new JLabel("Dame un numero");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        entrada = new JTextField(10);
        boton = new JButton("Enviar");
        boton.setForeground(new Color(104,184,237));
        boton.setSize(100,100);

        this.getContentPane().repaint();

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(etiqueta);
        getContentPane().add(entrada);
        getContentPane().add(boton);
        getContentPane().repaint();
        this.pack();
        setSize(600,400);




    }
}
