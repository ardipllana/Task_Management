/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import EJB.TaskHistory;
import java.util.List;

public interface TaskHistoryInterface {
    void create(TaskHistory b) throws TaskHistoryException;
    void edit(TaskHistory b) throws TaskHistoryException;
    void remove(TaskHistory b) throws TaskHistoryException;
    List<TaskHistory> findAll() ;
    TaskHistory findByID(Integer id) throws TaskHistoryException;
}
