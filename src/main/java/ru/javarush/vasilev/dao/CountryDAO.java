package ru.javarush.vasilev.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.javarush.vasilev.domain.Country;

import java.util.List;

public class CountryDAO {
    private final SessionFactory sessionFactory;

    public CountryDAO(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public List<Country> getAll(){
        Query<Country> query = sessionFactory.getCurrentSession().createQuery("SELECT c FROM Country c JOIN FETCH c.languages", Country.class);
        return query.list();
    }
}
