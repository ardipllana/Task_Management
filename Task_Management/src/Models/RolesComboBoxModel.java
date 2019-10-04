
package Models;

import EJB.Roles;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class RolesComboBoxModel  extends AbstractListModel<Roles> implements ComboBoxModel<Roles> {
    
    private Roles sItem;
    private List<Roles> data;
    
    public RolesComboBoxModel(List arrayList){
        data = arrayList;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Roles getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        sItem = (Roles)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return sItem;
    }
}
