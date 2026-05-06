package UNAM.ICO.Window;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private JPanel pnl1;
    private JPanel pnl2;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton btnSaludar;
    private JLabel lblSalida;
    //SmarPhone
    private JLabel lblMarca;
    private JTextField txtMarca;
    private JLabel lblModelo;
    private JTextField txtModelo;
    private JButton btnAgregarPhone;

    public VentanaPrincipal (){
        super("DEMO MVC INTRO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));
        //Declarar los paneles
        pnl1 = new JPanel(new GridBagLayout());
        pnl1.setBackground(new Color(252, 204, 114));
        pnl2 = new JPanel();
        pnl2.setBackground(new Color(242, 191, 99));
        //Declarar los componentes
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        lblNombre = new JLabel("Escribe tu Nombre: ");
        c.gridx = 0;
        c.gridy = 0;
        pnl1.add(lblNombre,c);

        txtNombre = new JTextField(12);
        c.gridx = 1;
        c.gridy = 0;
        pnl1.add(txtNombre,c);

//        btnSaludar = new JButton("Saludar");
//        c.gridx = 0;
//        c.gridy = 0;
//        pnl1.add(btnSaludar,c);

//        lblSalida = new JLabel("...");
//        c.gridx = 0;
//        c.gridy = 0;
//        pnl1.add(lblSalida,c);

        lblMarca = new JLabel("Marca");
        c.gridx = 0;
        c.gridy = 1;
        pnl1.add(lblMarca,c);

        txtMarca = new JTextField(12);
        c.gridx = 1;
        c.gridy = 1;
        pnl1.add(txtMarca,c);

        lblModelo = new JLabel("Modelo");
        c.gridx = 0;
        c.gridy = 2;
        pnl1.add(lblModelo,c);

        txtModelo = new JTextField(12);
        c.gridx = 1;
        c.gridy = 2;
        pnl1.add(txtModelo,c);

        btnAgregarPhone = new JButton("AGREGAR");
        c.gridx = 1;
        c.gridy = 3;
        pnl1.add(btnAgregarPhone,c);

        //Agregar el panel 1 y 2 al frame
        this.getContentPane().add(pnl1,0);
        this.getContentPane().add(pnl2,1);

        setSize(800,600);
        setVisible(true);
    }

    public JPanel getPnl1() {
        return pnl1;
    }

    public void setPnl1(JPanel pnl1) {
        this.pnl1 = pnl1;
    }

    public JPanel getPnl2() {
        return pnl2;
    }

    public void setPnl2(JPanel pnl2) {
        this.pnl2 = pnl2;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JButton getBtnSaludar() {
        return btnSaludar;
    }

    public void setBtnSaludar(JButton btnSaludar) {
        this.btnSaludar = btnSaludar;
    }

    public JLabel getLblSalida() {
        return lblSalida;
    }

    public void setLblSalida(JLabel lblSalida) {
        this.lblSalida = lblSalida;
    }
}

