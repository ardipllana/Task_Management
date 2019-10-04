package EJB;

import EJB.Project;
import EJB.TaskComments;
import EJB.TaskHistory;
import EJB.TaskProject;
import EJB.UserTask;
import EJB.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-03T17:15:26")
@StaticMetamodel(Task.class)
public class Task_ { 

    public static volatile SingularAttribute<Task, Date> endDate;
    public static volatile CollectionAttribute<Task, TaskProject> taskProjectCollection;
    public static volatile SingularAttribute<Task, String> description;
    public static volatile CollectionAttribute<Task, TaskComments> taskCommentsCollection;
    public static volatile SingularAttribute<Task, Date> createdDate;
    public static volatile SingularAttribute<Task, Users> createdBy;
    public static volatile CollectionAttribute<Task, TaskHistory> taskHistoryCollection;
    public static volatile SingularAttribute<Task, String> name;
    public static volatile CollectionAttribute<Task, UserTask> userTaskCollection;
    public static volatile SingularAttribute<Task, Integer> id;
    public static volatile SingularAttribute<Task, Project> projectId;
    public static volatile SingularAttribute<Task, Date> startDate;
    public static volatile SingularAttribute<Task, Integer> status;

}