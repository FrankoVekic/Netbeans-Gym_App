/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymapp.view;

import gymapp.model.Program;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 */
public class ProgramTableModel extends AbstractTableModel {

    private List<Program> programs;

    public ProgramTableModel(List<Program> programs) {
        this.programs = programs;
    }

    @Override
    public int getRowCount() {
        return programs == null ? 0 : programs.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Program p = programs.get(rowIndex);
        Object value = "??";
        switch (columnIndex) {
            case 0:
                value = p.getName();
                break;
            case 1:
                value = p.getDescription();
                break;
            case 2:
                value = p.getPrice() + " €";
                break;
        }
        return value;
    }

    private String[] colNames = new String[]{"Title", "Description", "Price"};

    @Override
    public String getColumnName(int col) {
        return colNames[col];
    }

    public Program getProgramAt(int row) {
        return programs.get(row);
    }
}
