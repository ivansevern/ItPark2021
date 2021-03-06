package lesson26.FromTeacher.service.impl;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import lesson26.FromTeacher.service.ValuteFetcher;
import lombok.SneakyThrows;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ValuteFeatcherImpl implements ValuteFetcher {

    private Map<String, BigDecimal> dictionaryValutes = Collections.emptyMap();


    @PostConstruct
    @SneakyThrows //обработка exception
    void init() {
        final DocumentContext context = JsonPath.parse(new URL("https://www.cbr-xml-daily.ru/daily_json.js"));
        final List<Map<String, Object>> valutes = context.read("$.Valute.*", List.class);
        dictionaryValutes = valutes.stream()
                .map(it -> Pair.of(it.get("CharCode").toString(), new BigDecimal(it.get("Value").toString())))
                .collect(Collectors.toMap(Pair::getLeft, Pair::getRight));
    }

    public Optional<BigDecimal> getValuteByCode(String code) {
        return Optional.ofNullable(dictionaryValutes.get(code));
    }
}
