
package Models;

import EJB.TaskHistory;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class TaskHistoryComboBoxModel  extends AbstractListModel<TaskHistory> implements ComboBoxModel<TaskHistory> {
    
    private TaskHistory sItem;
    private List<TaskHistory> data;
    
    public TaskHistoryComboBoxModel(List arrayList){
        data = arrayList;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public TaskHistory getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        sItem = (TaskHistory)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return sItem;
    }
}
