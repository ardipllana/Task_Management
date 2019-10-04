/*
 * To change this license header, choose License Headers in Task Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import EJB.Task;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ardiit
 */
public class TaskTableModel extends AbstractTableModel{
    
    List<Task> list;
    String[] columns = {"Id", "Name","Project ID","Description","Start Date","End Date","Created By","Created Date","Status","Assigned to"};

    public TaskTableModel() {
    }

    public TaskTableModel(List<Task> list) {
        this.list = list;
    }

    public void add(List<Task> list) {
        this.list = list;
    }

    
    public int getRowCount() {
        return list.size();
    }
    
    public int getColumnCount() {
        return columns.length;
    }

    public Task getTask(int i) {
        return list.get(i);
    }
     public String getColumnName(int col){
        return columns[col];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Task s = getTask(rowIndex);
        
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        switch (columnIndex) {
            case 0:
                return s.getId();
            case 1:
                return s.getName();
            case 2:
                return s.getProjectId();
            case 3:
                return s.getDescription();   
            case 4:
                return df.format(s.getStartDate());
            case 5:
                return df.format(s.getEndDate());
            case 6:
                return s.getCreatedBy();
            case 7:
                return df.format(s.getCreatedDate());
            case 8:
                return s.getStatusId();
            case 9:
                return s.getUsersId();
            default:
                 return null;
        }
    }

}
