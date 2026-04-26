package UNAM.ICO.Ventana;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaImc extends Frame {
    Label label1;
    TextField texto;
    Label label2;
    TextField texto2;
    FlowLayout layout;
    Button Calcular;
    Label lblResultado;

    public VentanaImc(){

    }
    public VentanaImc(String titulo, int ancho, int alto){
        super (titulo);
        setSize(ancho, alto);
        Label lblpeso = new Label("Peso (Kg): ");
        texto = new TextField(20);
        Label lblaltura = new Label("Altura (m): ");
        texto2 = new TextField(20);
        layout = new FlowLayout();
        Calcular = new Button("Calcular IMC");
        lblResultado = new Label("Resultado: ");
        setLayout(new FlowLayout());
        add(lblpeso);
        add(texto);
        add(lblaltura);
        add(texto2);
        add(Calcular);
        add(lblResultado);

        Calcular.addActionListener(e -> {
            try {
                double peso = Double.parseDouble(texto.getText());
                double altura = Double.parseDouble(texto2.getText());
                double imc = peso / (altura * altura);
                lblResultado.setText(String.format("Tu IMC es: %.2f", imc));
            } catch (NumberFormatException ex) {
                lblResultado.setText("¡Error! Introduce solo números.");
            }
        });



        setVisible(true);

        addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );


    }
}
