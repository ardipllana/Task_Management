
package DAL;

import EJB.Project;
import java.util.List;

public interface ProjectInterface {
    void create(Project p) throws ProjectException;
    void edit(Project p) throws ProjectException;
    void remove(Project p) throws ProjectException;
    List<Project> findAll();
    Project findByID(Integer id) throws ProjectException;
}
