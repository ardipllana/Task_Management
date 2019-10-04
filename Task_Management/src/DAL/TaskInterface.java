/**
     *
     * @param project_id
     * @return
     * @throws TaskException
*/

package DAL;

import EJB.Task;
import java.util.List;

public interface TaskInterface {
    void create(Task p) throws TaskException;
    void edit(Task p) throws TaskException;
    void remove(Task p) throws TaskException;
    List<Task> findAll();
    List<Task> findByProjectId(Integer project_id) throws TaskException;
    Task findByID(Integer id) throws TaskException;
}
