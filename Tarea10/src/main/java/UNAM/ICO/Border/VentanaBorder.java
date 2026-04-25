package UNAM.ICO.Border;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaBorder extends Frame {
    Button btn = new Button ("Norte");
    Button btn2 = new Button ("Sur");
    Button btn3 = new Button ("Este");
    Button btn4 = new Button ("Oeste");

    public VentanaBorder(){

    }

    public VentanaBorder(String titulo, int ancho, int alto){
        super("Ari");
        setSize(400,300);
        setResizable(false);
        setLayout(new BorderLayout());

        add("North",btn);
        add("South",btn2);
        add("West",btn3);
        add("East",btn4);

        setVisible(true);

        addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );

    }

}
