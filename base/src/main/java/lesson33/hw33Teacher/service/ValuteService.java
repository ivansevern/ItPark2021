package lesson33.hw33Teacher.service;

import java.math.BigDecimal;
import java.util.Optional;

public interface ValuteService {
    Optional<BigDecimal> getValuteByCode(String code);
}
