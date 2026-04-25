package UNAM.ICO.Grind;

import UNAM.ICO.Border.VentanaBorder;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaGrind extends Frame {
    Button btn = new Button("Presioname");
    Button btn2 = new Button("En segundo lugar a este");
    Button btn3 = new Button("Despues a este");
    Button btn4 = new Button("Por ultimo a este");

    public VentanaGrind(String titulo, int ancho, int alto){
        super("Ventana A");
        setSize(400,300);
        setResizable(false);
        setLayout(new GridLayout(3,2));

        add(btn,0);
        add(btn2,1);
        add(btn3,2);
        add(btn4,3);

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
