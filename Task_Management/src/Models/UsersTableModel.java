/*
 * To change this license header, choose License Headers in Users Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import EJB.Users;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ardiit
 */
public class UsersTableModel extends AbstractTableModel{
    
    List<Users> list;
    String[] columns = {"Id", "Name","Username","Password"};

    public UsersTableModel() {
    }

    public UsersTableModel(List<Users> list) {
        this.list = list;
    }

    public void add(List<Users> list) {
        this.list = list;
    }

    
    public int getRowCount() {
        return list.size();
    }
    
    public int getColumnCount() {
        return columns.length;
    }

    public Users getUsers(int i) {
        return list.get(i);
    }
     public String getColumnName(int col){
        return columns[col];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Users s = getUsers(rowIndex);

        switch (columnIndex) {
            case 0:
                return s.getId();
            case 1:
                return s.getName();
            case 2:
                return s.getUsername();   
            case 3:
                return s.getPassword();
            default:
                 return null;
        }
    }

}
