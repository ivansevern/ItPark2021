package lesson39.hw39Teacher.service;

import lesson39.hw39Teacher.dto.CityDto;

import java.util.Optional;
import java.util.Set;

public interface CityDictionaryService {
    Set<CityDto> getCities();
    Optional<CityDto> getCityByCode(String code);
}
