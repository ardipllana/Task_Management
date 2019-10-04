
package DAL;

import EJB.Statusi;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;


public class StatusiRepository extends EMClass implements StatusiInterface{

    public void create(Statusi a) throws StatusiException{
        try{
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        }
        catch(Throwable thro){
            if(thro.getMessage().contains("2627")){
            
                    throw new StatusiException("Data exists!");
            }
        else{
                throw new StatusiException("Create : "+thro.getClass()+" - "+thro.getMessage());
                }
        }
    }

    @Override
    public void edit(Statusi a) throws StatusiException{
      try{
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();
        }
        catch(Throwable thro){
            if(thro.getMessage().contains("2627")){
                    throw new StatusiException("Data exists");
            }
            else{
                throw new StatusiException("Update: "+thro.getClass()+" - "+thro.getMessage());
            }
                
        }
    }

    @Override
    public void remove(Statusi a) {
        em.getTransaction().begin();
        em.remove(a);
        em.getTransaction().commit();
    }

    @Override
    public List<Statusi> findAll() {
        return (List<Statusi>)em.createNamedQuery("Statusi.findAll").getResultList();
    }

    @Override
    public Statusi findByID(Integer id) throws StatusiException {
        Query query = em.createQuery("SELECT p FROM Statusi p WHERE p.id = :id");
        query.setParameter("id", id);
        try{
            return (Statusi)query.getSingleResult();
        } catch (NoResultException nre) {
              throw new StatusiException("Data does not exist!");
        }
        
    }
}

