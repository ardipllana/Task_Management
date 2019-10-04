package EJB;

import EJB.Roles;
import EJB.Task;
import EJB.TaskComments;
import EJB.TaskHistory;
import EJB.UserTask;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-03T17:15:26")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> password;
    public static volatile CollectionAttribute<Users, TaskComments> taskCommentsCollection;
    public static volatile CollectionAttribute<Users, Task> taskCollection;
    public static volatile SingularAttribute<Users, Roles> roleId;
    public static volatile CollectionAttribute<Users, TaskHistory> taskHistoryCollection;
    public static volatile SingularAttribute<Users, String> name;
    public static volatile CollectionAttribute<Users, UserTask> userTaskCollection;
    public static volatile SingularAttribute<Users, Integer> id;
    public static volatile SingularAttribute<Users, String> username;

}