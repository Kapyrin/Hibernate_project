package es.kapyrin.repository.dao;

import java.util.List;

public interface Repository <T>{
    List<T> getAll();
    List<T> find(T entity);
    T get(long id);
    void create (T entity);
    void update (T entity);
    void delete(T entity);

}
