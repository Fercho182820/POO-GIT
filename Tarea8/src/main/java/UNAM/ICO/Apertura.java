package UNAM.ICO;

public class Apertura implements Pateador, Tacleador {
    private String nombre;

    public Apertura() {
    }

    public Apertura(String nombre) {
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
        return "Apertura{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void patearConverdion() {
        System.out.println(nombre + " se concentra, corre y...¡Balon entre los postes!");


    }

    @Override
    public void despejarBalon() {
        System.out.println(nombre + " patea al fondo para ganar territorio");

    }

    @Override
    public void realizarTacle() {
        System.out.println(nombre + "realiza un tacle defensivo para frenar el avance");

    }
}
