package lesson30.hw30Teacher.service.impl;

import lesson30.hw30Teacher.model.City;
import lesson30.hw30Teacher.repository.CityRepository;
import lesson30.hw30Teacher.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    @Override
    public Optional<City> findByCode(Integer code) {
        return cityRepository.findById(code);
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void deleteByCode(Integer code) {
        cityRepository.deleteById(code);
    }
}
