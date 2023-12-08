package es.kapyrin.repository.dao;


import org.hibernate.*;
import jakarta.persistence.Query;

import java.util.List;

public abstract class StoreRepository<T> {
    private final Class<T> clazz;
    private SessionFactory sessionFactory;

    public StoreRepository(Class<T> clazz, SessionFactory sessionFactory) {
        this.clazz = clazz;
        this.sessionFactory = sessionFactory;
    }

    public T getById(int id) {
        return (T) getCurrentSession().get(clazz, id);
    }

    public List<T> getItems(int offset, int count) {
        Query query = getCurrentSession().createQuery("from " + clazz.getName(), clazz);
        query.setFirstResult(offset);
        query.setMaxResults(count);
        return query.getResultList();
    }

    public List<T> findAll() {
        return getCurrentSession().createQuery("from " + clazz.getName(), clazz).list();
    }
    public T save (T entity) {
        getCurrentSession().saveOrUpdate(entity);
        return entity;
    }
    public T update (T entity) {
        return (T) getCurrentSession().merge(entity);
    }
    public void delete(final T entity) {
        getCurrentSession().delete(entity);
    }
    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}
