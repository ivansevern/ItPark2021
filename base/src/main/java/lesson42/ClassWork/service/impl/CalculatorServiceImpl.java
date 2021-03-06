package lesson42.ClassWork.service.impl;

import lesson42.ClassWork.service.CalculatorService;
import lesson42.ClassWork.service.PrintService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalculatorServiceImpl implements CalculatorService {

    private final PrintService printService;

    @Override
    public int summa(int a, int b) {
        printService.print("первого аргумента " + a);
        printService.print("второго аргумента " + b);
        printService.print("суммы " + (a + b));
        return a + b;
    }
}
