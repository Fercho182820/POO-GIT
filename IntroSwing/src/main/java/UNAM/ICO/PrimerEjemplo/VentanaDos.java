package UNAM.ICO.PrimerEjemplo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaDos extends JFrame {
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel etiqueta;
    private JButton boton;
    private JComboBox<String> combo;

    public VentanaDos(){
        super("Mi segunda ventana Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(800,600);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        layout = new GridLayout(2,2);
        getContentPane().setLayout(layout);
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        combo = new JComboBox<>();

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ari");
        nombres.add("Alde");
        nombres.add("Alex");
        nombres.add("Angel");
        ModeloComboNombres modelo = new ModeloComboNombres(nombres);
        combo.setModel(modelo);


        panel1.setBackground(new Color(255, 250, 240));
        panel2.setBackground(new Color(255, 248, 220));
        panel3.setBackground(new Color(255, 248, 220));
        panel4.setBackground(new Color(255, 250, 240));

        etiqueta = new JLabel("Soy una etiqueta");
        boton = new JButton("Soy un boton");
panel1.add(etiqueta);
panel2.add(boton);
panel3.add(combo);


        getContentPane().add(panel1,0);
        getContentPane().add(panel2,1);
        getContentPane().add(panel3,2);
        getContentPane().add(panel4,3);






        setVisible(true);




    }

}
