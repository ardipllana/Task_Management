
package DAL;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;


public abstract class EMClass {
    EntityManager em=Persistence.createEntityManagerFactory("Task_ManagementPU").createEntityManager();
}
