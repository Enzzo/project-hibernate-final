package ru.javarush.vasilev;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import ru.javarush.vasilev.Entity.Person;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        try(Session session = sessionFactory.openSession()){
            NativeQuery nativeQuery = session.createNativeQuery("CREATE TABLE persons");
            System.out.println("DEBUG MESSAGE");
        }
    }
}
