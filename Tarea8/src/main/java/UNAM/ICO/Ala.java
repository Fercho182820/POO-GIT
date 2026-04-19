package UNAM.ICO;

public class Ala implements Tacleador, Recuperador {
    private String nombre;

    public Ala() {
    }

    public Ala(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ala{" +
                "nombre='" + nombre + '\'' +
                '}';
    }


    @Override
    public void realizarTacle() {
        System.out.println("El Ala " + nombre + " mete un tacle ofensivo y manda al rival hacia atras. ");

    }

    @Override
    public void pescarBalon() {
        System.out.println(nombre + " llega primero al ruck, pone las manos en el balón");

    }
}
