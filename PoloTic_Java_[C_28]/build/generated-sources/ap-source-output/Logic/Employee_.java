package Logic;

import Logic.User;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-12-11T15:34:21", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, String> charge;
    public static volatile SingularAttribute<Employee, String> name;
    public static volatile SingularAttribute<Employee, Integer> employeeID;
    public static volatile SingularAttribute<Employee, User> user;
    public static volatile SingularAttribute<Employee, String> dni;

}