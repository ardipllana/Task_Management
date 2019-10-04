package EJB;

import EJB.Task;
import EJB.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-03T17:15:26")
@StaticMetamodel(UserTask.class)
public class UserTask_ { 

    public static volatile SingularAttribute<UserTask, Users> usersId;
    public static volatile SingularAttribute<UserTask, Integer> id;
    public static volatile SingularAttribute<UserTask, Task> taskId;

}