package UNAM.ICO;

import UNAM.ICO.Controller.ControladorPrincipal;
import UNAM.ICO.Window.VentanaPrincipal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal(ventanaPrincipal);
}
}
