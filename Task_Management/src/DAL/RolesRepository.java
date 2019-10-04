
package DAL;

import EJB.Roles;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;


public class RolesRepository extends EMClass implements RolesInterface{

    public void create(Roles a) throws RolesException{
        try{
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        }
        catch(Throwable thro){
            if(thro.getMessage().contains("2627")){
            
                    throw new RolesException("Data exists!");
            }
        else{
                throw new RolesException("Create : "+thro.getClass()+" - "+thro.getMessage());
                }
        }
    }

    @Override
    public void edit(Roles a) throws RolesException{
      try{
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();
        }
        catch(Throwable thro){
            if(thro.getMessage().contains("2627")){
                    throw new RolesException("Data exists");
            }
            else{
                throw new RolesException("Update: "+thro.getClass()+" - "+thro.getMessage());
            }
                
        }
    }

    @Override
    public void remove(Roles a) {
        em.getTransaction().begin();
        em.remove(a);
        em.getTransaction().commit();
    }

    @Override
    public List<Roles> findAll() {
        return (List<Roles>)em.createNamedQuery("Roles.findAll").getResultList();
    }

    @Override
    public Roles findByID(Integer id) throws RolesException {
        Query query = em.createQuery("SELECT p FROM Roles p WHERE p.id = :id");
        query.setParameter("id", id);
        try{
            return (Roles)query.getSingleResult();
        } catch (NoResultException nre) {
              throw new RolesException("Data does not exist!");
        }
        
    }
}

