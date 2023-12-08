package es.kapyrin.repository.dao;

import es.kapyrin.entity.Staff;
import org.hibernate.SessionFactory;

public class StaffDAO extends StoreRepository<Staff> {
    public StaffDAO(SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}
