package lesson33.ClassWork.service.impl;

import lesson33.ClassWork.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    //repository

    @Override
    public int summa(int a, int b) {
        return a + b;
    }
}
