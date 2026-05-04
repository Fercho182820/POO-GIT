
package UNAM.ICO;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaSwing extends JFrame {
    private JLabel etiqueta;
    private JTextField entrada;
    private JButton boton;

    public VentanaSwing() {
        super("Mi primer ventana Swing");
        this.getContentPane().setLayout(new GridLayout(3, 3));
        this.etiqueta = new JLabel("Dame un numero");
        this.entrada = new JTextField(10);
        this.entrada.setBackground(new Color(245, 235, 215));
        this.entrada.setOpaque(true);
        this.boton = new JButton("Enviar");
        this.boton.setForeground(new Color(0, 0, 0));
        this.boton.setBackground(new Color(222, 184, 135));
        this.boton.setOpaque(true);
        this.boton.setBorderPainted(false);
        this.boton.setSize(100, 100);
        this.etiqueta.setForeground(new Color(0, 0, 0));
        this.etiqueta.setBackground(new Color(222, 184, 135));
        this.etiqueta.setOpaque(true);
        this.getContentPane().repaint();
        this.getContentPane().add(this.etiqueta, 0);
        this.getContentPane().add(this.entrada, 1);
        this.getContentPane().add(this.boton, 2);
        this.getContentPane().repaint();
        this.pack();
        this.setSize(600, 400);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        this.boton.addMouseListener(new MouseAdapter() {
            {
                Objects.requireNonNull(VentanaSwing.this);
            }

            public void mouseClicked(MouseEvent e) {
                double entradaCelcius = Double.parseDouble(VentanaSwing.this.entrada.getText());
                double gradosFarenheit = entradaCelcius * (double)9.0F / (double)5.0F + (double)32.0F;
                JOptionPane.showMessageDialog((Component)null, "En Farenheit es: " + gradosFarenheit);
            }
        });
        this.entrada.addMouseListener(new MouseAdapter() {
            {
                Objects.requireNonNull(VentanaSwing.this);
            }

            public void mouseClicked(MouseEvent e) {
                System.out.println("Hola desde el click al cuadro dialogo");
            }
        });
        this.entrada.addKeyListener(new KeyAdapter() {
            {
                Objects.requireNonNull(VentanaSwing.this);
            }

            public void keyTyped(KeyEvent e) {
                System.out.println("Hola desde el keytype al cuadro entrada");
                System.out.println(e.getKeyChar());
                System.out.println("codigo de teclado : " + e.getKeyCode());
            }
        });
    }
}

