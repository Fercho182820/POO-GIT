package UNAM.ICO.vista.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLOutput;

public class EventosRaton implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Coordenada: "+ e.getX() + " " + e.getY() + " ");
        System.out.println("Apachurrado");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
