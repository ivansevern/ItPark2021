package lesson33.hw33Teacher.controller;

import lesson26.hw26Teacher.service.ValuteFetcher;
import lesson33.hw33Teacher.dto.ValuteDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ValuteController {

    private final ValuteFetcher valuteFetcher;

    @GetMapping("/currency")
    public ValuteDto getValue(@RequestParam String code) {
        return new ValuteDto(code, valuteFetcher.getValuteByCode(code)
                .orElseThrow(() -> new IllegalArgumentException(String.format("Информации по валюте с кодом %s не найдено в системе", code))));
    }
}
