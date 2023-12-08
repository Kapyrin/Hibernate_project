package es.kapyrin.repository.dao;

import es.kapyrin.entity.City;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


public class CityDAO extends StoreRepository<City>{
    public CityDAO(SessionFactory sessionFactory) {
        super(City.class,sessionFactory);
    }

    public City getByName(String city) {
        Query<City> cityQuery = getCurrentSession().createQuery("select c from City c where c.city = :CITYNAME",City.class);
        cityQuery.setParameter("CITYNAME", city);
        cityQuery.setMaxResults(1);
        return cityQuery.getSingleResult();
    }
}
