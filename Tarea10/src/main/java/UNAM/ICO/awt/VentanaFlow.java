package UNAM.ICO.awt;

import lombok.Data;

import java.awt.*;
@Data
public class VentanaFlow extends Frame {
    Button boton1;
    TextField texto;
    FlowLayout layout;

    public VentanaFlow() {

    }

    public VentanaFlow(GraphicsConfiguration gc) {
        super(gc);
    }

    public VentanaFlow(String title) throws HeadlessException {
        super(title);
    }

    public VentanaFlow(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }
    public

}
