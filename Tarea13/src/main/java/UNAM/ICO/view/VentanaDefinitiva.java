package UNAM.ICO.view;

import javax.swing.*;
import java.awt.*;

public class VentanaDefinitiva extends JFrame {
    private JPanel pnl;
    private JLabel lblMaestro;
    private JTextField txtNombre;
    private JLabel lblMateria;
    private JTextField txtApellidoP;
    private JLabel lblTurno;
    private JTextField txtApellidoM;
    private JButton btnDatos;

    public VentanaDefinitiva(){
        super("TIRA DE MATERIAS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //CUADRICULA
        GridBagLayout gridBagLayout = new GridBagLayout();
        //DECLARAR PANEL
        pnl = new JPanel(new GridBagLayout());
        pnl.setBackground(new Color(18, 114, 153));

        GridBagConstraints c = new GridBagConstraints();

        //DECLARAR COMPONENTES
        lblMaestro = new JLabel("MAESTRO");
        c.gridx = 0;
        c.gridy = 0;
        pnl.add(lblMaestro,c);

        txtNombre = new JTextField(12);
        c.gridx = 0;
        c.gridy = 1;
        pnl.add(txtNombre,c);

        txtNombre = new JTextField(12);
        c.gridx = 0;
        c.gridy = 2;
        pnl.add(txtNombre,c);

        lblMateria = new JLabel("MATERIA: ");
        c.gridx = 1;
        c.gridy = 0;
        pnl.add(lblMateria,c);

        txtApellidoP = new JTextField(12);
        c.gridx = 1;
        c.gridy = 1;
        pnl.add(txtApellidoP,c);

        txtApellidoP = new JTextField(12);
        c.gridx = 1;
        c.gridy = 2;
        pnl.add(txtApellidoP,c);

        lblTurno = new JLabel("TURNO: ");
        c.gridx = 2;
        c.gridy = 0;
        pnl.add(lblTurno,c);

        txtApellidoM = new JTextField(12);
        c.gridx = 2;
        c.gridy = 1;
        pnl.add(txtApellidoM,c);

        txtApellidoM = new JTextField(12);
        c.gridx = 2;
        c.gridy = 2;
        pnl.add(txtApellidoM,c);

        btnDatos = new JButton("REGISTRO");
        c.gridx = 1;
        c.gridy = 3;
        pnl.add(btnDatos,c);


        this.add(pnl);
        //DECLARAR PANEL AL FRAME
        this.setLayout(new GridLayout());
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

    public JLabel getLblMaestro() {
        return lblMaestro;
    }

    public void setLblMaestro(JLabel lblMaestro) {
        this.lblMaestro = lblMaestro;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JLabel getLblMateria() {
        return lblMateria;
    }

    public void setLblMateria(JLabel lblMateria) {
        this.lblMateria = lblMateria;
    }

    public JTextField getTxtApellidoP() {
        return txtApellidoP;
    }

    public void setTxtApellidoP(JTextField txtApellidoP) {
        this.txtApellidoP = txtApellidoP;
    }

    public JLabel getLblTurno() {
        return lblTurno;
    }

    public void setLblTurno(JLabel lblTurno) {
        this.lblTurno = lblTurno;
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

