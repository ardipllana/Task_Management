
package DAL;

import EJB.Project;
import EJB.Task;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;


public class TaskRepository extends EMClass implements TaskInterface{

    @Override
    public void create(Task a) throws TaskException{
        try{
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        }
        catch(Throwable thro){
            if(thro.getMessage().contains("2627")){
            
                    throw new TaskException("Data exists!");
            }
        else{
                throw new TaskException("Create : "+thro.getClass()+" - "+thro.getMessage());
                }
        }
    }

    @Override
    public void edit(Task a) throws TaskException{
      try{
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();
        }
        catch(Throwable thro){
            if(thro.getMessage().contains("2627")){
                    throw new TaskException("Data exists");
            }
            else{
                throw new TaskException("Update: "+thro.getClass()+" - "+thro.getMessage());
            }
                
        }
    }

    @Override
    public void remove(Task a) {
        em.getTransaction().begin();
        em.remove(a);
        em.getTransaction().commit();
    }

    @Override
    public List<Task> findAll() {
        return (List<Task>)em.createNamedQuery("Task.findAll").getResultList();
    }
    
    @Override
    public List<Task> findByProjectId(Integer project_id) throws TaskException {
            Query query = em.createQuery("SELECT t FROM Task t WHERE t.projectId = :project_id")
//            Query query = em.createQuery("SELECT p FROM Task t JOIN t.users p");
            .setParameter("project_id", new Project(project_id));
            try{
                return (List<Task>)query.getResultList();
            } catch (NoResultException nre) {
              throw new TaskException("Datas does not exist!");
        }
    }
    
    @Override
    public Task findByID(Integer id) throws TaskException {
        Query query = em.createQuery("SELECT p FROM Task p WHERE p.id = :id");
        query.setParameter("id", id);
        try{
            return (Task)query.getSingleResult();
        } catch (NoResultException nre) {
              throw new TaskException("Data does not exist!");
        }
        
    }
}

