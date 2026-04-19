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

    @Override
    public String toString() {
        return "Ala{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void realizarTacle() {

    }

    @Override
    public void pescarBalon() {

    }
}
