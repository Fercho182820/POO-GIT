package UNAM.ICO.Flow;

import java.awt.*;

public class VentanaFlow extends Frame {
    Button boton1;
    TextField texto;
    FlowLayout layout;

    public VentanaFlow() {

    }
    public VentanaFlow(String titulo, int ancho, int alto) {
        super(titulo);
        setSize(ancho, alto);
        boton1 = new Button("Presiona para saber mas!");
        texto = new TextField(20);

        layout = new FlowLayout();
        this.setLayout(new FlowLayout());

        this.add(boton1);
        this.add(texto);

        setVisible(true);

        addWindowListener(new EventosVentanaFlow());
    }



}
