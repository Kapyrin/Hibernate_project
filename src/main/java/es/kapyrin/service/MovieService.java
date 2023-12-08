package es.kapyrin.service;

import es.kapyrin.repository.dao.StoreRepository;

public class MovieService {
    private final StoreRepository storeRepository;

    public MovieService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }
}
