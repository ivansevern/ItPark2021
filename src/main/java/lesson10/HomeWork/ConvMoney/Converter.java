package lesson10.HomeWork.ConvMoney;

import java.util.Scanner;

public class Converter implements RubToUSD, RubToEUR {
    public double rateUSD = 73.74;
    private double rateEUR = 83.24;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void toUSD() {
        System.out.println("Введите сколько конвертировать рублей: ");
        double Rub = scanner.nextDouble();
        double USD = Rub / rateUSD;
        String format = String.format("%.2f", USD);
        System.out.println("Ваши сбережения в долларах: " + format + " $");
    }

    @Override
    public void toEUR() {
        System.out.println("Введите сколько конвертировать рублей: ");
        double Rub = scanner.nextDouble();
        double EUR = Rub / rateEUR;
        String format = String.format("%.2f", EUR);
        System.out.println("Ваши сбережения в евро: " + format + " &");
    }
}