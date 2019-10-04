package EJB;

import EJB.Task;
import EJB.TaskProject;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-03T17:15:26")
@StaticMetamodel(Project.class)
public class Project_ { 

    public static volatile CollectionAttribute<Project, Task> taskCollection;
    public static volatile SingularAttribute<Project, Date> endDate;
    public static volatile CollectionAttribute<Project, TaskProject> taskProjectCollection;
    public static volatile SingularAttribute<Project, String> name;
    public static volatile SingularAttribute<Project, String> description;
    public static volatile SingularAttribute<Project, Integer> id;
    public static volatile SingularAttribute<Project, Date> startDate;

}