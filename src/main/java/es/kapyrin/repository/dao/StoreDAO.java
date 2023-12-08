package es.kapyrin.repository.dao;

import es.kapyrin.entity.Store;
import org.hibernate.SessionFactory;

public class StoreDAO extends StoreRepository<Store> {
    public StoreDAO(SessionFactory sessionFactory) {
        super(Store.class, sessionFactory);
    }
}
