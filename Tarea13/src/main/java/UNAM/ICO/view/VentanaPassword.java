package UNAM.ICO.view;

import javax.swing.*;
import java.awt.*;

public class VentanaPassword extends JFrame {

    private JPanel pnl;
    private JLabel lblUsername;
    private JTextField txtUsername;
    private JLabel lblPassword;
    private JTextField txtPassword;
    private JButton btnLogin;

    public VentanaPassword(){
        super("GALERIA");

        //INICIAR CUADRICULA
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        //DECLARAR PANELES
        pnl = new JPanel();
        pnl.setBackground(new Color(38, 107, 148));
        pnl.setLayout(gridBagLayout);
        //DECLARAR/AGREGAR/ASIGNAR COMPONENTES
        lblUsername = new JLabel("USERNAME");
        c.gridx=0;
        c.gridy=0;
        pnl.add(lblUsername,c);

        txtUsername = new JTextField(12);
        c.gridx=1;
        c.gridy=0;
        pnl.add(txtUsername,c);

        lblPassword = new JLabel("PASSWORD");
        c.gridx=0;
        c.gridy=1;
        pnl.add(lblPassword,c);

        txtPassword = new JTextField(12);
        c.gridx=1;
        c.gridy=1;
        pnl.add(txtPassword,c);

        btnLogin = new JButton("Login");
        c.gridx=1;
        c.gridy=2;
        pnl.add(btnLogin,c);

        this.add(pnl);
        //DECLARAR PANEL AL FRAME
        this.getContentPane().add(pnl,0);
        //TAMAÑO Y VISIBILIDAD
        setSize(800,600);
        setVisible(true);
        //CIERRE DE PAGINA
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public JPanel getPnl() {
        return pnl;
    }

    public void setPnl(JPanel pnl) {
        this.pnl = pnl;
    }

    public JLabel getLblUsername() {
        return lblUsername;
    }

    public void setLblUsername(JLabel lblUsername) {
        this.lblUsername = lblUsername;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public void setTxtUsername(JTextField txtUsername) {
        this.txtUsername = txtUsername;
    }

    public JLabel getLblPassword() {
        return lblPassword;
    }

    public void setLblPassword(JLabel lblPassword) {
        this.lblPassword = lblPassword;
    }

    public JTextField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(JTextField txtPassword) {
        this.txtPassword = txtPassword;
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(JButton btnLogin) {
        this.btnLogin = btnLogin;
    }
}
