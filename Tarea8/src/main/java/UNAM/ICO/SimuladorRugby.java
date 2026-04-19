package UNAM.ICO;

import java.util.ArrayList;
import java.util.List;

public class SimuladorRugby {
    public static void main(String[] args) {
        Apertura diez = new Apertura("Sexton");
        Ala uno = new Ala ("Ari");

        // Lista de puros tacleadores (no importa la posición)
        List<Tacleador> defensa = new ArrayList<>();
        defensa.add(diez);
        defensa.add(uno);

        System.out.println("--- FASE DEFENSIVA ---");
        for (Tacleador jugador : defensa) {
            jugador.realizarTacle();
        }

        System.out.println("\n--- FASE ESTÁTICA ---");
       diez.despejarBalon();

        System.out.println("\n--- PUNTAJE ---");
        diez.patearConverdion();
    }
}
