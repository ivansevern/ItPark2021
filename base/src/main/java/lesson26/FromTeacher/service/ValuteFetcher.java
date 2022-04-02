package lesson26.FromTeacher.service;

import java.math.BigDecimal;
import java.util.Optional;

public interface ValuteFetcher {

    Optional<BigDecimal> getValuteByCode(String code);
//    Optional<String> getNameByCode(String nameCode);

}
