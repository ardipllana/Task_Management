package EJB;

import EJB.Task;
import EJB.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-03T17:15:26")
@StaticMetamodel(TaskHistory.class)
public class TaskHistory_ { 

    public static volatile SingularAttribute<TaskHistory, Users> updatedBy;
    public static volatile SingularAttribute<TaskHistory, Integer> id;
    public static volatile SingularAttribute<TaskHistory, Date> updatedDate;
    public static volatile SingularAttribute<TaskHistory, Task> taskId;

}