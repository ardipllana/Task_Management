/*
 * To change this license header, choose License Headers in UserProject Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import EJB.UserProject;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ardiit
 */
public class UserProjectTableModel extends AbstractTableModel{
    
    List<UserProject> list;
    String[] columns = {"Id", "User","Project"};

    public UserProjectTableModel() {
    }

    public UserProjectTableModel(List<UserProject> list) {
        this.list = list;
    }

    public void add(List<UserProject> list) {
        this.list = list;
    }

    
    public int getRowCount() {
        return list.size();
    }
    
    public int getColumnCount() {
        return columns.length;
    }

    public UserProject getUserProject(int i) {
        return list.get(i);
    }
     public String getColumnName(int col){
        return columns[col];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        UserProject s = getUserProject(rowIndex);

        switch (columnIndex) {
            case 0:
                return s.getId();
            case 1:
                return s.getUsersId();
            case 2:
                return s.getProjectId();
            default:
                 return null;
        }
    }

}
