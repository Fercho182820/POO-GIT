package UNAM.ICO.view;

import javax.swing.*;
import java.awt.*;

public class VentanaAlternativa extends JFrame {
    private JPanel pnl;
    private JPanel pnl2;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblApellidoP;
    private JTextField txtApellidoP;
    private JLabel lblApellidoM;
    private JTextField txtApellidoM;
    private JButton btnDatos;

    public VentanaAlternativa (){
        super("FORMULARIO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //CUADRICULA
        GridBagLayout gridBagLayout = new GridBagLayout();
        //DECLARAR PANEL
        pnl = new JPanel(new GridBagLayout());
        pnl.setBackground(new Color(191, 136, 4));

        pnl2 = new JPanel(new GridBagLayout());
        pnl2.setBackground(new Color(138, 98, 0));

        GridBagConstraints c = new GridBagConstraints();

        //DECLARAR COMPONENTES
        lblNombre = new JLabel("NOMBRE: ");
        c.gridx = 0;
        c.gridy = 0;
        pnl2.add(lblNombre,c);

        txtNombre = new JTextField(12);
        c.gridx = 1;
        c.gridy = 0;
        pnl.add(txtNombre,c);

        lblApellidoP = new JLabel("APELLIDO PATERNO: ");
        c.gridx = 0;
        c.gridy = 1;
        pnl2.add(lblApellidoP,c);

        txtApellidoP = new JTextField(12);
        c.gridx = 1;
        c.gridy = 1;
        pnl.add(txtApellidoP,c);

        lblApellidoM = new JLabel("APELLIDO MATERNO: ");
        c.gridx = 0;
        c.gridy = 2;
        pnl2.add(lblApellidoM,c);

        txtApellidoM = new JTextField(12);
        c.gridx = 1;
        c.gridy = 2;
        pnl.add(txtApellidoM,c);

        btnDatos = new JButton("REGISTRO");
        c.gridx = 1;
        c.gridy = 3;
        pnl.add(btnDatos,c);


        this.add(pnl2);
        this.add(pnl);
        //DECLARAR PANEL AL FRAME
        this.setLayout(new GridLayout(1, 2));
        //TAMAÑO Y VISIBILIDAD
        setSize(800,600);
        setVisible(true);





    }

    public JPanel getPnl() {
        return pnl;
    }

    public void setPnl(JPanel pnl) {
        this.pnl = pnl;
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

    public JLabel getLblApellidoP() {
        return lblApellidoP;
    }

    public void setLblApellidoP(JLabel lblApellidoP) {
        this.lblApellidoP = lblApellidoP;
    }

    public JTextField getTxtApellidoP() {
        return txtApellidoP;
    }

    public void setTxtApellidoP(JTextField txtApellidoP) {
        this.txtApellidoP = txtApellidoP;
    }

    public JLabel getLblApellidoM() {
        return lblApellidoM;
    }

    public void setLblApellidoM(JLabel lblApellidoM) {
        this.lblApellidoM = lblApellidoM;
    }

    public JTextField getTxtApellidoM() {
        return txtApellidoM;
    }

    public void setTxtApellidoM(JTextField txtApellidoM) {
        this.txtApellidoM = txtApellidoM;
    }

    public JButton getBtnDatos() {
        return btnDatos;
    }

    public void setBtnDatos(JButton btnDatos) {
        this.btnDatos = btnDatos;
    }
}

