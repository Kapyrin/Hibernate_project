package es.kapyrin.repository.dao;

import es.kapyrin.entity.Language;
import org.hibernate.SessionFactory;

public class LanguageDAO extends StoreRepository<Language> {
    public LanguageDAO(SessionFactory sessionFactory) {
        super(Language.class, sessionFactory);
    }
}
