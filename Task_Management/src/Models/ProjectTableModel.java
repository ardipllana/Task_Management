/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import EJB.Project;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ardiit
 */
public class ProjectTableModel extends AbstractTableModel{
    
    List<Project> list;
    String[] columns = {"Id", "Name","Description","Start Date","End Date"};

    public ProjectTableModel() {
    }

    public ProjectTableModel(List<Project> list) {
        this.list = list;
    }

    public void add(List<Project> list) {
        this.list = list;
    }

    
    public int getRowCount() {
        return list.size();
    }
    
    public int getColumnCount() {
        return columns.length;
    }

    public Project getProject(int i) {
        return list.get(i);
    }
     public String getColumnName(int col){
        return columns[col];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Project s = getProject(rowIndex);
        
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        switch (columnIndex) {
            case 0:
                return s.getId();
            case 1:
                return s.getName();
            case 2:
                return s.getDescription();   
            case 3:
                return df.format(s.getStartDate());
            case 4:
                return df.format(s.getEndDate());
            default:
                 return null;
        }
    }

}
