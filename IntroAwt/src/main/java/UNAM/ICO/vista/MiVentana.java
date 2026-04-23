package UNAM.ICO.vista;

import UNAM.ICO.vista.eventos.EventosRaton;
import UNAM.ICO.vista.eventos.EventosVentana;

import java.awt.*;

public class MiVentana extends Frame {
    private Button boton1;


    public MiVentana() {

        super("Mi ventana");
        setSize(800,600);
        //setLayout();
        boton1 = new Button("Presioname!!");
        boton1.setSize(100,100);
        boton1.addMouseListener(new EventosRaton());
        //boton2 = new Button("Hola");
        add(boton1);
        //add(boton2);

        addWindowListener(new EventosVentana());



        setVisible(true);

    }

}
