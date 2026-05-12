package UNAM.ICO.Controller;

import UNAM.ICO.Model.ModeloTablaPhone;
import UNAM.ICO.Model.SmartPhone;
import UNAM.ICO.Window.VentanaPrincipal;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class ControladorPrincipal implements MouseListener {

    private VentanaPrincipal view;
    private ModeloTablaPhone modelo;

    public ControladorPrincipal(VentanaPrincipal vista){
        this.view = vista;
        //this.view.getBtnSaludar().addMouseListener(this);
        //this.view.getLblNombre().addMouseListener(this);
        this.view.getBtnAgregarPhone().addMouseListener(this);
        this.view.getTblPhone().addMouseListener(this);

        ArrayList<SmartPhone> tels = new ArrayList<>();

        tels.add(new SmartPhone("Apple", "Iphone 15", 17000.3f));
        tels.add(new SmartPhone("Samsung","Galaxy 5",7000.3f));
        modelo = new ModeloTablaPhone(tels);
        this.view.getTblPhone().setModel(modelo);
        this.view.getTblPhone().updateUI();

    }


    @Override
    public void mouseClicked(MouseEvent e) {

        //this.view.getLblSalida().setText("Hola " + this.view.getTxtNombre().getText());
        if(e.getSource() == this.view.getBtnSaludar()){
            System.out.println("Hola desde Nezayork");
            System.out.println("Hola desde Mi-Nezota");
            this.view.getLblSalida().setText("Hola " + this.view.getTxtNombre().getText());

        }
        if(e.getSource() == this.view.getLblNombre()){
            System.out.println("Desde etiqueta 1");
        }

        if(e.getSource() == this.view.getBtnAgregarPhone()) {
            System.out.println("Agregando un nuevo telefono");
            SmartPhone phone = null;

            try {
                 phone = new SmartPhone(
                        this.view.getTxtMarca().getText(),
                        this.view.getTxtModelo().getText(),
                        Float.parseFloat(this.view.getTxtPrecio().getText()));
            }catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(this.view, "El precio debe ser un numero");
                this.view.getTxtPrecio().setText("0");
                phone = new SmartPhone(
                        this.view.getTxtMarca().getText(),
                        this.view.getTxtModelo().getText(),
                        0.0f);
            }
            if(this.view.validar()) {
                modelo.agregarTelefono(phone);
                this.view.getTblPhone().updateUI();
                this.view.limpiar();
            }else{
                JOptionPane.showMessageDialog(this.view,"Faltan datos por completar");
            }




        }

        if(e.getSource() == this.view.getTblPhone()){
            System.out.println("Clic en la tabla");
            System.out.println(this.view.getTblPhone().getSelectedRow());
            SmartPhone smartPhone = modelo.getTelefono(this.view.getTblPhone().getSelectedRow());
            System.out.println(smartPhone.toString());
            view.getTxtMarca().setText(smartPhone.getMarca());
            view.getTxtModelo().setText(smartPhone.getModelo());
            view.getTxtPrecio().setText(String.valueOf(smartPhone.getPrecio()));
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

