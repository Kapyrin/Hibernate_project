package es.kapyrin.repository.dao;

import es.kapyrin.entity.Actor;
import org.hibernate.SessionFactory;

public class ActorDAO extends StoreRepository<Actor> {

    public ActorDAO(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
