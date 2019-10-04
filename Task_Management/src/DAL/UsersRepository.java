/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import EJB.Users;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;


public class UsersRepository extends EMClass implements UsersInterface{

    public void create(Users b) throws UsersException{
        try{
            em.getTransaction().begin();
            em.persist(b);
            em.getTransaction().commit();
        }
        catch(Throwable thro){
            if(thro.getMessage().contains("2627")){
            
                    throw new UsersException("Data exists!");
            }
        else{
                throw new UsersException("Create : "+thro.getClass()+" - "+thro.getMessage());
                }
        }
    }

    @Override
    public void edit(Users b) throws UsersException{
      try{
            em.getTransaction().begin();
            em.merge(b);
            em.getTransaction().commit();
        }
        catch(Throwable thro){
            if(thro.getMessage().contains("2627")){
                    throw new UsersException("Data exists");
            }
            else{
                throw new UsersException("Update: "+thro.getClass()+" - "+thro.getMessage());
            }
                
        }
    }

    @Override
    public void remove(Users b) {
        em.getTransaction().begin();
        em.remove(b);
        em.getTransaction().commit();
    }

    @Override
    public List<Users> findAll() {
        return (List<Users>)em.createNamedQuery("Users.findAll").getResultList();
    }

    @Override
    public Users findByID(Integer id) throws UsersException {
        Query query = em.createQuery("SELECT b FROM Users b WHERE b.id = :id");
        query.setParameter("id", id);
        try{
            return (Users)query.getSingleResult();
        } catch (NoResultException nre) {
              throw new UsersException("Data does not exist!");
        }
        
    }
}

