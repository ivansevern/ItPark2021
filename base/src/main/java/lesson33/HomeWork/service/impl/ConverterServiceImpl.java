package lesson33.HomeWork.service.impl;

import lesson33.HomeWork.service.ConverterService;
import org.springframework.stereotype.Service;

@Service
public class ConverterServiceImpl implements ConverterService {

    @Override
    public double summa(double a, double b) {
        return a / b;
    }
}
