package ru.javarush.vasilev.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.javarush.vasilev.domain.City;

import java.util.List;

public class CityDAO {
    private final SessionFactory sessionFactory;

    public CityDAO(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public City getById(Integer id){
        Query<City> query = sessionFactory.getCurrentSession().createQuery("SELECT c FROM City c join fetch c.country where c.id = :ID", City.class);
        query.setParameter("ID", id);
        return query.getSingleResult();
    }

    public List<City> getItems(int offset, int limit){
        Query<City> query = sessionFactory.getCurrentSession().createQuery("SELECT c FROM City c");
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.list();
    }

    public int getTotalCount(){
        Query<Long> query = sessionFactory.getCurrentSession().createQuery("SELECT count(c) FROM City c", Long.class);
        return Math.toIntExact(query.uniqueResult());
    }
}
