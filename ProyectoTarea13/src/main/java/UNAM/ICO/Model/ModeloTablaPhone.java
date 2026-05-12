package UNAM.ICO.Model;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

public class ModeloTablaPhone implements TableModel {
    private ArrayList<SmartPhone> data;

    public ModeloTablaPhone(ArrayList<SmartPhone> info) {
        this.data = info;
    }

    @Override
    public int getRowCount() {
        return data.size();

    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columName = "";
        switch (columnIndex) {
            case 0:
                columName = "Marca";
                break;
            case 1:
                columName = "Modelo";
                break;
            case 2:
                columName = "Precio";
                break;
            default:
                columName = "NA";
                break;
        }
        return columName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {

        switch (columnIndex){
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return Float.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SmartPhone phone = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return phone.getMarca();
            case 1:
                return phone.getModelo();
            case 2:
                return phone.getPrecio();
            default:
                return "NA";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void agregarTelefono( SmartPhone tel){
        this.data.add(tel);

    }
    public SmartPhone getTelefono (int index){
        return this.data.get(index);
    }
}
