package lk.ijse.orm.hostelManagementSystem.util;

import lk.ijse.orm.hostelManagementSystem.entity.Login;
import lk.ijse.orm.hostelManagementSystem.entity.Room;
import lk.ijse.orm.hostelManagementSystem.entity.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SessionFactoryConfig {

    private static SessionFactoryConfig factoryConfiguration;
    private final SessionFactory sessionFactory;

    private SessionFactoryConfig() throws HibernateException {
        sessionFactory = new Configuration()
                .mergeProperties(Utility.getProperties())
                .addAnnotatedClass(Login.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Room.class)
                .buildSessionFactory();
    }


    public static SessionFactoryConfig getInstance() {
        return (null == factoryConfiguration)
                ? factoryConfiguration = new SessionFactoryConfig()
                : factoryConfiguration;
    }


    public Session getSession() throws HibernateException {
        // Opens a new Session through the Session Factory & returns the Session created
        return sessionFactory.openSession();
    }
}
