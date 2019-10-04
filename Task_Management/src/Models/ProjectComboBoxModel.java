
package Models;

import EJB.Project;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class ProjectComboBoxModel  extends AbstractListModel<Project> implements ComboBoxModel<Project> {
    
    private Project sItem;
    private List<Project> data;
    
    public ProjectComboBoxModel(List arrayList){
        data = arrayList;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Project getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        sItem = (Project)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return sItem;
    }
}
