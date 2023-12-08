package es.kapyrin.repository.dao;

import es.kapyrin.entity.Rental;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class RentalDAO extends StoreRepository<Rental> {
    public RentalDAO(SessionFactory sessionFactory) {
        super(Rental.class, sessionFactory);
    }

    public Rental getAnyUnreturnedRental() {
        Query<Rental> rentalQuery = getCurrentSession().createQuery("select r from Rental r where r.rentalDate is null ", Rental.class);
        rentalQuery.setMaxResults(1);
        return rentalQuery.getSingleResult();
    }
}
