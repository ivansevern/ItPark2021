package lesson33.HomeWork.service.impl;

import lesson33.HomeWork.service.CurrencyConverterService;
import org.springframework.stereotype.Service;

@Service
public class CurrencyConverterServiceImpl implements CurrencyConverterService {
    @Override
    public double result(double a, double b) {
        return a/b;
    }
}
