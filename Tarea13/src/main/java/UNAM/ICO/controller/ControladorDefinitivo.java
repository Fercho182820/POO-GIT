package UNAM.ICO.controller;

import UNAM.ICO.view.VentanaDefinitiva;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorDefinitivo implements MouseListener {

    private VentanaDefinitiva view;

    public  ControladorDefinitivo(VentanaDefinitiva vista) {
        this.view = vista;
        this.view.getBtnDatos().addMouseListener(this);

    }
    @Override
    public void mouseClicked(MouseEvent e) {

        if(e.getSource() == this.view.getBtnDatos()){
            System.out.println("DATOS GUARDADOS");
            this.view.getBtnDatos().setText("REGISTRO EXITOSO");

        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
