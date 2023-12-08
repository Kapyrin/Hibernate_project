package es.kapyrin.repository.dao;

import es.kapyrin.entity.Country;
import org.hibernate.SessionFactory;

public class CountryDAO extends StoreRepository<Country> {
    public CountryDAO( SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }
}
