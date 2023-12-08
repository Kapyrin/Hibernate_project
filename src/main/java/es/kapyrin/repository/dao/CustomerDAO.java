package es.kapyrin.repository.dao;

import es.kapyrin.entity.Customer;
import org.hibernate.SessionFactory;

public class CustomerDAO extends StoreRepository<Customer> {
    public CustomerDAO(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}
