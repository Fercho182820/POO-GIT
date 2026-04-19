package UNAM.ICO;

public class PartidoRugby {
    public static void main(String[] args) {
        Ala uno = new Ala("Ari");
        Apertura diez = new Apertura("Paco");

        System.out.println("--- JUGADA DE CONTACTO ---");
        uno.realizarTacle();
        uno.pescarBalon();

        System.out.println("\n--- LISTA DE DEFENSA ---");


    }
}
