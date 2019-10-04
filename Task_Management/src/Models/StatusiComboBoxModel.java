
package Models;

import EJB.Statusi;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class StatusiComboBoxModel  extends AbstractListModel<Statusi> implements ComboBoxModel<Statusi> {
    
    private Statusi sItem;
    private List<Statusi> data;
    
    public StatusiComboBoxModel(List arrayList){
        data = arrayList;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Statusi getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        sItem = (Statusi)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return sItem;
    }
}
