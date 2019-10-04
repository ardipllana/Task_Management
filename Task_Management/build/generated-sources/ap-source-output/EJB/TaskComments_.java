package EJB;

import EJB.Task;
import EJB.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-03T17:15:26")
@StaticMetamodel(TaskComments.class)
public class TaskComments_ { 

    public static volatile SingularAttribute<TaskComments, Users> usersId;
    public static volatile SingularAttribute<TaskComments, String> comment;
    public static volatile SingularAttribute<TaskComments, Integer> id;
    public static volatile SingularAttribute<TaskComments, Task> taskId;

}