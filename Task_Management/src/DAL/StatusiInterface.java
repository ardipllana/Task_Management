
package DAL;

import EJB.Statusi;
import java.util.List;

public interface StatusiInterface {
    void create(Statusi p) throws StatusiException;
    void edit(Statusi p) throws StatusiException;
    void remove(Statusi p) throws StatusiException;
    List<Statusi> findAll();
    Statusi findByID(Integer id) throws StatusiException;
}
