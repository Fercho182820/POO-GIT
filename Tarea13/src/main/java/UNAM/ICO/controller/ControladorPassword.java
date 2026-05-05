package UNAM.ICO.controller;

import UNAM.ICO.view.VentanaInicio;
import UNAM.ICO.view.VentanaPassword;
import UNAM.ICO.view.VentanaPrincipal;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class ControladorPassword implements MouseListener, KeyListener {
    private VentanaPassword vista;

    public ControladorPassword(VentanaPassword vista){
        this.vista = vista;
        this.vista.getBtnLogin().addMouseListener(this);
        this.vista.getTxtPassword().addKeyListener(this);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            validarAcceso();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vista.getBtnLogin()){
            validarAcceso();
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
    private void validarAcceso(){
        //LOGICA ACCESO
        String usuario = vista.getTxtUsername().getText();
        String password = vista.getTxtPassword().getText();

        if (usuario.equals("Fer") && password.equals("220426")) {
            JOptionPane.showMessageDialog(vista, "¡Login Exitoso!");

            VentanaInicio inicio = new VentanaInicio();
            vista.dispose();
            inicio.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(vista, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}
