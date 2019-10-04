package EJB;

import EJB.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-03T17:15:26")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile SingularAttribute<Roles, String> name;
    public static volatile SingularAttribute<Roles, Integer> id;
    public static volatile CollectionAttribute<Roles, Users> usersCollection;

}