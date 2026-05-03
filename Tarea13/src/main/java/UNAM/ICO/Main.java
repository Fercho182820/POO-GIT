package UNAM.ICO;

import UNAM.ICO.controller.ControladorPassword;
import UNAM.ICO.view.VentanaPassword;
import UNAM.ICO.view.VentanaPrincipal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        //ControladorPrincipal controlador = new ControladorPrincipal(ventanaPrincipal);
        VentanaPassword ventanaPassword = new VentanaPassword();
        ControladorPassword controladorPassword = new ControladorPassword(ventanaPassword);


    }

}
