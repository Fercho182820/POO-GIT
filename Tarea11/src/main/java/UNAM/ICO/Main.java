package UNAM.ICO;

import UNAM.ICO.Ventana.VentanaImc;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

       // CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
       // Scanner teclado = new Scanner(System.in);
//
//        try {
//
//            System.out.println("Ingrese su peso: ");
//            calculadoraIMC.setPeso(teclado.nextDouble());
//            System.out.println("Ingrese su altura: ");
//            calculadoraIMC.setAltura(teclado.nextDouble());
//            calculadoraIMC.calcularIMC();
//
//        }catch (InputMismatchException e){
//            System.out.println("Error revisa tu entrada");
//            System.out.println(e.getMessage());
//        }catch (NullPointerException e){
//            System.out.println("Objeto nulo Revisa tu entrada");
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            System.out.println("Error desconocido");
//            System.out.println(e.getMessage());
//        }
//        System.out.println("Su IMC es: "+ calculadoraIMC.getImc());


        VentanaImc ventanaImc = new VentanaImc("Descubra su IMC",800,600);



    }
}
