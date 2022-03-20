package lesson33.HomeWork.controller;

import lesson33.HomeWork.dto.ResultDto;
import lesson33.HomeWork.service.ConverterService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/currencyConverter") //calculator
public class InputController {

    @Value("${spring.application.name}")
    private String application;

    private final ConverterService converterService;

    @PostMapping("/summa")
    public ResultDto summa(@RequestParam("arg1") Double a, @RequestParam("arg2") Double b) {
        return new ResultDto(application, converterService.summa(a, b));
    }
}
