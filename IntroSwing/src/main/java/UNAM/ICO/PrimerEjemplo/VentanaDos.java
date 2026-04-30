package UNAM.ICO.PrimerEjemplo;

import javax.swing.*;
import java.awt.*;

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
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        layout = new GridLayout(2,2);
        getContentPane().setLayout(layout);
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel1.setBackground(Color.red);
        panel2.setBackground(Color.CYAN);
        panel3.setBackground(Color.green);
        panel4.setBackground(Color.gray);

        //etiqueta new JLabel("Soy una etiqueta");
        //boton new JButton("Soy un boton");




    }

}
