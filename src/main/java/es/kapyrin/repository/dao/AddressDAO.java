package es.kapyrin.repository.dao;

import es.kapyrin.entity.Address;
import org.hibernate.SessionFactory;

public class AddressDAO extends StoreRepository<Address> {
    public AddressDAO(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
