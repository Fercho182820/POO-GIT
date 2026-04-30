package UNAM.ICO.Vista;

import javax.swing.*;
import java.awt.*;
import java.nio.file.attribute.GroupPrincipal;

public class VentanaPrincipal extends JFrame {
    private JPanel pnl1;
    private JPanel pnl2;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton btnSaludar;
    private JLabel lblSalida;


    public VentanaPrincipal(){
        super("DEMO MVC Intro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));
        //Declarar los paneles
        pnl1= new JPanel();

        pnl2 = new JPanel();

        //Declarar los componentes
        lblNombre = new JLabel();
        txtNombre = new JTextField(20);


    }
}
