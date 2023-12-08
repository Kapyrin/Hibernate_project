package es.kapyrin.repository.dao;

import es.kapyrin.entity.FilmText;
import org.hibernate.SessionFactory;

public class FilmTextDAO extends StoreRepository<FilmText> {
    public FilmTextDAO(SessionFactory sessionFactory) {
        super(FilmText.class, sessionFactory);
    }
}
