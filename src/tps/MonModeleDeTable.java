/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Titouan
 */
public class MonModeleDeTable extends AbstractTableModel {

    private String[] columnNames = {"Numéro", "Nom", "Métier", "Supérieur", "Date d'embauche", "Salaire", "Commission", "Service"};
    private Object[][] data = new Object[50][8];

    public int getRowCount() {

        return data.length;

    }

    public int getColumnCount() {

        return columnNames.length;

    }

    public Object getValueAt(int row, int col) {

        return data[row][col]; // Retourne la valeur située à la ligne row et colonne col du tableau

    }

    public void setValueAt(Object value, int row, int col) {

        data[row][col] = value; // On met la valeur passée en paramètre dans le tableau data                                                                                           // à la ligne row (2ème paramètre) et à la colonne col (3ème paramètre).

        fireTableCellUpdated(row, col); // Pour active la mise à jour

    }

    public String getColumnName(int col) {

        return columnNames[col];

    }

}
