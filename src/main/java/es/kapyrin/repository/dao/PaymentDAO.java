package es.kapyrin.repository.dao;

import es.kapyrin.entity.Payment;
import org.hibernate.SessionFactory;

public class PaymentDAO extends StoreRepository<Payment> {
    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
