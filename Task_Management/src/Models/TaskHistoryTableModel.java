/*
 * To change this license header, choose License Headers in TaskHistory Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import EJB.TaskHistory;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ardiit
 */
public class TaskHistoryTableModel extends AbstractTableModel{
    
    List<TaskHistory> list;
    String[] columns = {"Id", "Task Id","Updated By","Updated Date"};

    public TaskHistoryTableModel() {
    }

    public TaskHistoryTableModel(List<TaskHistory> list) {
        this.list = list;
    }

    public void add(List<TaskHistory> list) {
        this.list = list;
    }

    
    public int getRowCount() {
        return list.size();
    }
    
    public int getColumnCount() {
        return columns.length;
    }

    public TaskHistory getTaskHistory(int i) {
        return list.get(i);
    }
     public String getColumnName(int col){
        return columns[col];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        TaskHistory s = getTaskHistory(rowIndex);
        
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        switch (columnIndex) {
            case 0:
                return s.getId();
            case 1:
                return s.getTaskId();
            case 2:
                return s.getUpdatedBy();   
            case 3:
                return df.format(s.getUpdatedDate());
            default:
                 return null;
        }
    }

}
