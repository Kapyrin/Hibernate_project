package es.kapyrin.repository.dao;

import es.kapyrin.entity.Inventory;
import org.hibernate.SessionFactory;

public class InventoryDAO extends StoreRepository<Inventory> {
    public InventoryDAO(SessionFactory sessionFactory) {
        super(Inventory.class, sessionFactory);
    }
}
