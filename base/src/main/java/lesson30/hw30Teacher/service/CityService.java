package lesson30.hw30Teacher.service;

import lesson30.hw30Teacher.model.City;

import java.util.Optional;

public interface CityService {

    Optional<City> findByCode(Integer code);
    City save(City city);
    void deleteByCode(Integer code);
}
