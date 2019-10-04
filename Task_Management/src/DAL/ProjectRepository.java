
package DAL;

import EJB.Project;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;


public class ProjectRepository extends EMClass implements ProjectInterface{

    public void create(Project a) throws ProjectException{
        try{
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        }
        catch(Throwable thro){
            if(thro.getMessage().contains("2627")){
            
                    throw new ProjectException("Data exists!");
            }
        else{
                throw new ProjectException("Create : "+thro.getClass()+" - "+thro.getMessage());
                }
        }
    }

    @Override
    public void edit(Project a) throws ProjectException{
      try{
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();
        }
        catch(Throwable thro){
            if(thro.getMessage().contains("2627")){
                    throw new ProjectException("Data exists");
            }
            else{
                throw new ProjectException("Update: "+thro.getClass()+" - "+thro.getMessage());
            }
                
        }
    }

    @Override
    public void remove(Project a) {
        em.getTransaction().begin();
        em.remove(a);
        em.getTransaction().commit();
    }

    @Override
    public List<Project> findAll() {
        return (List<Project>)em.createNamedQuery("Project.findAll").getResultList();
    }

    @Override
    public Project findByID(Integer id) throws ProjectException {
        Query query = em.createQuery("SELECT p FROM Project p WHERE p.id = :id");
        query.setParameter("id", id);
        try{
            return (Project)query.getSingleResult();
        } catch (NoResultException nre) {
              throw new ProjectException("Data does not exist!");
        }
        
    }
}

