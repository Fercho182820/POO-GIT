package UNAM.ICO;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

public class ModeloComboNombres implements ComboBoxModel {
    private ArrayList<String> nombres;
    private String selectedItem;

    public ModeloComboNombres(ArrayList<String> nombres) {
        this.nombres = nombres;
    }

    public ArrayList<String> getNombres() {
        return this.nombres;
    }

    public void setNombres(ArrayList<String> nombres) {
        this.nombres = nombres;
    }

    public void setSelectedItem(Object anItem) {
        this.selectedItem = (String)anItem;
    }

    public Object getSelectedItem() {
        return this.selectedItem;
    }

    public int getSize() {
        return this.nombres.size();
    }

    public Object getElementAt(int index) {
        return this.nombres.get(index);
    }

    public void addListDataListener(ListDataListener l) {
    }

    public void removeListDataListener(ListDataListener l) {
    }
}
