package UNAM.ICO.vista;

import UNAM.ICO.vista.eventos.EventosRaton;
import UNAM.ICO.vista.eventos.EventosVentana;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MiVentana extends Frame {
    private Label label;
    private TextField text;
    private Button boton1;
    private Button boton2;
    private Label resultado;


    public MiVentana() {

        super("Mi ventana");
        setSize(800,600);
        setLayout(new FlowLayout());
        label = new Label("Grados Celsius");
        //resultado = new TextField(10);
        boton1 = new Button("Presioname!!");
        boton1.setSize(100,100);
        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double grados = Double.parseDouble(entrada.getText);
                double farenheit = (grados * 9 / 5) + 32;
                resultado.setText();
            }
        });
        boton1.addMouseListener(new EventosRaton());
        boton2 = new Button("Hola");
        add(label);
        add(entrada);
        add(boton1);
        add(boton2);

        addWindowListener(new EventosVentana());



        setVisible(true);

    }

}
