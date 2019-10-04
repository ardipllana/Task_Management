
package DAL;

import EJB.Roles;
import java.util.List;

public interface RolesInterface {
    void create(Roles p) throws RolesException;
    void edit(Roles p) throws RolesException;
    void remove(Roles p) throws RolesException;
    List<Roles> findAll();
    Roles findByID(Integer id) throws RolesException;
}
