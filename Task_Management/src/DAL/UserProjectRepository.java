/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import EJB.UserProject;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;


public class UserProjectRepository extends EMClass implements UserProjectInterface{

    public void create(UserProject b) throws UserProjectException{
        try{
            em.getTransaction().begin();
            em.persist(b);
            em.getTransaction().commit();
        }
        catch(Throwable thro){
            if(thro.getMessage().contains("2627")){
            
                    throw new UserProjectException("Data exists!");
            }
        else{
                throw new UserProjectException("Create : "+thro.getClass()+" - "+thro.getMessage());
                }
        }
    }

    @Override
    public void edit(UserProject b) throws UserProjectException{
      try{
            em.getTransaction().begin();
            em.merge(b);
            em.getTransaction().commit();
        }
        catch(Throwable thro){
            if(thro.getMessage().contains("2627")){
                    throw new UserProjectException("Data exists");
            }
            else{
                throw new UserProjectException("Update: "+thro.getClass()+" - "+thro.getMessage());
            }
                
        }
    }

    @Override
    public void remove(UserProject b) {
        em.getTransaction().begin();
        em.remove(b);
        em.getTransaction().commit();
    }

    @Override
    public List<UserProject> findAll() {
        return (List<UserProject>)em.createNamedQuery("UserProject.findAll").getResultList();
    }

    @Override
    public UserProject findByID(Integer id) throws UserProjectException {
        Query query = em.createQuery("SELECT b FROM UserProject b WHERE b.id = :id");
        query.setParameter("id", id);
        try{
            return (UserProject)query.getSingleResult();
        } catch (NoResultException nre) {
              throw new UserProjectException("Data does not exist!");
        }
        
    }
}

