
package Models;

import EJB.Users;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class UsersComboBoxModel  extends AbstractListModel<Users> implements ComboBoxModel<Users> {
    
    private Users sItem;
    private List<Users> data;
    
    public UsersComboBoxModel(List arrayList){
        data = arrayList;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Users getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        sItem = (Users)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return sItem;
    }
}
