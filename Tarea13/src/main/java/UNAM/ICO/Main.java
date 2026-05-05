package UNAM.ICO;

import UNAM.ICO.controller.ControladorDefinitivo;
import UNAM.ICO.controller.ControladorInicio;
import UNAM.ICO.controller.ControladorPassword;
import UNAM.ICO.controller.ControladorPrincipal;
import UNAM.ICO.view.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
//        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
//        ControladorPrincipal controlador = new ControladorPrincipal(ventanaPrincipal);

//       VentanaInicio ventanaInicio = new VentanaInicio();
//        ControladorInicio controladorInicio = new ControladorInicio(ventanaInicio);
//
//        VentanaPassword ventanaPassword = new VentanaPassword();
//        ControladorPassword controladorPassword = new ControladorPassword(ventanaPassword);

        //VentanaAlternativa ventanaAlternativa = new VentanaAlternativa();

        VentanaDefinitiva ventanaDefinitiva = new VentanaDefinitiva();
        ControladorDefinitivo controladorDefinitivo = new ControladorDefinitivo(ventanaDefinitiva);


    }

}
