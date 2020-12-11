package Logic;

import Logic.Employee;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2020-12-11T17:46:16", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Juego.class)
public class Juego_ { 

    public static volatile ListAttribute<Juego, Employee> allAmployees;
    public static volatile SingularAttribute<Juego, String> name;
    public static volatile SingularAttribute<Juego, Integer> id_game;
    public static volatile SingularAttribute<Juego, Integer> min_age;
    public static volatile SingularAttribute<Juego, Integer> capacity;

}