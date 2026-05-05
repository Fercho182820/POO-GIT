package UNAM.ICO.controller;

import UNAM.ICO.view.VentanaInicio;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorInicio implements MouseListener {

    private VentanaInicio view;

    public ControladorInicio(VentanaInicio vista){
        this.view = vista;
        this.view.getBtnDatos().addMouseListener(this);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

        //this.view.getLblSalida().setText("Hola " + this.view.getTxtNombre().getText());
        if(e.getSource() == this.view.getBtnDatos()){
            System.out.println("DATOS GUARDADOS");
            this.view.getBtnDatos().setText("DATOS ACTUALIZADOS");

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

