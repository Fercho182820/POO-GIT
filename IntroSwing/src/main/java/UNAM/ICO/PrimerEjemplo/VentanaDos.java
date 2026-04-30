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
        setSize(800,600);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        layout = new GridLayout(2,2);
        getContentPane().setLayout(layout);
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel1.setBackground(new Color(22,32,104));
        panel2.setBackground(new Color(0,0,0));
        panel3.setBackground(new Color(34,55,78));
        panel4.setBackground(new Color(55,33,88));

        etiqueta = new JLabel("Soy una etiqueta");
        boton = new JButton("Soy un boton");


        getContentPane().add(panel1,0);
        getContentPane().add(panel2,1);
        getContentPane().add(panel3,2);
        getContentPane().add(panel4,3);






        setVisible(true);




    }

}
