package UNAM.ICO.Ventana1;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JFrame{
    private

    public MyButton(){
        super("Ventana");

        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        JPanel pnl = new JPanel();
        pnl.setLayout(gridBagLayout);
        pnl.setBackground(new Color(100, 169, 245));

        JLabel lbl1 = new JLabel("USERNAME: ");
        c.gridx = 0;
        c.gridy = 0;
        pnl.add(lbl1,c);

        JTextField txtUsername = new JTextField(9);
        c.gridx=1;
        c.gridy=0;
        pnl.add(txtUsername,c);

        JLabel lblPassword = new JLabel("PASSWORD");
        c.gridx=0;
        c.gridy=1;
        pnl.add(lblPassword,c);

        JTextField txtPassword = new JTextField(12);
        c.gridx=1;
        c.gridy=1;
        pnl.add(txtPassword,c);

        JButton btn = new JButton("Login");
        c.gridx=1;
        c.gridy=2;
        pnl.add(btn,c);

        this.add(pnl);

        this.getContentPane().add(pnl,0);


        this.setVisible(true);
        this.setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }



    public static void main(String[] args) {
        MyButton myButton = new MyButton();

    }
}
