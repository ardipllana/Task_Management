package EJB;

import EJB.Project;
import EJB.Task;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-03T17:15:26")
@StaticMetamodel(TaskProject.class)
public class TaskProject_ { 

    public static volatile SingularAttribute<TaskProject, Integer> id;
    public static volatile SingularAttribute<TaskProject, Project> projectId;
    public static volatile SingularAttribute<TaskProject, Task> taskId;

}