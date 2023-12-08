package es.kapyrin.repository.dao;

import es.kapyrin.entity.Category;
import org.hibernate.SessionFactory;

public class CategoryDAO extends StoreRepository<Category> {
    public CategoryDAO( SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
