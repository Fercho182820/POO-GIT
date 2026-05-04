package UNAM.ICO;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaDos extends JFrame {
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel etiqueta;
    private JButton boton;
    private JComboBox<String> combo;

    public VentanaDos() {
        super("Mi segunda ventana Swing");
        this.setDefaultCloseOperation(3);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(3);
        this.layout = new GridLayout(2, 2);
        this.getContentPane().setLayout(this.layout);
        this.panel1 = new JPanel();
        this.panel2 = new JPanel();
        this.panel3 = new JPanel();
        this.panel4 = new JPanel();
        this.combo = new JComboBox();
        ArrayList<String> nombres = new ArrayList();
        nombres.add("Ari");
        nombres.add("Alde");
        nombres.add("Alex");
        nombres.add("Angel");
        ModeloComboNombres modelo = new ModeloComboNombres(nombres);
        this.combo.setModel(modelo);
        this.panel1.setBackground(new Color(255, 250, 240));
        this.panel2.setBackground(new Color(255, 248, 220));
        this.panel3.setBackground(new Color(255, 248, 220));
        this.panel4.setBackground(new Color(255, 250, 240));
        this.etiqueta = new JLabel("Soy una etiqueta");
        this.boton = new JButton("Soy un boton");
        this.panel1.add(this.etiqueta);
        this.panel2.add(this.boton);
        this.panel3.add(this.combo);
        this.getContentPane().add(this.panel1, 0);
        this.getContentPane().add(this.panel2, 1);
        this.getContentPane().add(this.panel3, 2);
        this.getContentPane().add(this.panel4, 3);
        this.setVisible(true);
    }
}

