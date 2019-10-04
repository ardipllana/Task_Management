
package DAL;

import EJB.TaskHistory;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;


public class TaskHistoryRepository extends EMClass implements TaskHistoryInterface{

    public void create(TaskHistory a) throws TaskHistoryException{
        try{
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        }
        catch(Throwable thro){
            if(thro.getMessage().contains("2627")){
            
                    throw new TaskHistoryException("Data exists!");
            }
        else{
                throw new TaskHistoryException("Create : "+thro.getClass()+" - "+thro.getMessage());
                }
        }
    }

    @Override
    public void edit(TaskHistory a) throws TaskHistoryException{
      try{
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();
        }
        catch(Throwable thro){
            if(thro.getMessage().contains("2627")){
                    throw new TaskHistoryException("Data exists");
            }
            else{
                throw new TaskHistoryException("Update: "+thro.getClass()+" - "+thro.getMessage());
            }
                
        }
    }

    @Override
    public void remove(TaskHistory a) {
        em.getTransaction().begin();
        em.remove(a);
        em.getTransaction().commit();
    }

    @Override
    public List<TaskHistory> findAll() {
        return (List<TaskHistory>)em.createNamedQuery("TaskHistory.findAll").getResultList();
    }

    @Override
    public TaskHistory findByID(Integer id) throws TaskHistoryException {
        Query query = em.createQuery("SELECT p FROM TaskHistory p WHERE p.id = :id");
        query.setParameter("id", id);
        try{
            return (TaskHistory)query.getSingleResult();
        } catch (NoResultException nre) {
              throw new TaskHistoryException("Data does not exist!");
        }
        
    }
}

