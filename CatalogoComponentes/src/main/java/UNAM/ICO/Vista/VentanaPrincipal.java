package UNAM.ICO.Vista;

import javax.swing.*;
import java.awt.*;
import java.util.PrimitiveIterator;

public class VentanaPrincipal extends JFrame {
    private JPanel pnlPrincipal;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JButton btn1;

    public VentanaPrincipal(){
        super ("Ventana Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        //CREAR COMPONENTES
        pnlPrincipal = new JPanel();
        pnlPrincipal.setLayout(new GridBagLayout());
        pnlPrincipal.setBackground(new Color(221,180,175));

        radioButton1 = new JRadioButton("IOS");
        c.gridx = 0;
        c.gridy = 0;
        add(radioButton1,c);

        radioButton2 = new JRadioButton("ANDROID");
        c.gridx = 0;
        c.gridy = 1;
        add(radioButton2,c);

        checkBox1 = new JCheckBox("Acepto los terminos y condiciones");
        c.gridx = 1;
        c.gridy = 0;
        add(checkBox1,c);

        checkBox2 = new JCheckBox("Acepto recibir notificaciones");
        c.gridx = 1;
        c.gridy = 1;
        add(checkBox2);

        checkBox3 = new JCheckBox("Reformat");
        c.gridx = 2;
        c.gridy = 2;
        add(checkBox3,c);

        btn1 = new JButton("Presioname");
        c.gridx = 2;
        c.gridy = 2;



        //ADD PNL
        pnlPrincipal.add(radioButton1);
        pnlPrincipal.add(radioButton2);
        pnlPrincipal.add(checkBox1);
        pnlPrincipal.add(checkBox2);
        pnlPrincipal.add(checkBox3);
        pnlPrincipal.add(btn1);


        //PANEL FRAME
        this.add(pnlPrincipal);
        this.getContentPane().add(pnlPrincipal,0);
        setSize(600,800);
        setVisible(true);









    }
}
