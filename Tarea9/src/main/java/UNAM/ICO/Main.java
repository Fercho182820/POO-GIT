package UNAM.ICO;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su peso: ");
        calculadoraIMC.setPeso(teclado.nextDouble());

        System.out.println("Ingrese su altura");
        calculadoraIMC.setAltura(teclado.nextDouble());

        System.out.println("Su IMC es: "+ calculadoraIMC.getImc());


    }
}
